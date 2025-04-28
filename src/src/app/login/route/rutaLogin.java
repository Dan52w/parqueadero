package src.app.login.route;

import java.util.List;
import src.app.login.model.Login;
import src.app.login.controller.ControladorLogin;
import src.config.domain.ValidatorLogin;
import src.middleware.Validar;

public class RutaLogin {
    private ControladorLogin controladorLogin;

    public RutaLogin() {
        this.controladorLogin = new ControladorLogin();
    }    
    public Login login(Login loginDTO) {
        // Aquí iría la lógica equivalente a los middleware ValidatorLogin y Validar.datos
        if (ValidatorLogin.validarDatosLogin(loginDTO) && Validar.datos(loginDTO)) {
            return controladorLogin.llamarActualizarRol(loginDTO);
        }
        return null;
    }
}
