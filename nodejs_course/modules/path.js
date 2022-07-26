const path = require("path");

// just the name of this file
console.log(path.basename(__filename));

// name of the local directory
console.log(path.dirname(__filename));

// just the file extension
console.log(path.extname(__filename));

// create the Path object
console.log(path.parse(__filename));

// join file adress
console.log(path.join(__dirname, 'teste', 'teste.html'))
