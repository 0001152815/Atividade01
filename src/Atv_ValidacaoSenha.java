import java.util.Scanner;

public class Atv_ValidacaoSenha {
    /**
     * 29. Validação de Senha (Critério: 6 caracteres).
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);

        System.out.println("--- Exercício 29: Validação de Senha ---");
        System.out.print("Digite uma senha (mínimo 6 caracteres): ");

        // Lê a linha inteira, permitindo senhas com espaços
        String senha = input.nextLine();

        // .length() retorna o número de caracteres da String
        if (senha.length() >= 6) {
            System.out.println("Senha válida.");
        } else {
            System.out.println("Senha inválida. A senha deve ter pelo menos 6 caracteres.");
        }

        // Fecha o scanner
        input.close();
    }
}