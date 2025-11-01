
public class Atv_TabuadaCompleta {
    /**
     * 28. Tabuada Completa: Mostra a tabuada do 1 ao 10.
     */
    public static void main(String[] args) {
        System.out.println("--- Exercício 28: Tabuada Completa (1 a 10) ---");

        // "Loop Aninhado" (um loop dentro do outro)

        // Loop externo: Controla qual tabuada (do 1 ao 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println("--- Tabuada do " + i + " ---");

            // Loop interno: Controla o multiplicador (do 1 ao 10)
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            // Pula uma linha em branco para separar as tabuadas
            System.out.println();
        }
    }
}