package src.app.login.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.login.service.ServicioLogin;
import src.app.login.model.Acceso;

public class ControladorLogin {
    private final ServicioLogin servicioLogin;
    
    public ControladorLogin(ServicioLogin servicioLogin) {
        this.servicioLogin = servicioLogin;
    }
    
    public void llamarActualizarRol(Authenticator.RequestorType req, ResponseCache res) {
        System.out.println("Contraseña: " + req.getRequestingScheme());
        String correo = req.getRequestingHost();
        String contrasena = req.getRequestingScheme(); 
        
        Acceso login = new Acceso(0, correo, contrasena, "");
        servicioLogin.hacerLogin(login, res);
    }
