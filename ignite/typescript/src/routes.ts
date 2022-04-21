import { Request, Response } from 'express';
import createUser from './services/CreateUser';

export function helloWorld(request: Request, response: Response) {
	const user = createUser({
		name: 'Rodrigo',
		email: 'rodrigo@email.com',
		password: '123456',
		techs: [
			'nodejs',
			'react',
			'react native',
			{title: "Javascript", experience: 100}
		]
	});

	console.log(user);

	return response.json({ message: 'Hello World TS'});
}
