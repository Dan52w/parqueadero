package src.app.ingresoServicioOtro.model;

import java.util.Date;
import src.app.puesto.model.Puesto;
import src.app.servicioOtro.model.ServicioOtro;

public class IngresoServicioOtro {
    private int codIngresoServicioOtro;
    private ServicioOtro codServicioOtro;
    private Puesto codPuesto;
    private Date fechaIngresoServicioOtro;
    private Date fechaSalidaIngresoServicioOtro;

    public IngresoServicioOtro() {
    }

    public IngresoServicioOtro(int codIngresoServicioOtro, ServicioOtro codServicioOtro, Puesto codPuesto, Date fechaIngresoServicioOtro, Date fechaSalidaIngresoServicioOtro) {
        this.codIngresoServicioOtro = codIngresoServicioOtro;
        this.codServicioOtro = codServicioOtro;
        this.codPuesto = codPuesto;
        this.fechaIngresoServicioOtro = fechaIngresoServicioOtro;
        this.fechaSalidaIngresoServicioOtro = fechaSalidaIngresoServicioOtro;
    }

    public int getCodIngresoServicioOtro() {
        return codIngresoServicioOtro;
    }

    public void setCodIngresoServicioOtro(int codIngresoServicioOtro) {
        this.codIngresoServicioOtro = codIngresoServicioOtro;
    }

    public ServicioOtro getCodServicioOtro() {
        return codServicioOtro;
    }

    public void setCodServicioOtro(ServicioOtro codServicioOtro) {
        this.codServicioOtro = codServicioOtro;
    }

    public Puesto getCodPuesto() {
        return codPuesto;
    }

    public void setCodPuesto(Puesto codPuesto) {
        this.codPuesto = codPuesto;
    }

    public Date getFechaIngresoServicioOtro() {
        return fechaIngresoServicioOtro;
    }

    public void setFechaIngresoServicioOtro(Date fechaIngresoServicioOtro) {
        this.fechaIngresoServicioOtro = fechaIngresoServicioOtro;
    }

    public Date getFechaSalidaIngresoServicioOtro() {
        return fechaSalidaIngresoServicioOtro;
    }

    public void setFechaSalidaIngresoServicioOtro(Date fechaSalidaIngresoServicioOtro) {
        this.fechaSalidaIngresoServicioOtro = fechaSalidaIngresoServicioOtro;
    }
}
