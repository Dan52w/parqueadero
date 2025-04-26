package src.app.login.model;

import java.util.Date;

public class Ingreso {
    private int codIngreso;
    private int codUsuario;
    private Date fechaIngreso;
    private Date horaIngreso;

    public Ingreso() {
    }

    public Ingreso(int codIngreso, int codUsuario, Date fechaIngreso, Date horaIngreso) {
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

    public int getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(int codUsuario) {
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
