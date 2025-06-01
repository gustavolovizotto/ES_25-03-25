//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
public class TstLong {
    
    // Wrapper: Long
    // Método: compare()
    // Compara dois valores long.
    // Resultado: 0 se iguais, valor negativo se x < y, positivo se x > y.
    // Exemplo: Long.compare(1000L, 2000L) retorna -1.
    public void compareLong() {
        int resultado = Long.compare(1000L, 2000L);
        System.out.println("Resultado da comparação: " + resultado);
    }

    // Wrapper: Long
    // Método: parseLong()
    // Converte uma string em long.
    // Exemplo: Long.parseLong("123456789") retorna 123456789 como long.
    // Se a string não puder ser convertida, lança NumberFormatException.
    public void parseLong() {
        long valor = Long.parseLong("123456789");
        System.out.println("Long convertido: " + valor);
    }
    // Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Long.html
}
