package src.app.relRolFuncionalidad.model;

import src.app.funcionalidad.model.Funcionalidad;
import src.app.rol.model.Rol;

public class RelRolFuncionalidad {
    private Rol codRol;
    private Funcionalidad codFuncionalidad;

    public RelRolFuncionalidad() {
    }

    public RelRolFuncionalidad(Rol codRol, Funcionalidad codFuncionalidad) {
        this.codRol = codRol;
        this.codFuncionalidad = codFuncionalidad;
    }

    public Rol getCodRol() {
        return codRol;
    }

    public void setCodRol(Rol codRol) {
        this.codRol = codRol;
    }

    public Funcionalidad getCodFuncionalidad() {
        return codFuncionalidad;
    }

    public void setCodFuncionalidad(Funcionalidad codFuncionalidad) {
        this.codFuncionalidad = codFuncionalidad;
    }
    
}
