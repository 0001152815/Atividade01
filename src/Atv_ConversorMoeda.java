import java.util.Scanner;

public class Atv_ConversorMoeda {
    /**
     * 20. Conversor de Moeda (Reais para Dólar).
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        // 'final' cria uma constante
        final double TAXA_DOLAR = 5.25; // Define a taxa de câmbio

        System.out.println("--- Exercício 20: Conversor de Moeda ---");
        System.out.println("Cotação atual: R$ " + TAXA_DOLAR);

        System.out.print("Digite o valor em Reais (R$): ");
        double reais = input.nextDouble();

        // Cálculo da conversão
        double dolares = reais / TAXA_DOLAR;

        // System.out.printf() formata a saída
        // "%.2f" = "formate um número de ponto flutuante com 2 casas decimais"
        System.out.printf("R$ %.2f equivalem a US$ %.2f\n", reais, dolares);

        // Fecha o scanner
        input.close();
    }
}