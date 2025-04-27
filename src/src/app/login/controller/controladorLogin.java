"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const ServicioLogin_1 = __importDefault(require("../service/ServicioLogin"));
const Acceso_1 = __importDefault(require("../model/Acceso"));
class ControladorLogin extends ServicioLogin_1.default {
    llamarActualizarRol(req, res) {
        console.log("Contraseña: ", req.body.contrasena);
        const login = new Acceso_1.default(0, req.body.correo, req.body.contrasena, "");
        ServicioLogin_1.default.hacerLogin(login, res);
    }
}
const controladorLogin = new ControladorLogin();
exports.default = controladorLogin;
