import java.util.Scanner;

public class Atv_SomaNumerosPares {
    /**
     * 25. Soma de todos os números pares de 1 até N.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 25: Soma de Números Pares ---");
        System.out.print("Calcular soma dos pares de 1 até: ");
        int n = input.nextInt();

        int soma = 0; // "Acumulador"

        // Itera de 1 até N
        for (int i = 1; i <= n; i++) {
            // Se 'i' for par...
            if (i % 2 == 0) {
                soma += i; // ...adiciona 'i' à soma
            }
        }
        System.out.println("A soma dos pares de 1 até " + n + " é: " + soma);

        // Fecha o scanner
        input.close();
    }
}