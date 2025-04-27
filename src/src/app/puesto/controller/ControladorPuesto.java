package src.app.puesto.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.puesto.service.ServicioPuesto;

public class ControladorPuesto {
    private final ServicioPuesto servicioPuesto;

    public ControladorPuesto(ServicioPuesto servicioPuesto) {
        this.servicioPuesto = servicioPuesto;
    }

    public void llamarActualizarPuesto(Authenticator.RequestorType req, ResponseCache res) {
    }

    public void llamarBorrarPuesto(Authenticator.RequestorType req, ResponseCache res) {

    }

    public void llamarObtenerTodosPuesto(Authenticator.RequestorType req, ResponseCache res) {

    }

    public void llamarGrabarPuesto(Authenticator.RequestorType req, ResponseCache res) {

    }
}
