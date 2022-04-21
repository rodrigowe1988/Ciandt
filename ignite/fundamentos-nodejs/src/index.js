const express = require("express");
const cors = require('cors');
const { uuid, isUuid } = require('uuidv4');

const app = express();
app.use(cors());
app.use(express.json());

const cursos = [];

function logRequests(request, response, next) {
	const { method, url } = request;

	const logLabel = `[${method.toUpperCase()}] ${url}`;

	console.log(logLabel);

	return next();
}

function validateProjectId(request, response, next) {
    const { id } = request.params;

    if (!isUuid(id)) {
        return response.status(400).json({error: "Isn't a valid ID."});
    }
    return next();
}

app.use('/courses/:id', validateProjectId);
app.use(logRequests);

app.get('/courses', logRequests, (req, res) => {
	const { title } = req.query;

	const results = title
	? cursos.filter(curso => curso.title.includes(title))
	: cursos;

	return res.json(results);
})

app.post("/courses", (req, res) => {
    const { title, teacher } = req.body;

    const curso = { id: uuid(), title, teacher };

    cursos.push(curso);

    return res.json(curso);

});

app.delete("/courses/:id", (req, res) => {
    const { id } = req.params;

    const cursoIndex = cursos.findIndex(curso => curso.id === id);

    if(cursoIndex < 0) {
        return res.status(400).json({error: "Project not found!"})
    }

    cursos.splice(cursoIndex, 1);

    return res.status(204).send();
})

app.put("/courses/:id", (req, res) => {
    const { id } = req.params;
    const { title, teacher } = req.body;

    const cursoIndex = cursos.findIndex(curso => curso.id === id);

    if(cursoIndex < 0) {
        return res.status(400).json({error: "Project not found!"})
    }

    const curso = {
        id,
        title,
        teacher
    };

    cursos[cursoIndex] = curso;

    return res.json(curso);
})

app.patch("/courses/:id", (req, res) => {
    return res.json(["Curso 1", "Curso 2", "Curso 3", "Curso 4"]);
})

app.listen(3333);
