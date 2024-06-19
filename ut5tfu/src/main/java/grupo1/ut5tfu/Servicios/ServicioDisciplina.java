package grupo1.ut5tfu.Servicios;

import grupo1.ut5tfu.Clases.Atleta;
import grupo1.ut5tfu.Clases.Disciplina;
import grupo1.ut5tfu.Clases.Builder.BuilderSistemaPuntuacion;
import grupo1.ut5tfu.Clases.Builder.HalterofiliaSistemaPuntuacion;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ServicioDisciplina {

    private final JdbcTemplate dbConnection;

    @Autowired
    public ServicioDisciplina(JdbcTemplate dbConnection) {
        this.dbConnection = dbConnection;
    }

    public boolean insert(Disciplina disciplina) {
        try {
            String sql = "INSERT INTO Disciplina VALUES (?,?)";
            this.dbConnection.update(sql, disciplina.getNombre(), disciplina.getTipo());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public List<Disciplina> getAll() {
        String sql1 = "SELECT * FROM Disciplina";
        return this.dbConnection.query(sql1, new BeanPropertyRowMapper<>(Disciplina.class));
    }

    public double puntuarDisciplina(String disciplina, double cedula, double peso1, double peso2) {
        double puntaje = 0;
        switch (disciplina) {
            case "Halterofilia":
                String sql1 = "SELECT * FROM Atleta where cedula =" + cedula;

                Atleta atleta = this.dbConnection.query(sql1, new BeanPropertyRowMapper<>(Atleta.class)).get(0);

                System.out.println(atleta.toString());
                BuilderSistemaPuntuacion sistema = new HalterofiliaSistemaPuntuacion();

                puntaje = sistema.puntuar(atleta.getPeso(), peso1, peso2, atleta.getGenero());
                break;

            default:
                break;
        }

        return puntaje;
    }
}
