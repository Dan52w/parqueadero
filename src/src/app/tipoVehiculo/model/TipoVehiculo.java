package src.app.tipoVehiculo.model;

/**
 *
 * @author ESTUDIANTE
 */
public class TipoVehiculo {
    private int codTipoVehiculo;
    private String claseTipoVehiculo;

    public TipoVehiculo() {
    }

    public TipoVehiculo(int codTipoVehiculo, String claseTipoVehiculo) {
        this.codTipoVehiculo = codTipoVehiculo;
        this.claseTipoVehiculo = claseTipoVehiculo;
    }

    public int getCodTipoVehiculo() {
        return codTipoVehiculo;
    }

    public void setCodTipoVehiculo(int codTipoVehiculo) {
        this.codTipoVehiculo = codTipoVehiculo;
    }

    public String getClaseTipoVehiculo() {
        return claseTipoVehiculo;
    }

    public void setClaseTipoVehiculo(String claseTipoVehiculo) {
        this.claseTipoVehiculo = claseTipoVehiculo;
    }
}
