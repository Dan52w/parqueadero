package src.app.login.model;

public class Acceso {
    private int codUsuario;
    private String correoAcceso;
    private String claveAcceso;
    private String uuidAcceso;

    public Acceso() {
    }

    public Acceso(int codUsuario, String correoAcceso, String claveAcceso, String uuidAcceso) {
        this.codUsuario = codUsuario;
        this.correoAcceso = correoAcceso;
        this.claveAcceso = claveAcceso;
        this.uuidAcceso = uuidAcceso;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getCorreoAcceso() {
        return correoAcceso;
    }

    public void setCorreoAcceso(String correoAcceso) {
        this.correoAcceso = correoAcceso;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getUuidAcceso() {
        return uuidAcceso;
    }

    public void setUuidAcceso(String uuidAcceso) {
        this.uuidAcceso = uuidAcceso;
    }
}
