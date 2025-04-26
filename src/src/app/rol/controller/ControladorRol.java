package src.app.rol.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.rol.service.ServicioRol;

public class ControladorRol {
    private final ServicioRol servicioRol;

    public ControladorRol(ServicioRol servicioRol) {
        this.servicioRol = servicioRol;
    }
    public void llamarActualizar(Authenticator.RequestorType req, ResponseCache res) {
        
    }
    public void llamarRolBorrar(Authenticator.RequestorType req, ResponseCache res) {
        
    }
    public void llamarObtenerTodos(Authenticator.RequestorType req, ResponseCache res) {
        
    }
    public void llamarGrabarRol(Authenticator.RequestorType req, ResponseCache res) {
        
    }
}
