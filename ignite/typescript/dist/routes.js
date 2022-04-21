"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.helloWorld = void 0;
const CreateUser_1 = __importDefault(require("./services/CreateUser"));
function helloWorld(request, response) {
    const user = (0, CreateUser_1.default)({
        name: 'Rodrigo',
        email: 'rodrigo@email.com',
        password: '123456',
        techs: [
            'nodejs',
            'react',
            'react native'
        ]
    });
    console.log(user);
    return response.json({ message: 'Hello World TS' });
}
exports.helloWorld = helloWorld;
