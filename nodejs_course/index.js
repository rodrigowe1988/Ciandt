const { Person } = require("./person");

//require("./modules/path");

require('./modules/fs')
require('./modules/test/http')

const person1 = new Person("Rodrigo");

console.log(person1.sayMyName());
