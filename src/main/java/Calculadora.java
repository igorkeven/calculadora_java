public class Calculadora {

    public double soma(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double subtracao(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicacao(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double divisao(double valor1, double valor2) {
        if (valor2 == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero");
        }
        return valor1 / valor2;
    }
}
