"use strict";
exports.__esModule = true;
exports.helloWorld = void 0;
var CreateUser_1 = require("./services/CreateUser");
function helloWorld(request, response) {
    var user = (0, CreateUser_1["default"])({
        name: 'Rodrigo',
        email: 'rodrigo@email.com',
        password: '123456',
        techs: [
            'nodejs',
            'react',
            'react native',
            { title: "Javascript", experience: 100 }
        ]
    });
    console.log(user);
    return response.json({ message: 'Hello World TS' });
}
exports.helloWorld = helloWorld;
