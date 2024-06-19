package grupo1.ut5tfu.Clases.Handler;

public class HandlerCoeficiente extends Handler {

    public double puntaje;

    public HandlerCoeficiente() {
        this.puntaje = 0;
    }

    @Override
    public double handle(double valor1, double valor2, String genero) {
        if (genero.equals("Masculino")) {
            return handleNext(sinclair(valor1, valor2, 0.722762521, 193.609), 0, genero);
        }
        return handleNext(sinclair(valor1, valor2, 0.787004341, 153.757), 0, genero);
    }

    // Bibliografía:
    // Sinclair Formula. (s. f.). BC Weightlifting Association.
    // https://bcweightlifting.ca/sinclair-formula

    public double sinclair(double valor1, double valor2, double constante1, double constante2) {

        this.puntaje = valor1 * Math.pow(10, constante1 * Math.pow(Math.log10(valor2 / constante2), 2));
        return puntaje;
    }

}