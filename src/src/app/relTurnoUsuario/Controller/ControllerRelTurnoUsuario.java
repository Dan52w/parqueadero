/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package src.app.relTurnoUsuario.Controller;
import java.net.Authenticator;
import java.net.ResponseCache;
import java.util.List;
import src.app.relTurnoUsuario.Service.ServicioRelTurnoUsuario;
import src.app.relTurnoUsuario.model.RelTurnoUsuario;

/**
 *
 * @author alvar
 */
public class ControllerRelTurnoUsuario {
     private final ServicioRelTurnoUsuario servicio;

    public ControllerRelTurnoUsuario(ServicioRelTurnoUsuario servicio) {
        this.servicio = servicio;
    }

    /** 
     * @param req
     * @param res */
    public void llamarCrearRelTurnoUsuario(Authenticator.RequestorType req,
                                            ResponseCache res) {
        // 
        RelTurnoUsuario rel = /* ... */ null;
        RelTurnoUsuario creado = servicio.crear(rel);
        // escribir 'creado' en res
    }

    /** 
     * @param req
     * @param res
     * @return  */
    public List<RelTurnoUsuario> llamarObtenerTodos(Authenticator.RequestorType req,
                                                   ResponseCache res) {
        return servicio.obtenerTodos();
    }

    /** 
     * @param req
     * @param res
     * @return  */
    public RelTurnoUsuario llamarObtenerPorId(Authenticator.RequestorType req,
                                              ResponseCache res) {
        int id = /* extraer parámetro de req */ 0;
        return servicio.obtenerPorId(id);
    }

    /** Actualiza una relación existente
     * @param req
     * @param res */
    public void llamarActualizarRelTurnoUsuario(Authenticator.RequestorType req,
                                                ResponseCache res) {
        int id = /* extraer parámetro de req */ 0;
        RelTurnoUsuario rel = /* parsear cuerpo de req */ null;
        RelTurnoUsuario actualizado = servicio.actualizar(id, rel);
    }

    /** 
     * @param req
     * @param res */
    public void llamarBorrarRelTurnoUsuario(Authenticator.RequestorType req,
                                            ResponseCache res) {
        int id = /* extraer parámetro de req */ 0;
        servicio.borrar(id);
        // 
    }
}
