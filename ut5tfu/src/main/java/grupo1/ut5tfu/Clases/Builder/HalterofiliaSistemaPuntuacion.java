package grupo1.ut5tfu.Clases.Builder;

import org.xml.sax.HandlerBase;

import grupo1.ut5tfu.Clases.Disciplina;
import grupo1.ut5tfu.Clases.Handler.Handler;
import grupo1.ut5tfu.Clases.Handler.HandlerCoeficiente;
import grupo1.ut5tfu.Clases.Handler.HandlerSuma;

public class HalterofiliaSistemaPuntuacion extends BuilderSistemaPuntuacion {

    public HalterofiliaSistemaPuntuacion() {
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

    @Override
    public double puntuar(int pesoAtleta, double pesoLevantado1, double pesoLevantado2, String genero) {
        Handler h = new HandlerSuma(pesoAtleta);
        h.setNextHandler(new HandlerCoeficiente());
        double puntaje = h.handle(pesoLevantado1, pesoLevantado2, genero);
        System.out.println(puntaje);
        
        return puntaje;
    }

    @Override
    public void puntuar(float dificultad, float ejecucion, float tiempo_vuelo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'puntuar'");
    }

}
