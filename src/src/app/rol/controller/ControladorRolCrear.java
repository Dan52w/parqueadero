package src.app.rol.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.rol.service.ServicioRolCrear;

public class ControladorRolCrear {

    // Instancia única (patrón Singleton)
    private final ServicioRolCrear servicioRolCrear;

    public ControladorRolCrear(ServicioRolCrear servicioRolCrear) {
        this.servicioRolCrear = servicioRolCrear;
    }

    public void llamarGrabarRol(Authenticator.RequestorType req, ResponseCache res) {
        
    }
}
