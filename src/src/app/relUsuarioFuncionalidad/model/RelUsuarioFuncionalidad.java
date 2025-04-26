package src.app.relUsuarioFuncionalidad.model;

import src.app.funcionalidad.model.Funcionalidad;
import src.app.usuario.model.Usuario;

public class RelUsuarioFuncionalidad {
    private Usuario codUsuario;
    private Funcionalidad codFuncionalidad;
    private int favoritoRelUsuarioFuncionalidad;

    public RelUsuarioFuncionalidad() {
    }

    public RelUsuarioFuncionalidad(Usuario codUsuario, Funcionalidad codFuncionalidad, int favoritoRelUsuarioFuncionalidad) {
        this.codUsuario = codUsuario;
        this.codFuncionalidad = codFuncionalidad;
        this.favoritoRelUsuarioFuncionalidad = favoritoRelUsuarioFuncionalidad;
    }

    public Usuario getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Usuario codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Funcionalidad getCodFuncionalidad() {
        return codFuncionalidad;
    }

    public void setCodFuncionalidad(Funcionalidad codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }

    public int getFavoritoRelUsuarioFuncionalidad() {
        return favoritoRelUsuarioFuncionalidad;
    }

    public void setFavoritoRelUsuarioFuncionalidad(int favoritoRelUsuarioFuncionalidad) {
        this.favoritoRelUsuarioFuncionalidad = favoritoRelUsuarioFuncionalidad;
    }
}
