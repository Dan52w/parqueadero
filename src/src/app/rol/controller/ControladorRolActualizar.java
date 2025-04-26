package src.app.rol.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.rol.service.ServicioRolActualizar;

public class ControladorRolActualizar{
    private final ServicioRolActualizar servicioRolActualizar;

    public ControladorRolActualizar(ServicioRolActualizar servicioRolActualizar) {
        this.servicioRolActualizar = servicioRolActualizar;
    }
    
    public void llamarActualizar(Authenticator.RequestorType req, ResponseCache res) {
        
    }
}
