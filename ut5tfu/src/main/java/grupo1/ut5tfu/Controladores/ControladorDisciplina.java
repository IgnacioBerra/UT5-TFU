package grupo1.ut5tfu.Controladores;

import grupo1.ut5tfu.Clases.Disciplina;
import grupo1.ut5tfu.Servicios.ServicioDisciplina;
import io.swagger.models.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
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

    @PostMapping("/puntuarHalterofilia")
    public ResponseEntity<Double> puntuarHalterofilia( @RequestParam int cedulaAtleta,
            @RequestParam double peso1, @RequestParam double peso2)
            throws ClassNotFoundException, SQLException {
        return ResponseEntity.ok(servicioDisciplina.puntuarHalterofilia( cedulaAtleta, peso1, peso2));
    }

    @PostMapping("/puntuarTrampolin")
    public ResponseEntity<Float> puntuarTrampolin( @RequestParam int cedulaAtleta, @RequestParam float dificultad, @RequestParam float ejecucion, @RequestParam float tiempo_vuelo)
            throws ClassNotFoundException, SQLException {
        return ResponseEntity.ok(servicioDisciplina.puntuarTrampolin(cedulaAtleta, dificultad, ejecucion, tiempo_vuelo));
    }
}
