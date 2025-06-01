//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;

public class TstInt {
    // Wrapper: Integer
    // Método: Compare 
    // Compara dois valores inteiros.
    //Resultado: 0 se iguais, valor negativo se x < y, positivo se x > y.

    public void compareInt() {
        int resultado = Integer.compare(10, 20);
        System.out.println("Resultado da comparação entre 10 e 20: " + resultado);
    }

    public void parseInt() {
        // Wrapper: Integer
        // Método: ParseInt 
        // Converte uma String em um valor inteiro.
        // Exemplo: Integer.parseInt("123") retorna 123 como inteiro.
        String texto = "123";
        int convert = Integer.parseInt(texto);
        System.out.println("Convertido: " + convert);
    }
    // Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Integer.html
}