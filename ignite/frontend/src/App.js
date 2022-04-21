import React, { useState, useEffect } from "react";
import Header from "./components/Header";
import { api } from "./services/api";

import './App.css';
import backgroundImage from './assets/wallpaper.jpeg';

export default function App() {
	const [courses, setCourses] = useState([]);

	useEffect(() => {
		api.get('courses').then(response => {
			setCourses(response.data);
		})
	}, []);

	async function handleAddCourse() {
		// setCourses([...courses, `Novo curso ${Date.now()}`]);

		const response = await api.post('courses', {
			title: `Novo curso ${Date.now()}`,
			teacher: "Diego Fernandes"
		});

		const course = response.data;

		setCourses([...courses, course]);
	}

	return (
		<>
			<Header title="Courses" />

			<img src={backgroundImage} />

			<ul>
				{courses.map(course => <li key={course.id}>{course.title}</li>)}
			</ul>

			<button type="button" onClick={handleAddCourse}>Adicionar Curso</button>
		</>
	);
}


