package src.app.usuario.model;

import java.util.Date;
import src.app.rol.model.Rol;

public class Usuario {
    private int codUsuario;
    private Rol codRol;
    private String documentoUsuario;
    private String nombresUsuario;
    private String apellidosUsuario;
    private int generoUsuario;
    private Date fechaNacimientoUsuario;
    private String telefonoUsuario;

    public Usuario() {
    }

    public Usuario(int codUsuario, Rol codRol, String documentoUsuario, String nombresUsuario, String apellidosUsuario, int generoUsuario, Date fechaNacimientoUsuario, String telefonoUsuario) {
        this.codUsuario = codUsuario;
        this.codRol = codRol;
        this.documentoUsuario = documentoUsuario;
        this.nombresUsuario = nombresUsuario;
        this.apellidosUsuario = apellidosUsuario;
        this.generoUsuario = generoUsuario;
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
        this.telefonoUsuario = telefonoUsuario;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Rol getCodRol() {
        return codRol;
    }

    public void setCodRol(Rol codRol) {
        this.codRol = codRol;
    }

    public String getDocumentoUsuario() {
        return documentoUsuario;
    }

    public void setDocumentoUsuario(String documentoUsuario) {
        this.documentoUsuario = documentoUsuario;
    }

    public String getNombresUsuario() {
        return nombresUsuario;
    }

    public void setNombresUsuario(String nombresUsuario) {
        this.nombresUsuario = nombresUsuario;
    }

    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    public void setApellidosUsuario(String apellidosUsuario) {
        this.apellidosUsuario = apellidosUsuario;
    }

    public int getGeneroUsuario() {
        return generoUsuario;
    }

    public void setGeneroUsuario(int generoUsuario) {
        this.generoUsuario = generoUsuario;
    }

    public Date getFechaNacimientoUsuario() {
        return fechaNacimientoUsuario;
    }

    public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
        this.fechaNacimientoUsuario = fechaNacimientoUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }
}
