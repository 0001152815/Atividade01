// Importando biblioteca
import java.util.Scanner;

public class Atv_MediaAluno {
    public static void main(String[] args) {

        // Declarando variável scanner
        Scanner sc = new Scanner(System.in);

        // Obtendo valores e gerando variáveis
        float[] notas = new float[3];

        System.out.println("Digite as 3 notas do aluno e vou te dizer se o aluno esta na média! ");

        for (int i = 0; i < notas.length; i++) {

           System.out.printf("Digite a nota " + (i+1) + ": ");

            notas[i] = sc.nextFloat();
        }

        // Realizando calculo de média
        int media = (int)(notas[0] + notas[1] + notas[2]) / 3;
        if (media >= 7) {
            System.out.println("O aluno esta na media");
        }
        else {
            System.out.println("Ele não esta na media");
        }
    }
}
