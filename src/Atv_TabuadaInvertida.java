import java.util.Scanner;

public class Atv_TabuadaInvertida {
    /**
     * 15. Tabuada Invertida: Mostra a tabuada de 10 até 1.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 15: Tabuada Invertida ---");
        System.out.print("Digite um número para a tabuada: ");
        int numero = input.nextInt();

        System.out.println("Tabuada invertida do " + numero + ":");
        // Loop 'for' que começa em 10 e vai decrementando (i--)
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o scanner
        input.close();
    }
}