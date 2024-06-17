package grupo1.ut5tfu.Controladores;
import grupo1.ut5tfu.Clases.Olimpiada;
import grupo1.ut5tfu.Servicios.ServicioOlimpiada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorOlimpiada {

    @Autowired
    ServicioOlimpiada servicioOlimpiada;

    @PostMapping("/olimpiada")
    public boolean insertOlimpiada(@RequestBody Olimpiada olimpiada) {
        boolean insertion = servicioOlimpiada.insert(olimpiada);
        return insertion;
    }

    @GetMapping("/olimpiada")
    public List<Olimpiada> getOlimpiada() {
        return servicioOlimpiada.getAll();
    }
}
