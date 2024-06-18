package grupo1.ut5tfu.Clases;

public class Login {
    
    private int ci;
    private String password;
    private String JWT;

    public String getJWT() {
        return JWT;
    }

    public void setJWT(int ci, String JWT) {
        this.JWT = JWT;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
