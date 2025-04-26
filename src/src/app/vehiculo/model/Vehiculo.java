package src.app.vehiculo.model;

import src.app.tipoVehiculo.model.TipoVehiculo;
import src.app.usuario.model.Usuario;

public class Vehiculo {
    private int codVehiculo;
    private TipoVehiculo codTipoVehiculo;
    private Usuario codUsuario;
    private String placa;

    public Vehiculo() {
    }

    public Vehiculo(int codVehiculo, TipoVehiculo codTipoVehiculo, Usuario codUsuario, String placa) {
        this.codVehiculo = codVehiculo;
        this.codTipoVehiculo = codTipoVehiculo;
        this.codUsuario = codUsuario;
        this.placa = placa;
    }

    public int getCodVehiculo() {
        return codVehiculo;
    }

    public void setCodVehiculo(int codVehiculo) {
        this.codVehiculo = codVehiculo;
    }

    public TipoVehiculo getCodTipoVehiculo() {
        return codTipoVehiculo;
    }

    public void setCodTipoVehiculo(TipoVehiculo codTipoVehiculo) {
        this.codTipoVehiculo = codTipoVehiculo;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
