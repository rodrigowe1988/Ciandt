"use strict";
exports.__esModule = true;
var express_1 = require("express");
var routes_1 = require("./routes");
var app = (0, express_1["default"])();
app.get('/', routes_1.helloWorld);
app.listen(3333);
