import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();

        System.out.println("Escolha a operação: soma, subtracao, multiplicacao, divisao");
        String operacao = scanner.next();

        double resultado = 0;
        switch (operacao) {
            case "soma":
                resultado = calculadora.soma(valor1, valor2);
                break;
            case "subtracao":
                resultado = calculadora.subtracao(valor1, valor2);
                break;
            case "multiplicacao":
                resultado = calculadora.multiplicacao(valor1, valor2);
                break;
            case "divisao":
                resultado = calculadora.divisao(valor1, valor2);
                break;
            default:
                System.out.println("Operação inválida");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
