//formas de passar um string para o JS
console.log("string");
console.log(`string`);
console.log(String(11112312312));

//template literals
console.log(`meu teste de
múltiplas linhas
com o JS`);

//Number
console.log(12313);
console.log("123" + 2);
console.log("123" - 2);
console.log(Number("123") + 5);

//Boolean
console.log(true);
console.log(false);

console.log(1 == 2);
console.log(2 == 2);
console.log("1" == 1);
console.log("1" === 1);
console.log(null == undefined);
console.log(null === undefined);

//null e undefined
const x = null;
let y;
console.log(x);
console.log(y);
console.log(typeof x);
console.log(typeof y);

//arrays
const array1 = [1, 2, 3, 4, 5, "teste", y, x];
console.log(array1[3]);
console.log(array1.length);
array1.push(6);
console.log(array1);
array1.forEach((res, index) => {
  console.log(`item: ${res}, index: ${index}`);
});

//object
let tenis = {
  name: "Nike air",
  size: 42,
  color: ["blue, gray"],
  qtd: 3,
};
console.log(tenis);
