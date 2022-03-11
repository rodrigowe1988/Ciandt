//string, boolean, number, ...
let x: number = 10;
let idade: number = 34;

x = 16;

console.log(x);
console.log(`A idade é de ${idade} anos.`)

//inferencia x annotation (duas maneiras de definir tipos)
let y = 28;
let z: number = 12;

//tipos básicos
let firstName: string = "Rodrigo";
let age: number = 30;
const isAdmin: boolean = true;

//String !=  string
console.log(typeof firstName);

firstName = "Rogério";
console.log(firstName);

//object
const myNumbers: number[] = [1, 2, 3];

console.log(myNumbers);
console.log(myNumbers.length);
//console.log(myNumbers.toUpperCase());
console.log(firstName.toUpperCase)
myNumbers.push(4);
console.log(myNumbers);

//tuplas ("molde de como nosso Array deve ficar")
let myTuple: [number, boolean, string];
myTuple = [5, true, "teste"];
//myTuple = [true, "verde", 4];

//object literals -> {prop: value}
const user: {name: string, age: number} = {
    name: "Rogério",
    age: 27
};
console.log(user);

//any -> aceita qualquer tipo
let a: any;
a =  "teste";
a = 33;
a = [];

//union type -> aceita mais de um tipo que você estipulou ao criar a variável
let id: string | number = "10";

id = 200;
// id = true;
// id = [];

//alias -> atribuir um nome à combinação de tipos 
type myIdYype = number | string | boolean

let userId: myIdYype = 12345;
let accessGranted: myIdYype = true;
const palavra: myIdYype = "string";

//enum
//tamanho de roupas (size: Médio, size Pequeno)
enum size {
    P = "Pequeno",
    M = "Médio",
    G = "Grande"
}

const camisa = {
    name: "Camila gola V",
    size: size.G,
}

console.log(camisa)

//literal types -> sua variável somente aceita um único valor para ela
let teste: "autenticado" | null

//teste = "autenticada";
teste = "autenticado";
teste = null;

//funções -> tipar argumentos da função
function sum(a: number, b: number) {
    return a + b;
}
console.log(sum(Number("12"), 13));

//funções -> estipular o tipo de retorno
//retornando uma string
function sayHello(name: string): string {
    return `Hello, ${name}. Welcome!`
}

console.log(sayHello("Rodrigo"));

//void
function logger(msg: string): void {
    console.log(`${msg}`);
}
logger("teste de mensagem")

//passar parâmetros como opcionais
function greetings(name: string, greet?: string): void {
    if(greet) {
        console.log(`Olá ${name}, ${greet}.`);
        return;
    }
    console.log(`Olá ${name}`);
}
greetings("Rodrigo", "boa noite");
greetings("Rogério");

//interfaces
interface MathFunctionParams {
    n1: number,
    n2: number
}
function sumNumbers(nums: MathFunctionParams) {
    return nums.n1 + nums.n2;
}

function multiplyNumbers(nums: MathFunctionParams) {
    return nums.n1 * nums.n2;
}
console.log(sumNumbers({n1: 2, n2: 3}))
console.log(multiplyNumbers({n1: 2, n2: 3}));

//interface com variáveis
const someNumbers: MathFunctionParams = {
    n1: 5,
    n2: 10
}
console.log(sumNumbers(someNumbers))

//narrowing
//checagem de tipos
function doSomething(info: number | boolean){
    if (typeof info === "number") {
        console.log(`O número é ${info}.`);
        return;
    }
    console.log("Não foi passado um número...")
}
console.log(doSomething(333));

//generics 
function showArrayItems<T>(arr: T[]){
    arr.forEach((item) => {
        console.log(`ITEM: ${item}`);
    });
}

const a1 = [1, 2, 3];
const a2 = ["a", "b", "c"];

showArrayItems(a1);
showArrayItems(a2);

//classes
class User {
    name
    role
    isApproved
    age
    
    constructor(name: string, role: string, isApproved: boolean, age: number) {
        this.name = name;
        this.role = role;
        this.isApproved = isApproved;
        this.age = age;
    }

    showUserName(): void {
        console.log(`O nome do usuário é ${this.name}.`)
    }

    showContent() {
        if(this.age >= 18) {
            console.log("O conteúdo está disponível");
            return;
        }
        console.log("Idade menor que 18 anos.")
    }

    
}
const zeca =  new User("Zeca", "Admin", true, 20);
console.log(zeca);
zeca.showUserName();
zeca.showContent();

//interfaces em classes
interface IVehicle {
    brand: string
    showBrand(): void
}

class Car implements IVehicle {
    brand 
    wheels

    constructor(brand: string, wheels: number) {
        this.brand = brand;
        this.wheels = wheels;
    }

    showBrand(): void {
        console.log(`A marca do carro é ${this.brand}.`)
    }
}
const carro1 = new Car("Jeep", 4);
carro1.showBrand();

//herança
class CarSon extends Car {

    engine;

    constructor(brand: string, wheels: number, engine: number) {
        super(brand, wheels)
        this.engine = engine;
    }
}
const carro2 = new CarSon("Lambourghini", 4, 8);
carro2.showBrand();

//decorators

//constructor operator
function BaseParameters() {
    return function <T extends { new (...args: any[]): {}}>(constructor: T) {
        return class extends constructor {
            id = (Math.random() * 100);
            createAt = new Date();
        };
    };
}

@BaseParameters()
class Person {
    name;

    constructor(name: string) {
        this.name = name;
    }
}
const sam = new Person("Sam");
console.log(sam)