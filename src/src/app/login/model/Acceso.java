package src.app.login.model;

import src.app.usuario.model.Usuario;

public class Acceso {
    private Usuario codUsuario;
    private String correoAcceso;
    private String claveAcceso;
    private String uuidAcceso;

    public Acceso() {
    }

    public Acceso(Usuario codUsuario, String correoAcceso, String claveAcceso, String uuidAcceso) {
        this.codUsuario = codUsuario;
        this.correoAcceso = correoAcceso;
        this.claveAcceso = claveAcceso;
        this.uuidAcceso = uuidAcceso;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
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
