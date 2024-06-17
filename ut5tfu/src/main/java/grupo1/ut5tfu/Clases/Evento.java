package grupo1.ut5tfu.Clases;

import java.util.Date;

public class Evento {

    private String disciplina;
    private String categoria;
    private Date fecha;
    private String equipo;

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

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }
}
