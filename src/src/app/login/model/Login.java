package src.app.login.model;

public class Login {
    private int codUsuario;
    private String nombreUsuario;
    private int codRol;
    private String nombreRol;

    public Login() {
    }

    public Login(int codUsuario, String nombreUsuario, int codRol, String nombreRol) {
        this.codUsuario = codUsuario;
        this.nombreUsuario = nombreUsuario;
        this.codRol = codRol;
        this.nombreRol = nombreRol;
    }

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getCodRol() {
        return codRol;
    }

    public void setCodRol(int codRol) {
        this.codRol = codRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    
}
