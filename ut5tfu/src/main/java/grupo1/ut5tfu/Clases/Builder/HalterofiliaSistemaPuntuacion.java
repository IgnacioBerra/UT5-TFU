package grupo1.ut5tfu.Clases.Builder;

import grupo1.ut5tfu.Clases.Disciplina;

public class HalterofiliaSistemaPuntuacion extends BuilderSistemaPuntuacion  {


    public HalterofiliaSistemaPuntuacion(){
        super.sistemaPuntuacion = new SistemaPuntuacion();
    }

    @Override
    public void puntuar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puntuar'");
    }

     @Override
    public void buildDisciplina() {
        Disciplina dis = new Disciplina("HALTEROFILIA", "halterofilia");
        sistemaPuntuacion.setDisciplina(dis);
    }

    @Override
    public void buildJueces(String[] jueces) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buildJueces'");
    }
    
}
