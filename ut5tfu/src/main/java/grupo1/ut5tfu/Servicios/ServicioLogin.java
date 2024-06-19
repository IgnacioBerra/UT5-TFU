package grupo1.ut5tfu.Servicios;

import grupo1.ut5tfu.Clases.Disciplina;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

import grupo1.ut5tfu.Clases.Login;

@Service
public class ServicioLogin {

    private final JdbcTemplate dbConnection;

    @Autowired
    public ServicioLogin(JdbcTemplate dbConnection) {
        this.dbConnection = dbConnection;
    }


    public Optional<Login> findById(Integer ci) {
        String sql = "SELECT * FROM Login WHERE ci = ?";
        Optional<Login> login = Optional.ofNullable(dbConnection.queryForObject(sql, new Object[]{ci}, new BeanPropertyRowMapper<>(Login.class)));
        return login;
    }

    public void setJWT(Integer ci, String jwt) {
        String sql = "UPDATE Login SET JWT = ? WHERE ci = ?";
        dbConnection.update(sql, jwt, ci);
    }

    public Object getContrasenia(Integer ci) {
        String sql = "SELECT contrasenia FROM Login WHERE ci = ?";
        return dbConnection.queryForObject(sql, new Object[]{ci}, String.class);
    }
    
}
