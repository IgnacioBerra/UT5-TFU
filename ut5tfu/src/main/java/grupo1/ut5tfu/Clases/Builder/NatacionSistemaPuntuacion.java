package grupo1.ut5tfu.Clases.Builder;

import grupo1.ut5tfu.Clases.Disciplina;

public class NatacionSistemaPuntuacion extends BuilderSistemaPuntuacion{

    public NatacionSistemaPuntuacion(){
        super.sistemaPuntuacion = new SistemaPuntuacion();
    }
    
    @Override
    public void puntuar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puntuar'");
    }

    @Override
    public void puntuar(float dificultad, float ejecucion, float tiempo_vuelo){
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puntuar'");
    }

    @Override
    public void buildDisciplina() {
        Disciplina dis = new Disciplina("NATACION", "100 metros libre");
        sistemaPuntuacion.setDisciplina(dis);
    }

    @Override
    public void buildJueces(String[] jueces) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildJueces'");
    }
    
}