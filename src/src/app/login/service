"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
const sql_login_query_1 = require("../repository/sql_login_query");
const dbConnection_1 = __importDefault(require("../../../config/connection/dbConnection"));
const sql_usuario_query_1 = require("../../usuario/repository/sql_usuario_query");
const bcryptjs_1 = __importDefault(require("bcryptjs"));
class ServicioLogin {
    static hacerLogin(login, res) {
        return __awaiter(this, void 0, void 0, function* () {
            yield dbConnection_1.default.task((consulta) => __awaiter(this, void 0, void 0, function* () {
                const claveCifrada = bcryptjs_1.default.hashSync(login.contrasena);
                const accesoUsuario = yield consulta.oneOrNone(sql_login_query_1.SQL_LOGIN.VERIFY_USER_EXISTS, [login.correo]);
                console.log("Contraseña base de datos: ", accesoUsuario.claveAcceso);
                console.log("Contraseña del Postman: ", claveCifrada);
                console.log("Constraña front ", login.contrasena);
                const claveCorrecta = bcryptjs_1.default.compareSync(login.contrasena, accesoUsuario.claveAcceso);
                console.log("Clave correcta: ", claveCorrecta);
                if (!accesoUsuario || !claveCorrecta) {
                    return { caso: 2, jsonRespuesta: null };
                }
                const usuarioRegistrado = yield consulta.one(sql_usuario_query_1.SQL_USUARIO.GET_BY_ID, [accesoUsuario.codUsuario]);
                yield consulta.none(sql_login_query_1.SQL_LOGIN.ADD, [
                    accesoUsuario.codUsuario,
                    new Date().toISOString().split('T')[0],
                    new Date().toLocaleTimeString('en-US', { hour12: false })
                ]);
                return {
                    caso: 1,
                    jsonRespuesta: {
                        codUsuario: String(accesoUsuario.codUsuario),
                        Rol: usuarioRegistrado.rolNombre,
                        nombres: usuarioRegistrado.nombresUsuario,
                        apellidos: usuarioRegistrado.apellidosUsuario
                    }
                };
            }))
                .then(({ caso, jsonRespuesta }) => {
                res.status(caso === 1 ? 200 : 401)
                    .json(caso === 1 ? jsonRespuesta : { respuesta: "Credenciales incorrectas" });
            })
                .catch((miError) => {
                console.log(miError);
                res.status(400).json({ respuesta: "Ha ocurrido un error al intentar iniciar sesion" });
            });
        });
    }
}
exports.default = ServicioLogin;
