"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const routes = (0, express_1.Router)();
routes.post('/users', (request, response) => {
    const { name, email } = request.body;
    const user = {
        name,
        email,
    };
    return response.json(user);
});
exports.default = routes;
