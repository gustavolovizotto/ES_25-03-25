//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
public class TstChar {

    // Wrapper: Character
    // Método: isDigit()
    // Verifica se um caractere é um dígito.
    // Exemplo: '5' é um dígito.
    // Resultado: true se for dígito, false caso contrário.
    public void isDigit() {
        boolean resultado = Character.isDigit('5');
        System.out.println("'5' é dígito? " + resultado);
    }

    // Wrapper: Character
    // Método: toUpperCase()
    // Converte um caractere para maiúsculo.
    // Exemplo: 'a' se torna 'A'.
    // Resultado: 'A'.
    public void toUpperCase() {
        char maiuscula = Character.toUpperCase('a');
        System.out.println("Letra convertida: " + maiuscula);
    }
    //Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html
}
