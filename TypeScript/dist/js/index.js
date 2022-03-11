"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
let x = 10;
let idade = 34;
x = 16;
console.log(x);
console.log(`A idade é de ${idade} anos.`);
let y = 28;
let z = 12;
let firstName = "Rodrigo";
let age = 30;
const isAdmin = true;
console.log(typeof firstName);
firstName = "Rogério";
console.log(firstName);
const myNumbers = [1, 2, 3];
console.log(myNumbers);
console.log(myNumbers.length);
console.log(firstName.toUpperCase);
myNumbers.push(4);
console.log(myNumbers);
let myTuple;
myTuple = [5, true, "teste"];
const user = {
    name: "Rogério",
    age: 27
};
console.log(user);
let a;
a = "teste";
a = 33;
a = [];
let id = "10";
id = 200;
let userId = 12345;
let accessGranted = true;
const palavra = "string";
var size;
(function (size) {
    size["P"] = "Pequeno";
    size["M"] = "M\u00E9dio";
    size["G"] = "Grande";
})(size || (size = {}));
const camisa = {
    name: "Camila gola V",
    size: size.G,
};
console.log(camisa);
let teste;
teste = "autenticado";
teste = null;
function sum(a, b) {
    return a + b;
}
console.log(sum(Number("12"), 13));
function sayHello(name) {
    return `Hello, ${name}. Welcome!`;
}
console.log(sayHello("Rodrigo"));
function logger(msg) {
    console.log(`${msg}`);
}
logger("teste de mensagem");
function greetings(name, greet) {
    if (greet) {
        console.log(`Olá ${name}, ${greet}.`);
        return;
    }
    console.log(`Olá ${name}`);
}
greetings("Rodrigo", "boa noite");
greetings("Rogério");
function sumNumbers(nums) {
    return nums.n1 + nums.n2;
}
function multiplyNumbers(nums) {
    return nums.n1 * nums.n2;
}
console.log(sumNumbers({ n1: 2, n2: 3 }));
console.log(multiplyNumbers({ n1: 2, n2: 3 }));
const someNumbers = {
    n1: 5,
    n2: 10
};
console.log(sumNumbers(someNumbers));
function doSomething(info) {
    if (typeof info === "number") {
        console.log(`O número é ${info}.`);
        return;
    }
    console.log("Não foi passado um número...");
}
console.log(doSomething(333));
function showArrayItems(arr) {
    arr.forEach((item) => {
        console.log(`ITEM: ${item}`);
    });
}
const a1 = [1, 2, 3];
const a2 = ["a", "b", "c"];
showArrayItems(a1);
showArrayItems(a2);
class User {
    constructor(name, role, isApproved, age) {
        this.name = name;
        this.role = role;
        this.isApproved = isApproved;
        this.age = age;
    }
    showUserName() {
        console.log(`O nome do usuário é ${this.name}.`);
    }
    showContent() {
        if (this.age >= 18) {
            console.log("O conteúdo está disponível");
            return;
        }
        console.log("Idade menor que 18 anos.");
    }
}
const zeca = new User("Zeca", "Admin", true, 20);
console.log(zeca);
zeca.showUserName();
zeca.showContent();
class Car {
    constructor(brand, wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    showBrand() {
        console.log(`A marca do carro é ${this.brand}.`);
    }
}
const carro1 = new Car("Jeep", 4);
carro1.showBrand();
class CarSon extends Car {
    constructor(brand, wheels, engine) {
        super(brand, wheels);
        this.engine = engine;
    }
}
const carro2 = new CarSon("Lambourghini", 4, 8);
carro2.showBrand();
function BaseParameters() {
    return function (constructor) {
        return class extends constructor {
            constructor() {
                super(...arguments);
                this.id = (Math.random() * 100);
                this.createAt = new Date();
            }
        };
    };
}
let Person = class Person {
    constructor(name) {
        this.name = name;
    }
};
Person = __decorate([
    BaseParameters()
], Person);
const sam = new Person("Sam");
console.log(sam);
