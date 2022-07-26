const fs = require("fs");
const path = require("path");

// // create a directory
// fs.mkdir(path.join(__dirname, "/test"), (error) => {
//   if (error) {
//     console.log("Error: ", error);
//     return;
//   }

//   console.log("A new directory was created !");
// });

// create  a file
fs.writeFile(
  path.join(__dirname, "/test", "test.txt"),
  "hello node!",
  (error) => {
    if (error) {
      return console.log("Error : ", error);
    }
	 console.log('A new file was created!')
  }
);

// just add content to a file
fs.appendFile(
  path.join(__dirname, "/test", "test.txt"),
  "\nThis is a nodeJS course!",
  (error) => {
    if (error) {
      return console.log("Error : ", error);
    }
	 console.log('File modified with success')
  }
);

fs.readFile(
  path.join(__dirname, "/test", "test.txt"),
  "utf8",
  (error, data) => {
    if (error) {
      return console.log("Erro: ", error);
    }
	 console.log(data);
  }
);


