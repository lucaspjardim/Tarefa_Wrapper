/**
 *
 * @author Lucas Jardim
 */
public class Main {

    /**
     * O método main é o ponto de entrada do programa. Ele demonstra a utilização de uma
     * variável primitiva e sua conversão automática para o tipo wrapper.
     *
     * @param args Argumentos de linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        // Valor já definido em uma variável primitiva
        int numeroPrimitivo = 42;

        // Imprime o valor armazenado na variável primitiva
        System.out.println("Valor primitivo: " + numeroPrimitivo);

        // Converte automaticamente para o tipo wrapper correspondente (Integer)
        Integer numeroWrapper = numeroPrimitivo; // Autoboxing

        // Imprime o valor armazenado na variável wrapper
        System.out.println("Valor wrapper: " + numeroWrapper);
    }
}
