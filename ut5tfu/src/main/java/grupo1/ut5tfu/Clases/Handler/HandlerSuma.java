package grupo1.ut5tfu.Clases.Handler;

public class HandlerSuma extends Handler {

    private double peso = 0.0;

    public HandlerSuma(int pesoCorporal) {
        this.peso = pesoCorporal;
    }

    @Override
    public double handle(double valor1, double valor2, String genero) {
        System.out.println("pasa aca Handler Suma");
        double suma = valor1 + valor2;
        System.out.println("Suma: " + suma);

        return handleNext(suma, this.peso, genero);
    }
}
