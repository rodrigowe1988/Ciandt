const express = require("express");
const UserModel = require("../src/models/user.model");

const app = express();

app.get("/home", (req, res) => {
  res.status(200).send("<h1>Hello World</h1>");
});

app.get("/users", (req, res) => {
  const users = [
    {
      name: "Jonh Doe",
      email: "john@doe.com",
    },
    {
      name: "Jane Doe",
      email: "jane@doe.com",
    },
  ];
  res.status(200).json(users);
});

app.post("/users", (req, res) => {
  const user = UserModel.create(req.body);

  res.status(201).json(user);
});

const port = 3333;

app.listen(port, () =>
  console.log(`Running with Express framework na porta ${port}`)
);