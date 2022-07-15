let myVariable = 'global1';
const myOtherVariable = 'global2';
myThirdVariable = 'global3';
function myFunction() {
	var myVariable = 'local1';
	return myVariable;
}
function myOtherFunction() {
	let myOtherVariable = 'local2';
	return myOtherVariable;
}
function myThirdFunction() {
	myThirdVariable = 'local3';
	return myThirdVariable;
}


console.log(myVariable);
console.log(myFunction());
console.log(myVariable);
console.log(myOtherVariable);
console.log(myOtherFunction());
console.log(myOtherVariable);
console.log(myThirdVariable)
console.log(myThirdFunction());
console.log(myThirdVariable);
