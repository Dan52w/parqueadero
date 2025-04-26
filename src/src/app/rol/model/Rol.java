package src.app.rol.model;

public class Rol {
    private int codRol;
    private String nombreRol;

    public Rol() {
    }

    public Rol(int codRol, String nombreRol) {
        this.codRol = codRol;
        this.nombreRol = nombreRol;
    }

    @Override
    public String toString() {
        return "Rol{" + "codRol=" + codRol + ", nombreRol=" + nombreRol + '}';
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
