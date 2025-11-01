import java.util.Scanner;

public class Atv_MaiorMenorN {
    /**
     * 30. Maior e Menor de N Números.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 30: Maior e Menor de N Números ---");
        System.out.print("Quantos números você deseja digitar? ");
        int n = input.nextInt();

        // Se o usuário digitar 0 ou menos, não há o que fazer.
        if (n <= 0) {
            System.out.println("Quantidade inválida.");
        } else {
            // 1. Lê o *primeiro* número ANTES do loop
            System.out.print("Digite o 1º número: ");
            int primeiroNumero = input.nextInt();

            // 2. Inicializa 'maior' e 'menor' com o valor desse primeiro número.
            int maior = primeiroNumero;
            int menor = primeiroNumero;

            // 3. O loop agora começa do *segundo* número (i=1)
            for (int i = 1; i < n; i++) {
                System.out.print("Digite o " + (i + 1) + "º número: ");
                int num = input.nextInt();

                // 4. Compara o novo número com os recordes atuais
                if (num > maior) {
                    maior = num; // Achamos um novo recorde de 'maior'
                }
                if (num < menor) {
                    menor = num; // Achamos um novo recorde de 'menor'
                }
            }

            // 5. Exibe os resultados finais
            System.out.println("O maior número digitado foi: " + maior);
            System.out.println("O menor número digitado foi: " + menor);
        }

        // Fecha o scanner
        input.close();
    }
}