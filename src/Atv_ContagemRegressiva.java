import java.util.Scanner;

public class Atv_ContagemRegressiva {
    /**
     * 24. Contagem Regressiva de N até 0.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 24: Contagem Regressiva ---");
        System.out.print("Iniciar contagem a partir de: ");
        int n = input.nextInt();

        // Loop 'for' decrescente, de 'n' até 0
        for (int i = n; i >= 0; i--) {
            System.out.print(i + "... ");
        }
        System.out.println("\nLançar!"); // '\n' pula uma linha

        // Fecha o scanner
        input.close();
    }
}
