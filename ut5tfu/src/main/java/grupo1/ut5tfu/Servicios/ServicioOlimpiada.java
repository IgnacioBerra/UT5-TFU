package grupo1.ut5tfu.Servicios;

import grupo1.ut5tfu.Clases.Olimpiada;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ServicioOlimpiada {

    private final JdbcTemplate dbConnection;

    @Autowired
    public ServicioOlimpiada(JdbcTemplate dbConnection) {
        this.dbConnection = dbConnection;
    }

    public boolean insert(Olimpiada olimpiada) {
        try{
            String sql = "INSERT INTO Olimpiadas VALUES (?,?,?)";
            this.dbConnection.update(sql,olimpiada.getNombre(),olimpiada.getAño(),olimpiada.getUbicacion());
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }

    public List<Olimpiada> getAll() {
        String sql1= "SELECT * FROM Olimpiadas";
        return this.dbConnection.query(sql1, new BeanPropertyRowMapper<>(Olimpiada.class));
    }
}
