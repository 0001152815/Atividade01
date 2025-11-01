import java.util.Scanner;
import java.util.Random; // Importa a classe para gerar números aleatórios

public class Atv_JogoAdivinhacao {
    /**
     * 19. Jogo de Adivinhação: Computador pensa em 1-100, usuário adivinha.
     */
    public static void main(String[] args) {
        // Inicializa o Scanner
        Scanner input = new Scanner(System.in);
        // Cria um objeto gerador de números aleatórios
        Random rand = new Random();

        // rand.nextInt(100) gera de 0 a 99. Somamos 1 para ter de 1 a 100.
        int numeroSecreto = rand.nextInt(100) + 1;

        int palpite;
        int tentativas = 0;

        System.out.println("--- Exercício 19: Jogo de Adivinhação (1-100) ---");
        System.out.println("Eu pensei em um número. Tente adivinhar!");

        // Loop 'do-while' (faça... enquanto)
        do {
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();
            tentativas++; // Incrementa o número de tentativas

            // Dá dicas ao usuário
            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            }

        } while (palpite != numeroSecreto); // Continua o loop ENQUANTO o palpite for DIFERENTE

        // Se saiu do loop, é porque acertou
        System.out.println("Parabéns! Você acertou o número " + numeroSecreto + " em " + tentativas + " tentativas.");

        // Fecha o scanner
        input.close();
    }
}