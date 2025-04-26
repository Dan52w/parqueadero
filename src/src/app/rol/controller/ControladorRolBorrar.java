package src.app.rol.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.rol.service.ServicioRolBorrar;

public class ControladorRolBorrar {
    private final ServicioRolBorrar servicioRolBorrar;

    public ControladorRolBorrar(ServicioRolBorrar servicioRolBorrar) {
        this.servicioRolBorrar = servicioRolBorrar;
    }
    
    public void llamarRolBorrar(Authenticator.RequestorType req, ResponseCache res) {
        
    }
}
