package grupo1.ut5tfu.Clases.Builder;

import grupo1.ut5tfu.Clases.Disciplina;

public abstract class BuilderSistemaPuntuacion {

    protected SistemaPuntuacion sistemaPuntuacion;


    public SistemaPuntuacion getSistemaPuntuacion() { return sistemaPuntuacion; }

    public abstract void puntuar();
    public abstract double puntuar(int peso, double peso1, double peso2, String genero);
    public abstract void buildDisciplina();
    public abstract void buildJueces(String[] jueces);
    public abstract float puntuar(int cedula, float dificultad, float ejecucion, float tiempo_vuelo);
    

}
