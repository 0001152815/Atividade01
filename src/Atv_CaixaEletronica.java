import java.util.Scanner;

public class Atv_CaixaEletronica {
    /**
     * 17. Simulação de Caixa Eletrônico: Calcula as notas para um saque.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 17: Caixa Eletrônico ---");
        System.out.print("Digite o valor para sacar (R$): ");
        int valor = input.nextInt();

        System.out.println("Distribuindo as notas:");

        // Pega a quantidade de notas de 100
        int n100 = valor / 100;
        // Pega o RESTO do valor para o próximo cálculo
        valor %= 100; // (valor = valor % 100)

        int n50 = valor / 50;
        valor %= 50;

        int n20 = valor / 20;
        valor %= 20;

        int n10 = valor / 10;
        valor %= 10;

        int n5 = valor / 5;
        valor %= 5;

        // Só exibe se a quantidade de notas for maior que 0
        if (n100 > 0) System.out.println(n100 + " nota(s) de R$ 100");
        if (n50 > 0) System.out.println(n50 + " nota(s) de R$ 50");
        if (n20 > 0) System.out.println(n20 + " nota(s) de R$ 20");
        if (n10 > 0) System.out.println(n10 + " nota(s) de R$ 10");
        if (n5 > 0) System.out.println(n5 + " nota(s) de R$ 5");

        // Se 'valor' ainda for > 0, é o troco que não pode ser sacado
        if (valor > 0) System.out.println("Sobrou R$ " + valor + " (não é possível sacar).");

        // Fecha o scanner
        input.close();
    }
}