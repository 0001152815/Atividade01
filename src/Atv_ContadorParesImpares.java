import java.util.Scanner;

public class Atv_ContadorParesImpares {
    /**
     * 16. Contador de Pares e Ímpares: Lê 10 números e conta.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        // Variáveis "contadoras"
        int totalPares = 0;
        int totalImpares = 0;

        System.out.println("--- Exercício 16: Pares e Ímpares ---");
        System.out.println("Digite 10 números inteiros:");

        // Loop 'for' que executa 10 vezes
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = input.nextInt();

            // Se o resto da divisão por 2 for 0, é par
            if (num % 2 == 0) {
                totalPares++; // Incrementa o contador de pares
            } else {
                totalImpares++; // Incrementa o contador de ímpares
            }
        }

        // Exibe os resultados
        System.out.println("Total de números pares: " + totalPares);
        System.out.println("Total de números ímpares: " + totalImpares);

        // Fecha o scanner
        input.close();
    }
}