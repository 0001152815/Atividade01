import java.util.Scanner;

public class Atv_NumeroPerfeito {
    /**
     * 27. Número Perfeito: Verifica se a soma dos divisores é igual ao número.
     * (Ex: 6 -> Divisores: 1, 2, 3. Soma = 6. É perfeito.)
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 27: Número Perfeito ---");
        System.out.print("Digite um número para verificar se é perfeito: ");
        int numero = input.nextInt();

        int somaDivisores = 0; // Acumulador para a soma

        // Loop otimizado: Itera só até a metade do número
        for (int i = 1; i <= numero / 2; i++) {
            // Se 'i' é um divisor...
            if (numero % i == 0) {
                somaDivisores += i; // ...adiciona à soma
            }
        }

        // Verifica se a soma dos divisores é igual ao próprio número
        if (somaDivisores == numero && numero > 0) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        // Fecha o scanner
        input.close();
    }
}