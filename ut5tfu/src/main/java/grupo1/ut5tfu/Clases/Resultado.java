package grupo1.ut5tfu.Clases;

import java.util.Date;

public class Resultado {

    private float puntaje;
    private int posicion;
    private String disciplina;
    private String categoria;
    private String equipo;
    private Date fecha;

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }
}
