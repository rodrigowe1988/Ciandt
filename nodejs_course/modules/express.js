const express = require("express");
const UserModel = require("../src/models/user.model");

const app = express();
app.use(express.json());

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

app.post("/users", async (req, res) => {
  try {
    const user = await UserModel.create(req.body);

    res.status(201).json(user);
  } catch (error) {
    res.status(500).send(error.message);
  }
});

const port = 3333;

app.listen(port, () =>
  console.log(`Running with Express framework na porta ${port}`)
);
