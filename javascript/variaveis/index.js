//variáveis
/*
 *var -> uso global
 *let -> ele é gerado dentro de um escopo
 *const -> ele é gerado dentro de um escopo mas não podemos alterar seu valor
 */

function sum(x, y) {
  return x + y;
}

let number1 = 34;
let number2 = 42;
console.log(sum(number1, number2));
const constant = 55;
console.log(constant);
