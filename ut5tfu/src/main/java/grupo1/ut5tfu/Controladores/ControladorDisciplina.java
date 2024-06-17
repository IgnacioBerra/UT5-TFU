package grupo1.ut5tfu.Controladores;
import grupo1.ut5tfu.Clases.Disciplina;
import grupo1.ut5tfu.Servicios.ServicioDisciplina;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControladorDisciplina {

    @Autowired
    ServicioDisciplina servicioDisciplina;

    @PostMapping("/disciplina")
    public boolean insertDisciplina(@RequestBody Disciplina disciplina) {
        boolean insertion = servicioDisciplina.insert(disciplina);
        return insertion;
    }

    @GetMapping("/disciplina")
    public List<Disciplina> getOlimpiada() {
        return servicioDisciplina.getAll();
    }
}
