// Importando bibliotecas
import java.util.Scanner;

public class Atv_SomaN {
    public static void main(String[] args) {

        // Declarando variável scanner
        Scanner sc = new Scanner(System.in);

        // Obtendo valor e gerando variáveis

        int soma = 0;

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        // Realizando soma
        for (int i = 1; i <= valor; i++) {
           soma += i;
        }

        System.out.println(soma);

    }
}