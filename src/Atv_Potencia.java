import java.util.Scanner;

public class Atv_Potencia {
    /**
     * 21. Potência de um Número (a^b) sem usar Math.pow().
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 21: Potência de um Número ---");
        System.out.print("Digite a base (a): ");
        int a = input.nextInt();
        System.out.print("Digite o expoente (b): ");
        int b = input.nextInt();

        // Usa 'long' para o resultado, para evitar estourar o limite do 'int'
        long resultado = 1;

        // Loop que executa 'b' vezes
        for (int i = 0; i < b; i++) {
            resultado = resultado * a;
        }

        // Se b=0, o loop não executa e o resultado é 1 (correto)

        System.out.println("Resultado de " + a + "^" + b + " é: " + resultado);

        // Fecha o scanner
        input.close();
    }
}