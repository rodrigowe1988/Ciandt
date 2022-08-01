//const { Person } = require("./person");
const dotenv = require("dotenv");
const connectToDatabase = require("./src/database/connect");

dotenv.config();

connectToDatabase();

//require("./modules/path");

//require("./modules/fs");
//require("./modules/http");

require("./modules/express");

//const person1 = new Person("Rodrigo");

//console.log(person1.sayMyName());
