const mongo = require("");
const { default: mongoose } = require("mongoose");

const connectToDatabase = async () => {
  await mongoose.connect(
    "// mongodb+srv://teste_mongodb:<testando123>@nodejs-course.0lzoytn.mongodb.net/?retryWrites=true&w=majority",
    (error) => {
      if (error) {
        return console.log("An error has ocurred with the database: ", error);
      }

      return console.log("The connection with database has been succeed");
    }
  );
};

module.exports = connectToDatabase;
