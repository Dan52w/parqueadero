package src.app.funcionalidad.model;

public class Funcionalidad {
    private int codFuncionalidad;
    private int codPadreFuncionalidad;
    private String nombreFuncionalidad;
    private String urlFuncionalidad;

    public Funcionalidad() {
    }

    public Funcionalidad(int codFuncionalidad, int codPadreFuncionalidad, String nombreFuncionalidad, String urlFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
        this.codPadreFuncionalidad = codPadreFuncionalidad;
        this.nombreFuncionalidad = nombreFuncionalidad;
        this.urlFuncionalidad = urlFuncionalidad;
    }

    public int getCodFuncionalidad() {
        return codFuncionalidad;
    }

    public void setCodFuncionalidad(int codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }

    public int getCodPadreFuncionalidad() {
        return codPadreFuncionalidad;
    }

    public void setCodPadreFuncionalidad(int codPadreFuncionalidad) {
        this.codPadreFuncionalidad = codPadreFuncionalidad;
    }

    public String getNombreFuncionalidad() {
        return nombreFuncionalidad;
    }

    public void setNombreFuncionalidad(String nombreFuncionalidad) {
        this.nombreFuncionalidad = nombreFuncionalidad;
    }

    public String getUrlFuncionalidad() {
        return urlFuncionalidad;
    }

    public void setUrlFuncionalidad(String urlFuncionalidad) {
        this.urlFuncionalidad = urlFuncionalidad;
    }
}
