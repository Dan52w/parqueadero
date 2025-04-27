"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const express_1 = require("express");
const ControladorLogin_1 = __importDefault(require("../controller/ControladorLogin"));
const ValidatorLogin_1 = require("../../../config/domain/ValidatorLogin");
const Validar_1 = __importDefault(require("../../../middleware/Validar"));
class RutaLogin {
    constructor() {
        this.rutaLoginApi = (0, express_1.Router)();
        this.rutaLoginApi.post("/login", ValidatorLogin_1.datosLoginCrear, Validar_1.default.datos, ControladorLogin_1.default.llamarActualizarRol);
    }
}
const rutaLogin = new RutaLogin();
exports.default = rutaLogin.rutaLoginApi;
