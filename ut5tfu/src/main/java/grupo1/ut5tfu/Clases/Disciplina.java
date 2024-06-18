package grupo1.ut5tfu.Clases;

import grupo1.ut5tfu.Clases.Builder.BuilderSistemaPuntuacion;

public class Disciplina {
    private String nombre;
    private String tipo;

    private BuilderSistemaPuntuacion sistemaPuntuacion;

    
    public Disciplina(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo=tipo;
    }

    public void setSistemaPuntuacion(BuilderSistemaPuntuacion sistema){
        this.sistemaPuntuacion = sistema;
    }

    public void puntuar(){
        this.sistemaPuntuacion.puntuar();
    }
}
