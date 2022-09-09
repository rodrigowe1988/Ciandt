//IMC
console.log(Math.pow(2, 2))

const peso = 84.5
const altura = 1.76

let imc = peso / Math.pow(altura, 2)

console.log(`Seu IMC é de ${imc.toFixed(2)}.`)

if (imc < 17) {
  console.log('Muito abaixo do peso!')
} else if(imc >= 17 && imc < 18.5) {
  console.log('Muito abaixo do peso!')
} else if (imc >= 18.5 && imc < 25) {
  console.log('Peso normal')
} else if (imc >= 25 && imc < 30) {
  console.log('Acima do peso')
} else if (imc >= 30 && imc < 35) {
  console.log('Obesidade I')
} else if (imc >= 35 && imc < 40) {
  console.log('Obesidade II')
}

//tabuada
const valor = 1;

for (let i= 1; i<=10; i++) {
  console.log(`${valor} X ${i} = ${valor * i}`);
}

//letras repetidas
const nomeCompleto = 'Rodrigo Weber'.toLowerCase().replaceAll(" ", "");
let letras = {}


for (let i=0; i < nomeCompleto.length; i++) {
  if (letras[nomeCompleto[i]]) {
    letras[nomeCompleto[i]]++;
  } else {
    letras[nomeCompleto[i]] = 1;
  }
}
console.log(nomeCompleto)
console.log(letras);