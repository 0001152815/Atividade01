import java.util.Scanner;

public class Atv_Fatorial {
    /**
     * 22. Fatorial de um Número (n!).
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 22: Fatorial de um Número ---");
        System.out.print("Digite um número para o fatorial: ");
        int n = input.nextInt();

        // Usa 'long' pois fatoriais crescem MUITO rápido
        long resultado = 1;

        if (n < 0) {
            System.out.println("Fatorial não definido para números negativos.");
        } else {
            // Loop de 1 até n (ex: 5! = 1*2*3*4*5)
            for (int i = 1; i <= n; i++) {
                resultado = resultado * i;
            }
            // (Se n=0, o loop não roda e o resultado é 1, que é o correto)
            System.out.println("Fatorial de " + n + " é: " + resultado);
        }

        // Fecha o scanner
        input.close();
    }
}