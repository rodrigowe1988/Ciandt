// if/else
let number = 0;
if (number === 0) {
  console.log("o número é zero");
} else if (number < 0) {
  console.log("o número é negativo");
} else {
  console.log("o número é positivo");
}

//falsy e truthy
//falsy -> false, 0, '', Nan, undefined e null
//truthy -> qualquer outro
if (1) {
  console.log("teste de truthy");
} else {
  console.log("teste de falsy");
}
if (0) {
  console.log("teste de truthy");
} else {
  console.log("teste de falsy");
}

//operador ternário
const velocidade = 75;
const warn = 85;

const condicao =
  velocidade >= warn
    ? console.log("Recebeu multa!")
    : console.log("Velocidade permitida.");

//switch case
const mes = 13;
switch (mes) {
  case 1:
    console.log("janeiro");
    break;
  case 2:
    console.log("fevereiro");
    break;
  case 3:
    console.log("março");
    break;
  case 4:
    console.log("abril");
    break;
  case 5:
    console.log("maio");
    break;
  case 6:
    console.log("junho");
    break;
  case 7:
    console.log("julho");
    break;
  case 8:
    console.log("agosto");
    break;
  case 9:
    console.log("setembro");
    break;
  case 10:
    console.log("outubro");
    break;
  case 11:
    console.log("novembro");
    break;
  case 12:
    console.log("dezembro");
    break;
  default:
    console.log("Não é um mês válido");
    break;
}
