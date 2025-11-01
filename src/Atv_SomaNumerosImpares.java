import java.util.Scanner;

public class Atv_SomaNumerosImpares {
    /**
     * 26. Soma de todos os números ímpares de 1 até N.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 26: Soma de Números Ímpares ---");
        System.out.print("Calcular soma dos ímpares de 1 até: ");
        int n = input.nextInt();

        int soma = 0; // "Acumulador"

        // Itera de 1 até N
        for (int i = 1; i <= n; i++) {
            // Se 'i' NÃO for par (resto diferente de 0), é ímpar
            if (i % 2 != 0) {
                soma += i; // ...adiciona 'i' à soma
            }
        }
        System.out.println("A soma dos ímpares de 1 até " + n + " é: " + soma);

        // Fecha o scanner
        input.close();
    }
}