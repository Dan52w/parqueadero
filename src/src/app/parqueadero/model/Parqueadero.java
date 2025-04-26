package src.app.parqueadero.model;

import src.app.ubicacion.model.Ubicacion;

public class Parqueadero {
    private int codParqueadero;
    private Ubicacion codUbicacion;
    private String nombreParqueader;
    private String direccionParqueadero;
    private String telefonoParqueadero;

    public Parqueadero() {
    }

    public Parqueadero(int codParqueadero, Ubicacion codUbicacion, String nombreParqueader, String direccionParqueadero, String telefonoParqueadero) {
        this.codParqueadero = codParqueadero;
        this.codUbicacion = codUbicacion;
        this.nombreParqueader = nombreParqueader;
        this.direccionParqueadero = direccionParqueadero;
        this.telefonoParqueadero = telefonoParqueadero;
    }

    public int getCodParqueadero() {
        return codParqueadero;
    }

    public void setCodParqueadero(int codParqueadero) {
        this.codParqueadero = codParqueadero;
    }

    public Ubicacion getCodUbicacion() {
        return codUbicacion;
    }

    public void setCodUbicacion(Ubicacion codUbicacion) {
        this.codUbicacion = codUbicacion;
    }

    public String getNombreParqueader() {
        return nombreParqueader;
    }

    public void setNombreParqueader(String nombreParqueader) {
        this.nombreParqueader = nombreParqueader;
    }

    public String getDireccionParqueadero() {
        return direccionParqueadero;
    }

    public void setDireccionParqueadero(String direccionParqueadero) {
        this.direccionParqueadero = direccionParqueadero;
    }

    public String getTelefonoParqueadero() {
        return telefonoParqueadero;
    }

    public void setTelefonoParqueadero(String telefonoParqueadero) {
        this.telefonoParqueadero = telefonoParqueadero;
    }
}
