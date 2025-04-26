package src.app.tarifaDiaria.model;

import src.app.parqueadero.model.Parqueadero;
import src.app.tipoVehiculo.model.TipoVehiculo;

public class TarifaDiaria {
    private Parqueadero codParqueadero;
    private TipoVehiculo codTipoVehiculo;
    private float valorTarifaDiaria;

    public TarifaDiaria() {
    }

    public TarifaDiaria(Parqueadero codParqueadero, TipoVehiculo codTipoVehiculo, float valorTarifaDiaria) {
        this.codParqueadero = codParqueadero;
        this.codTipoVehiculo = codTipoVehiculo;
        this.valorTarifaDiaria = valorTarifaDiaria;
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

    public float getValorTarifaDiaria() {
        return valorTarifaDiaria;
    }

    public void setValorTarifaDiaria(float valorTarifaDiaria) {
        this.valorTarifaDiaria = valorTarifaDiaria;
    }
}
