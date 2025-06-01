//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
public class TstShort {

    // Wrapper: Short
    // Método: compare()
    // Compara dois valores short.
    // Resultado: 0 se iguais, valor negativo se x < y, positivo se x > y.
    // Exemplo: Short.compare((short) 5, (short) 3) retorna 1.

    public void compareShort() {
        int resultado = Short.compare((short) 5, (short) 3);
        System.out.println("Resultado da comparação: " + resultado);
    }

    // Wrapper: Short
    // Método: parseShort()
    // Converte uma string em short.
    // Exemplo: Short.parseShort("50") retorna 50 como short.
    // Se a string não puder ser convertida, lança NumberFormatException.
    public void parseShort() {
        short valor = Short.parseShort("50");
        System.out.println("Short convertido: " + valor);
    }
    //Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Short.html
}
