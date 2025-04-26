package src.app.ubicacion.model;

public class Ubicacion {
    private int codUbicacion;
    private int codPadreUbicacion;
    private String externoUbicacion;
    private String nombreUbicacion;

    public Ubicacion() {
    }

    public Ubicacion(int codUbicacion, int codPadreUbicacion, String externoUbicacion, String nombreUbicacion) {
        this.codUbicacion = codUbicacion;
        this.codPadreUbicacion = codPadreUbicacion;
        this.externoUbicacion = externoUbicacion;
        this.nombreUbicacion = nombreUbicacion;
    }

    public int getCodUbicacion() {
        return codUbicacion;
    }

    public void setCodUbicacion(int codUbicacion) {
        this.codUbicacion = codUbicacion;
    }

    public int getCodPadreUbicacion() {
        return codPadreUbicacion;
    }

    public void setCodPadreUbicacion(int codPadreUbicacion) {
        this.codPadreUbicacion = codPadreUbicacion;
    }

    public String getExternoUbicacion() {
        return externoUbicacion;
    }

    public void setExternoUbicacion(String externoUbicacion) {
        this.externoUbicacion = externoUbicacion;
    }

    public String getNombreUbicacion() {
        return nombreUbicacion;
    }

    public void setNombreUbicacion(String nombreUbicacion) {
        this.nombreUbicacion = nombreUbicacion;
    }
    
    
}
