package src.app.servicioDiario.model;

import java.util.Date;
import src.app.parqueadero.model.Parqueadero;
import src.app.puesto.model.Puesto;
import src.app.vehiculo.model.Vehiculo;

public class ServicioDiario {
    private int codServicioDiario;
    private Parqueadero codParqueadero;
    private Puesto codPuesto;
    private Vehiculo codVehiculo;
    private Date fechaInicioServicioDiario;
    private Date fechaFinServicioDiario;
    private float valorServicioDiario;

    public ServicioDiario() {
    }

    public ServicioDiario(int codServicioDiario, Parqueadero codParqueadero, Puesto codPuesto, Vehiculo codVehiculo, Date fechaInicioServicioDiario, Date fechaFinServicioDiario, float valorServicioDiario) {
        this.codServicioDiario = codServicioDiario;
        this.codParqueadero = codParqueadero;
        this.codPuesto = codPuesto;
        this.codVehiculo = codVehiculo;
        this.fechaInicioServicioDiario = fechaInicioServicioDiario;
        this.fechaFinServicioDiario = fechaFinServicioDiario;
        this.valorServicioDiario = valorServicioDiario;
    }

    public int getCodServicioDiario() {
        return codServicioDiario;
    }

    public void setCodServicioDiario(int codServicioDiario) {
        this.codServicioDiario = codServicioDiario;
    }

    public Parqueadero getCodParqueadero() {
        return codParqueadero;
    }

    public void setCodParqueadero(Parqueadero codParqueadero) {
        this.codParqueadero = codParqueadero;
    }

    public Puesto getCodPuesto() {
        return codPuesto;
    }

    public void setCodPuesto(Puesto codPuesto) {
        this.codPuesto = codPuesto;
    }

    public Vehiculo getCodVehiculo() {
        return codVehiculo;
    }

    public void setCodVehiculo(Vehiculo codVehiculo) {
        this.codVehiculo = codVehiculo;
    }

    public Date getFechaInicioServicioDiario() {
        return fechaInicioServicioDiario;
    }

    public void setFechaInicioServicioDiario(Date fechaInicioServicioDiario) {
        this.fechaInicioServicioDiario = fechaInicioServicioDiario;
    }

    public Date getFechaFinServicioDiario() {
        return fechaFinServicioDiario;
    }

    public void setFechaFinServicioDiario(Date fechaFinServicioDiario) {
        this.fechaFinServicioDiario = fechaFinServicioDiario;
    }

    public float getValorServicioDiario() {
        return valorServicioDiario;
    }

    public void setValorServicioDiario(float valorServicioDiario) {
        this.valorServicioDiario = valorServicioDiario;
    }
}
