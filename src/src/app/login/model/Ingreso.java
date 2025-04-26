package src.app.login.model;

import java.util.Date;
import src.app.usuario.model.Usuario;

public class Ingreso {
    private int codIngreso;
    private Usuario codUsuario;
    private Date fechaIngreso;
    private Date horaIngreso;

    public Ingreso() {
    }

    public Ingreso(int codIngreso, Usuario codUsuario, Date fechaIngreso, Date horaIngreso) {
        this.codIngreso = codIngreso;
        this.codUsuario = codUsuario;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
    }

    public int getCodIngreso() {
        return codIngreso;
    }

    public void setCodIngreso(int codIngreso) {
        this.codIngreso = codIngreso;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
}
