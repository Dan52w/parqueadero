package src.app.tipoVehiculo.controller;

import java.net.Authenticator;
import java.net.ResponseCache;
import src.app.tipoVehiculo.service.ServicioTipoVehiculo;

public class ControladorTipoVehiculo {
    private final ServicioTipoVehiculo servicioTipoVehiculo;

    public ControladorTipoVehiculo(ServicioTipoVehiculo servicioTipoVehiculo) {
        this.servicioTipoVehiculo = servicioTipoVehiculo;
    }

    public void llamarActualizarTipoVehiculo(Authenticator.RequestorType req, ResponseCache res) {

    }

    public void llamarBorrarTipoVehiculo(Authenticator.RequestorType req, ResponseCache res) {

    }

    public void llamarObtenerTodosTipoVehiculo(Authenticator.RequestorType req, ResponseCache res) {

    }

    public void llamarGrabarTipoVehiculo(Authenticator.RequestorType req, ResponseCache res) {

    }
}
