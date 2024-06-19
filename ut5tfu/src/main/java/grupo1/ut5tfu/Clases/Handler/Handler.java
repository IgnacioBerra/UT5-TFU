package grupo1.ut5tfu.Clases.Handler;

public abstract class Handler {

    private Handler next;

    public Handler setNextHandler(Handler next){
        this.next = next;
        return next;
    }

    public abstract double handle(double valor1, double valor2, String genero);

    protected double handleNext(double valor1, double valor2, String genero){
        if(next == null){
            return valor1;
        }
        return next.handle(valor1, valor2, genero);
    }
}
