package src.app.servicioOtro.model;

import java.util.Date;
import src.app.parqueadero.model.Parqueadero;
import src.app.vehiculo.model.Vehiculo;

public class ServicioOtro {
    private int codServicioOtro;
    private Parqueadero codParqueadero;
    private Vehiculo codVehiculo;
    private Date fechaPagoServicoOtro;
    private Date fechaInicioServicioOtro;
    private Date fechaFinServicioOtro;
    private float valorServicioOtro;

    public ServicioOtro() {
    }

    public ServicioOtro(int codServicioOtro, Parqueadero codParqueadero, Vehiculo codVehiculo, Date fechaPagoServicoOtro, Date fechaInicioServicioOtro, Date fechaFinServicioOtro, float valorServicioOtro) {
        this.codServicioOtro = codServicioOtro;
        this.codParqueadero = codParqueadero;
        this.codVehiculo = codVehiculo;
        this.fechaPagoServicoOtro = fechaPagoServicoOtro;
        this.fechaInicioServicioOtro = fechaInicioServicioOtro;
        this.fechaFinServicioOtro = fechaFinServicioOtro;
        this.valorServicioOtro = valorServicioOtro;
    }

    public int getCodServicioOtro() {
        return codServicioOtro;
    }

    public void setCodServicioOtro(int codServicioOtro) {
        this.codServicioOtro = codServicioOtro;
    }

    public Parqueadero getCodParqueadero() {
        return codParqueadero;
    }

    public void setCodParqueadero(Parqueadero codParqueadero) {
        this.codParqueadero = codParqueadero;
    }

    public Vehiculo getCodVehiculo() {
        return codVehiculo;
    }

    public void setCodVehiculo(Vehiculo codVehiculo) {
        this.codVehiculo = codVehiculo;
    }

    public Date getFechaPagoServicoOtro() {
        return fechaPagoServicoOtro;
    }

    public void setFechaPagoServicoOtro(Date fechaPagoServicoOtro) {
        this.fechaPagoServicoOtro = fechaPagoServicoOtro;
    }

    public Date getFechaInicioServicioOtro() {
        return fechaInicioServicioOtro;
    }

    public void setFechaInicioServicioOtro(Date fechaInicioServicioOtro) {
        this.fechaInicioServicioOtro = fechaInicioServicioOtro;
    }

    public Date getFechaFinServicioOtro() {
        return fechaFinServicioOtro;
    }

    public void setFechaFinServicioOtro(Date fechaFinServicioOtro) {
        this.fechaFinServicioOtro = fechaFinServicioOtro;
    }

    public float getValorServicioOtro() {
        return valorServicioOtro;
    }

    public void setValorServicioOtro(float valorServicioOtro) {
        this.valorServicioOtro = valorServicioOtro;
    }
    
}
