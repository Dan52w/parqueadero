package src.app.relTurnoUsuario.model;

import src.app.turno.model.Turno;
import src.app.usuario.model.Usuario;

public class RelTurnoUsuario {
    private int codTurnoUsuario;
    private Turno codTurno;
    private Usuario codUsuario;

    public RelTurnoUsuario() {
    }

    public RelTurnoUsuario(int codTurnoUsuario, Turno codTurno, Usuario codUsuario) {
        this.codTurnoUsuario = codTurnoUsuario;
        this.codTurno = codTurno;
        this.codUsuario = codUsuario;
    }

    public int getCodTurnoUsuario() {
        return codTurnoUsuario;
    }

    public void setCodTurnoUsuario(int codTurnoUsuario) {
        this.codTurnoUsuario = codTurnoUsuario;
    }

    public Turno getCodTurno() {
        return codTurno;
    }

    public void setCodTurno(Turno codTurno) {
        this.codTurno = codTurno;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Object getTurno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
