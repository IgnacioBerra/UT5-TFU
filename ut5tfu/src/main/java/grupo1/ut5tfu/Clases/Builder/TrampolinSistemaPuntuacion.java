package grupo1.ut5tfu.Clases.Builder;

import grupo1.ut5tfu.Clases.Disciplina;

public class TrampolinSistemaPuntuacion extends BuilderSistemaPuntuacion {

    public TrampolinSistemaPuntuacion() {
        super.sistemaPuntuacion = new SistemaPuntuacion();
    }

    @Override
    public void puntuar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puntuar'");
    }

    @Override
    public void puntuar(float dificultad, float ejecucion, float tiempo_vuelo){
        
    }

    
    @Override
    public void buildDisciplina() {
        Disciplina dis = new Disciplina("SURF", "libre");
        sistemaPuntuacion.setDisciplina(dis);
    }

    @Override
    public void buildJueces(String[] jueces) {
        sistemaPuntuacion.setJueces(jueces);
    }

    @Override
    public double puntuar(int peso, double peso1, double peso2, String genero) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puntuar'");
    }

}
