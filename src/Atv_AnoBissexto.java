import java.util.Scanner;

public class Atv_AnoBissexto{
    /**
     * 14. Ano Bissexto: Verifica se um ano é bissexto.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 14: Ano Bissexto ---");
        System.out.print("Digite um ano: ");
        int ano = input.nextInt(); // Lê o ano

        // Regra do ano bissexto:
        // (Divisível por 4 E NÃO por 100) OU (Divisível por 400)
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano " + ano + " é bissexto.");
        } else {
            System.out.println("O ano " + ano + " não é bissexto.");
        }

        // Fecha o scanner
        input.close();
    }
}