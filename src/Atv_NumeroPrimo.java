import java.util.Scanner;

public class Atv_NumeroPrimo {
    /**
     * 18. Número Primo: Verifica se um número é primo.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 18: Número Primo ---");
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = input.nextInt();

        // "flag" booleana: assume que é primo até provar o contrário
        boolean ehPrimo = true;

        // 0 e 1 não são primos
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            // Loop otimizado: só precisa testar até a raiz quadrada do número
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                // Se for divisível por qualquer 'i', ele não é primo
                if (numero % i == 0) {
                    ehPrimo = false; // Prova que não é primo
                    break; // Encerra o loop, pois já achamos um divisor
                }
            }
        }

        // Exibe o resultado
        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        // Fecha o scanner
        input.close();
    }
}