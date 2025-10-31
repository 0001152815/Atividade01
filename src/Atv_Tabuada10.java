// Importando biblioteca
import java.util.Scanner;

public class Atv_Tabuada10 {
    public static void main(String[] args) {

        // Declarando variavel scanner
            Scanner sc = new Scanner(System.in);

        // Obtendo numero
        System.out.println("Digite o valor que o senhor deseja: ");
            int num = Integer.parseInt(sc.nextLine());

        // Ciclo for para calcular
        for (int i = 1; i <= 10; i++) {

            // 4. Calcular o resultado da sua fórmula
            int resultado = (num * i);

            System.out.printf("Para i = %2d | %d + %2d + (%d * %2d) = %d\n", i, num, i, num, i, resultado);
        }
    }
}
