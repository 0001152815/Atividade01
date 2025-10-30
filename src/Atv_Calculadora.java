import java.util.Scanner;
public class Atv_Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Obtendo dados
        System.out.print("Digite o primeiro valor:");
            int elemento1 = Integer.parseInt(sc.nextLine());
        System.out.print("Digite o segundo valor:");
            int elemento2 = Integer.parseInt(sc.nextLine());
        System.out.print("Qual a operacao?(Multi, soma, div, sub)");
            String operacao = sc.nextLine();



        // Declarando operações
        int soma = elemento1 + elemento2;
        int subtracao = elemento1 + elemento2;
        int multi = elemento1 * elemento2;
        int divisao = elemento1 / elemento2;

        // Escolhendo operação
        if (operacao == "soma") {
            System.out.print(soma);
        }
        else if (operacao == "Multi") {
            System.out.print(multi);
        }
        else if (operacao == "div") {
            System.out.print(divisao);
        }
        else {
            System.out.print(subtracao);
        }



    }
}