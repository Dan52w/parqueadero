package src.app.login.model;

import src.app.rol.model.Rol;
import src.app.usuario.model.Usuario;

public class Login {
    private Usuario codUsuario;
    private String nombreUsuario;
    private Rol codRol;
    private String nombreRol;

    public Login() {
    }

    public Login(Usuario codUsuario, String nombreUsuario, Rol codRol, String nombreRol) {
        this.codUsuario = codUsuario;
        this.nombreUsuario = nombreUsuario;
        this.codRol = codRol;
        this.nombreRol = nombreRol;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Rol getCodRol() {
        return codRol;
    }

    public void setCodRol(Rol codRol) {
        this.codRol = codRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    
}
