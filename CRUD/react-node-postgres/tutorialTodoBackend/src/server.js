const express = require('express');

const app = express();

app.use(express.json());

app.get('/health', (request, response) => {
	return response.json('up');
});

app.listen(3333, () => {
	console.log('Server is running in 3333 port...')
})
