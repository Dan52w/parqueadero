package src.app.vehiculo.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.vehiculo.service.ServicioVehiculo;

public class ControladorVehiculo {
    private final ServicioVehiculo servicioVehiculo;

    public ControladorVehiculo(ServicioVehiculo servicioVehiculo) {
        this.servicioVehiculo = servicioVehiculo;
    }

    public void llamarActualizarVehiculo(Authenticator.RequestorType req, ResponseCache res) {

    }

    public void llamarBorrarVehiculo(Authenticator.RequestorType req, ResponseCache res) {

    }

    public void llamarObtenerTodosVehiculos(Authenticator.RequestorType req, ResponseCache res) {

    }

    public void llamarGrabarVehiculo(Authenticator.RequestorType req, ResponseCache res) {

    }
}