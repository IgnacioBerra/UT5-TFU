package grupo1.ut5tfu.Servicios;

import grupo1.ut5tfu.Clases.Disciplina;
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
        try{
            String sql = "INSERT INTO Disciplina VALUES (?,?)";
            this.dbConnection.update(sql,disciplina.getNombre(),disciplina.getTipo());
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public List<Disciplina> getAll() {
        String sql1= "SELECT * FROM Disciplina";
        return this.dbConnection.query(sql1, new BeanPropertyRowMapper<>(Disciplina.class));
    }
}
