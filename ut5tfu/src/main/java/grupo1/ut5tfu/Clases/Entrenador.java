package grupo1.ut5tfu.Clases;

public class Entrenador {
    private int cedula;
    private String nombre;
    private int edad;
    private String disciplina;
    private String categoria;
    private String pais;

    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {this.cedula = cedula;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {this.edad=edad;}

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
