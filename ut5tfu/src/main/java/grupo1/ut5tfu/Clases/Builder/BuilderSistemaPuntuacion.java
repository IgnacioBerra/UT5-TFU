package grupo1.ut5tfu.Clases.Builder;

import grupo1.ut5tfu.Clases.Disciplina;

public abstract class BuilderSistemaPuntuacion {

    protected SistemaPuntuacion sistemaPuntuacion;


    public SistemaPuntuacion getSistemaPuntuacion() { return sistemaPuntuacion; }

    public abstract void puntuar();
    public abstract void puntuar(float dificultad, float ejecucion, float tiempo_vuelo);
    public abstract void buildDisciplina();
    public abstract void buildJueces(String[] jueces);
    

}