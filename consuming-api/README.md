# Consumir uma API

## API

- [x] Iniciar o projeto:
	* npm init -y

- [x] Instalar as dependências
	* npm i express nodemon cors axios

- [x] Criar uma rota para acessar a API -> arquivo **server.js**
- [x] Servir a API
	```js
		const express = require('express');
		const app = express();

		app.get('/', (req, res) => {
			return res.json([
				{name: 'rodrigo'},
				{name: 'rogerio'}
			]);
		})

		app.listen('4567');

	```
- [x] Habilitar o CORS
	```js

		const cors = require('cors');
		const express = require('express');
		const app = express();

		app.use(cors())

		app.get('/', (req, res) => {
			return res.json([
				{name: 'rodrigo'},
				{name: 'rogerio'}
			]);
		})

		app.listen('4567');

	```
- [x] Habilitar o nodemon para reiniciar o server
	```json
	{
		"name": "consuming-api",
		"version": "1.0.0",
		"description": "",
		"main": "index.js",
		"scripts": {
			"test": "echo \"Error: no test specified\" && exit 1",
			"start": "nodemon server.js"

		},
		"keywords": [],
		"author": "",
		"license": "ISC",
		"dependencies": {
			"axios": "^0.26.1",
			"cors": "^2.8.5",
			"express": "^4.17.3",
			"nodemon": "^2.0.15"
		}
	}

	```


## Frontend
Consumir API

- [x] Utilizar fetch para consumir nossa API backend -> usamos o **async/await**
- [x] Explicar Promise - Async/await
	* pegamos a resposta e a salvamos dentro de uma variável chamada response, para uso posterior

	```js

	<script>

		async function getContent() {
			try {
				const response = await fetch('http://localhost:4567/');
			} catch (error) {
				console.error(error);
			}
		}

	</script>

	```
- [X] Usar try/catch
- [X] Mostrar a resposta na tela
	```js

	<script>

		async function getContent() {
			try {
				const response = await fetch('http://localhost:4567/');
				const data = await response.json();
				show(data);
			} catch (error) {
				console.log(error);
			}
		}
		getContent();

		function show(users) {
			let output = '';

			for (let user of users) {
				output += `<li>${user.name}</li>`;
			}
			document.querySelector('main').innerHTML = output;
		}
	</script>

	```

## Backend

- [x] jsonplaceholder -> https://jsonplaceholder.typicode.com/users
- [x] Usar AXIOS -> **server.js**
	```js

		const axios = require('axios');

	```
- [] Semelhanças entre AXIOS e FETCH
	```js
		const cors = require('cors');
		const express = require('express');
		const app = express();
		const axios = require('axios');

		app.use(cors())

		app.get('/', async(req, res) => {

			//response é a resposta do axios mas tiramos o data de dentro do response
			const { data } = await axios('https://jsonplaceholder.typicode.com/users');
			console.log(data);

			return res.json([
				{name: 'rodrigo'},
				{name: 'rogerio'}
			]);
		})

		app.listen('4567');


	```
- [x] Usar o try/catch para boas práticas de programação
