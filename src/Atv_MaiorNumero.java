import java.util.Scanner;
import java.util.Arrays; // Útil para imprimir o array

public class Atv_MaiorNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Um array para guardar 3 números inteiros
        int[] numeros = new int[3];

        // Obtendo valores
        System.out.println("Digite 3 valores inteiros e vou dizer qual deles é o maior! ");

        // Criando loop para verificar valores
        for (int i = 0; i < 3; i++) {

            // Mensagem para cada número
            System.out.print("Digite o " + (i + 1) + "º número: ");

            // ---Usar sc.nextInt() para ler um inteiro ---
            numeros[i] = sc.nextInt();
        }

        // --- Encontrar o maior número ---

        int maiorNumero = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maiorNumero) {

                maiorNumero = numeros[i];
            }
        }

        // Imprime o resultado
        System.out.println("Os números digitados foram: " + Arrays.toString(numeros));
        System.out.println("O maior número é: " + maiorNumero);

        sc.close();
    }
}