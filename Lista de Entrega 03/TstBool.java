//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;

public class TstBool {
    // Wrapper: Boolean
    // Método: parseBoolean()
    // Converte uma string em valor booleano.
    // Exemplo: Boolean.parseBoolean("true") retorna true.
    public void parseBoolean() {
        boolean valor = Boolean.parseBoolean("true");
        System.out.println("Valor booleano convertido: " + valor);
    }

    // Wrapper: Boolean
    // Método: compare()
    // Compara dois valores booleanos.
    // Exemplo: Boolean.compare(true, false) retorna 1.
    public void comparebol() {
        int resultado = Boolean.compare(true, false);
        System.out.println("Resultado da comparação: " + resultado);
    }
    // Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Boolean.html
}
