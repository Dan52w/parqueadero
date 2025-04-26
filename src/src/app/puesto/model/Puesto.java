package src.app.puesto.model;

import src.app.parqueadero.model.Parqueadero;
import src.app.tipoVehiculo.model.TipoVehiculo;

public class Puesto {
    private int codPuesto;
    private Parqueadero codParqueadero;
    private TipoVehiculo codTipoVehiculo;
    private String detallePuesto;

    public Puesto() {
    }

    public int getCodPuesto() {
        return codPuesto;
    }

    public void setCodPuesto(int codPuesto) {
        this.codPuesto = codPuesto;
    }

    public Parqueadero getCodParqueadero() {
        return codParqueadero;
    }

    public void setCodParqueadero(Parqueadero codParqueadero) {
        this.codParqueadero = codParqueadero;
    }

    public TipoVehiculo getCodTipoVehiculo() {
        return codTipoVehiculo;
    }

    public void setCodTipoVehiculo(TipoVehiculo codTipoVehiculo) {
        this.codTipoVehiculo = codTipoVehiculo;
    }

    public String getDetallePuesto() {
        return detallePuesto;
    }

    public void setDetallePuesto(String detallePuesto) {
        this.detallePuesto = detallePuesto;
    }
}
