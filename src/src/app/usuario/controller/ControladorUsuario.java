package src.app.usuario.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import java.util.List;
import src.app.usuario.model.Usuario;
import src.app.usuario.service.ServicioUsuario;

public class ControladorUsuario {
    private final ServicioUsuario servicioUsuario;

    public ControladorUsuario(ServicioUsuario servicioUsuario) {
        this.servicioUsuario = servicioUsuario;
    }
    public static void llamarActualizarUsuario(Authenticator.RequestorType req, ResponseCache res){
        
    }
    public static void llamarBorrarUsuario(Authenticator.RequestorType req, ResponseCache res){
        
    }
    public static List<Usuario> llamarObtenerTodo(Authenticator.RequestorType req, ResponseCache res) {
        return null;
    }
    public static List<Usuario> llamarConsutalNombre(Authenticator.RequestorType req, ResponseCache res) {
        return null;
    }
    public void llamarCrearUsuario(Authenticator.RequestorType req, ResponseCache res){
        
    }
}
