package src.app.rol.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.rol.service.ServicioRolConsulta;

public class ControladorRolConsulta {
    private final ServicioRolConsulta servicioRolConsulta;

    public ControladorRolConsulta(ServicioRolConsulta servicioRolConsulta) {
        this.servicioRolConsulta = servicioRolConsulta;
    }
    
    public void llamarObtenerTodos(Authenticator.RequestorType req, ResponseCache res) {
        
    }
}
