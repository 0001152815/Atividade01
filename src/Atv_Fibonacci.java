import java.util.Scanner;

public class Atv_Fibonacci {
    /**
     * 23. Mostra os N primeiros números da Sequência de Fibonacci.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 23: Sequência de Fibonacci ---");
        System.out.print("Quantos números da sequência você quer ver? ");
        int n = input.nextInt();

        System.out.println("Os " + n + " primeiros números de Fibonacci:");

        // Define os dois primeiros termos da sequência
        int t1 = 0;
        int t2 = 1;

        // Loop que executa 'n' vezes
        for (int i = 1; i <= n; i++) {
            System.out.print(t1 + " "); // 1. Imprime o termo atual (t1)

            // 2. Prepara os próximos termos
            int soma = t1 + t2; // Calcula o próximo termo
            t1 = t2;           // O segundo termo vira o primeiro
            t2 = soma;         // O novo termo vira o segundo
        }
        System.out.println(); // Pula linha no final

        // Fecha o scanner
        input.close();
    }
}