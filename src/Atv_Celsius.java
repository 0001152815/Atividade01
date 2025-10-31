// Importando biblioteca
import java.util.Scanner;

// Nota: Equações das temperaturas:
// F=(C×1,8)+32.
// (32∘F−32)×5/9=0∘C

public class Atv_Celsius {
    public static void main(String[] args) {

        // Declarando variaveis
        Scanner sc = new Scanner(System.in);

        // Obtendo a temperatura
        System.out.println("Qual temperatura voce deseja digitar? (Celsius ou fahrenheit)");
            String temp = sc.nextLine();

        // Convertendo valores
        if (temp.equals("Celsius")){
            System.out.println("Digite o temperatura em celsius");
                double celsius = sc.nextDouble();

            double farenheit = (celsius * 1.8) + 32;

            System.out.println(farenheit);
        }
        else if (temp.equals("Fahrenheit")){
            System.out.println("Digite o temperatura em Fahrenheit");
            double fahrenheit = sc.nextDouble();
            double farenheit = (fahrenheit - 32) * 1.8;
            System.out.println(farenheit);
        }
    }
}
