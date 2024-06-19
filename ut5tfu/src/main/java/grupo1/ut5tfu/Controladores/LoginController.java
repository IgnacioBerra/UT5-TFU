package grupo1.ut5tfu.Controladores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import grupo1.ut5tfu.Clases.Login;
import grupo1.ut5tfu.Servicios.ServicioLogin;
import grupo1.ut5tfu.Utils.JWTUtils;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ServicioLogin servicioLogin;

    private String hashMD5(String input) {
        return org.apache.commons.codec.digest.DigestUtils.md5Hex(input);
    }

    @PostMapping("/find/{ci}")
    public ResponseEntity<?> findById(@PathVariable Integer ci, @RequestBody Map<String, String> body) {
        String contrasenia = body.get("contrasenia");
        String hashedPass = hashMD5(contrasenia);
        Optional<Login> loginOptional = servicioLogin.findById(ci);
        if (loginOptional.isPresent()) {
            Login login = loginOptional.get();
            if (servicioLogin.getContrasenia(ci).equals(hashedPass)) {
                Login loginObj = new Login();
                loginObj.setCi(login.getCi());
                loginObj.setPassword(hashedPass);
                String jwt = JWTUtils.getInstance().generarJWT(loginObj.getCi(), loginObj.getPassword());
                servicioLogin.setJWT(ci, jwt);
                return ResponseEntity.ok("{\"token\": \"" + jwt + "\"}");
            } else {
                return ResponseEntity.badRequest().body("Contraseña incorrecta: " + contrasenia + "    actual: " + servicioLogin.getContrasenia(ci) + "    hashed: " + hashedPass);
            }
        }

        return ResponseEntity.badRequest().body("No existe login con esa cedula");
    }

    @PostMapping("/register")
    public ResponseEntity<?> save(@RequestBody Map<String, String> body) throws URISyntaxException {
        // Validar los campos requeridos 
        return ResponseEntity.created(new URI("/login/register")).build();
    }
}