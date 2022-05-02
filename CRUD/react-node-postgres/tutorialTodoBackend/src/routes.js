const express = require('express');

const allTodos = [];
const todosRoutes = express.Router();

//Create
todosRoutes.post('/todos', (request, response) => {
	const { name } = request.body;
	allTodos.push({ name, status: false});
	return response.status(201).json(allTodos);
});

//Read
todosRoutes.get('/todos', (request, response) => {
	return response.status(200).json(allTodos);
})

//Update


//Delete
