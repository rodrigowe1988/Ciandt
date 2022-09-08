//adicao
console.log(1 + 1);
console.log(25 + -3232);
console.log("Rodrigo " + "Weber");
console.log("12" + 3);

//subtração
console.log(1 - 1);
console.log("250" - 76);

//multiplicação e divisão
console.log(5 * 3);
console.log(5 / 2);

console.log(5 % 3);
console.log(4 % 2);

//atribuição
let a = 1;
let b = 3;
console.log(a);
console.log(a + b);

let c = (a += 1);
let d = (a *= 2);
let e = (a -= 3);
let f = (a /= 1.5);

//comparação
console.log(1 == 1);
console.log(1 === 1);
console.log(1 == "1");
console.log(1 === "1");
console.log(1 != 2);
console.log(3 >= 2);
console.log("3" < 1);

//comparadores lógicos
console.log(1 === 1 && 2 >= 3);
console.log(3 < 4 || 4 == 3);
console.log(!(1 + 1 == 2));
console.log(!true);
console.log(!false);

//precedência
console.log((15 * 20) / 10);
console.log(15 * (20 / 10));

console.log((15 * (20 / 10)) / 10 == 3 || 10 * 10 == 14);
