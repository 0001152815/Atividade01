// Importando bibliotecas
import java.util.Scanner;

public class Atv_VerificarIdade {
    public static void main(String[] args) {

        // Declarando a variável scanner
        Scanner sc = new Scanner(System.in);

        // Obtendo idade
        System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();

        // Verificando idade do usuário
        if (idade <= 14) {
            System.out.println("Você é criança.");
        }

        else if (idade < 18) {
            System.out.println("Você é adolescente.");
        }

        else if (idade < 60) {
            System.out.println("Você é adulto.");
        }

        else {
            System.out.println("Você é idoso.");
        }

        sc.close();
    }
}
