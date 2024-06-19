package grupo1.ut5tfu.Utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.Key;
import java.util.Date;
import javax.crypto.spec.SecretKeySpec;


public class JWTUtils {

    // Instancia única de la clase
    private static final JWTUtils INSTANCE = new JWTUtils();

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private JWTUtils() {
    }

    // Método público y estático que devuelve la instancia única
    public static JWTUtils getInstance() {
        return INSTANCE;
    }

    private static final Key SECRET_KEY = new SecretKeySpec("ASDFASDFASDFASDFASDFASDFASDFASDF".getBytes(), SignatureAlgorithm.HS256.getJcaName()); 

    public String generarJWT(Integer ci, String contrasenia) {
        long ahorams = System.currentTimeMillis();
        Date ahora = new Date(ahorams);

        long vencimientoms = ahorams + 5 * 24 * 60 * 60 * 1000; // 5 dias en milisegundos
        Date vencimiento = new Date(vencimientoms);

        return Jwts.builder()
                .claim("ci", ci)
                .claim("contrasenia", contrasenia)
                .setIssuedAt(ahora)
                .setExpiration(vencimiento)
                .signWith(SECRET_KEY)
                .compact();
    }

    public Claims validarJWT(String jwt) {
        try {
            // Parsear el token JWT usando parserBuilder
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(jwt)
                    .getBody();

            // Validar las reclamaciones del token (por ejemplo, verificar fecha de expiración)
            Date expiration = claims.getExpiration();
            if (expiration.before(new Date())) {
                throw new Exception("Token expirado");
            }

            // Devolver las reclamaciones
            return claims;
        } catch (SecurityException e) {
            throw new RuntimeException("Firma JWT inválida", e);
        } catch (Exception e) {
            throw new RuntimeException("Token JWT inválido", e);
        }
    }

}
