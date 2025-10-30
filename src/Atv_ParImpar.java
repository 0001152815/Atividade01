// Importando bibliotecas
import java.util.Scanner;

public class Atv_ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Obtendo valor
        System.out.print("Digite um valor e eu vou dizer se é par ou impar: ");
        int num = Integer.parseInt(sc.nextLine());

        // Obtendo resultado se é par ou impar
        if (num % 2 > 0) {
            System.out.print("Seu número é impar");
        }
        else {
            System.out.print("Seu número é par");
        }
    }
}
