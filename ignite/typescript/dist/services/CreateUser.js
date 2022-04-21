"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
function createUser({ name, email, password, techs }) {
    const user = {
        name,
        email,
        password,
        techs
    };
    return user;
}
exports.default = createUser;
