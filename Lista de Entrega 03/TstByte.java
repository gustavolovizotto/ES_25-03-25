//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
public class TstByte {

     // Wrapper: Byte
    // Método: compare()
    // Compara dois valores byte.
    // Resultado: 0 se iguais, valor negativo se x < y, positivo se x > y.
    // Exemplo: Byte.compare((byte) 10, (byte) 20) retorna -1.
    public void compareByte() {
        int resultado = Byte.compare((byte) 10, (byte) 20);
        System.out.println("Resultado da comparação: " + resultado);
    }

    // Wrapper: Byte
    // Método: parseByte()
    // Converte uma string em byte.
    // Exemplo: Byte.parseByte("100") retorna 100 como byte.
    // Se a string não puder ser convertida, lança NumberFormatException.
    // Exemplo: Byte.parseByte("abc") lança NumberFormatException.
    public void parseByte() {
        byte valor = Byte.parseByte("100");
        System.out.println("Byte convertido: " + valor);
    }
    //Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Byte.html
}
