const mongoose = require("mongoose");

const connectToDatabase = async () => {
  await mongoose.connect(
    `mongodb+srv://${process.env.MONGODB_USERNAME}:${process.env.MONGODB_PASSWORD}@nodejs-course.0lzoytn.mongodb.net/database?retryWrites=true&w=majority
	 `,
    (error) => {
      if (error) {
        return console.log(
          "An error has ocurred: ",
          error
        );
      }

      return console.log("Conection with database has been succeed!");
    }
  );
};

module.exports = connectToDatabase;



//mongodb+srv://${process.env.MONGODB_USERNAME}:${process.env.MONGODB_PASSWORD}@nodejs-course.0lzoytn.mongodb.net/?retryWrites=true&w=majority
