"use strict";
exports.__esModule = true;
function createUser(_a) {
    var name = _a.name, email = _a.email, password = _a.password, techs = _a.techs;
    var user = {
        name: name,
        email: email,
        password: password,
        techs: techs
    };
    return user;
}
exports["default"] = createUser;
