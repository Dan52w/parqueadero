package src.app.turno.model;

import java.util.Date;
import src.app.parqueadero.model.Parqueadero;

public class Turno {
    private int codTurno;
    private Parqueadero codParqueadero;
    private String descripcionTurno;
    private Date fechaTurno;
    private Date horaInicioTurno;
    private Date horaFinTurno;

    public Turno() {
    }

    public Turno(int codTurno, Parqueadero codParqueadero, String descripcionTurno, Date fechaTurno, Date horaInicioTurno, Date horaFinTurno) {
        this.codTurno = codTurno;
        this.codParqueadero = codParqueadero;
        this.descripcionTurno = descripcionTurno;
        this.fechaTurno = fechaTurno;
        this.horaInicioTurno = horaInicioTurno;
        this.horaFinTurno = horaFinTurno;
    }

    public int getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(int codTurno) {
        this.codTurno = codTurno;
    }

    public Parqueadero getCodParqueadero() {
        return codParqueadero;
    }

    public void setCodParqueadero(Parqueadero codParqueadero) {
        this.codParqueadero = codParqueadero;
    }

    public String getDescripcionTurno() {
        return descripcionTurno;
    }

    public void setDescripcionTurno(String descripcionTurno) {
        this.descripcionTurno = descripcionTurno;
    }

    public Date getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(Date fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public Date getHoraInicioTurno() {
        return horaInicioTurno;
    }

    public void setHoraInicioTurno(Date horaInicioTurno) {
        this.horaInicioTurno = horaInicioTurno;
    }

    public Date getHoraFinTurno() {
        return horaFinTurno;
    }

    public void setHoraFinTurno(Date horaFinTurno) {
        this.horaFinTurno = horaFinTurno;
    }
    
}
