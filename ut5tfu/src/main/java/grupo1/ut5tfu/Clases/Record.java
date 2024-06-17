package grupo1.ut5tfu.Clases;

import java.util.Date;

public class Record {
    private int id_record;
    private Date fecha;
    private float puntaje;
    private String equipo;
    private int atleta_ci;

    public void setId_record(int id_record) {
        this.id_record = id_record;
    }

    public int getId_record() {
        return id_record;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setPuntaje(float puntaje) {
        this.puntaje = puntaje;
    }

    public float getPuntaje() {
        return puntaje;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setAtleta_ci(int atleta_ci) {
        this.atleta_ci = atleta_ci;
    }

    public int getAtleta_ci() {
        return atleta_ci;
    }
}
