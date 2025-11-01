// Importando biblioteca
import java.util.Scanner;

public class Atv_NumPostivoNegativo {
    public static void main(String[] args) {

        // Declarando variável scanner
        Scanner input = new Scanner(System.in);

        // Declarando variável
        System.out.print("Informe o valor que deseja: ");

        // Armazenando em uma variável
        int num = input.nextInt();

        // Checando sinal do número
        if (num > 0){
            System.out.println("Seu número é positivo!");
        }
        else if (num < 0){
            System.out.println("Seu número é negativo!");
        }
        else{
            System.out.println("Seu número é 0!");
        }
    }
}
