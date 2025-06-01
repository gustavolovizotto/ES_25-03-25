//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
public class TstFloat {

    // Wrapper: Float
    // Método: isInfinite()
    // Verifica se o valor é infinito.
    // Exemplo: Float.isInfinite(1.0f / 0.0f) retorna true.
    // Resultado: true se for infinito, false caso contrário.
    public void isInfinite() {
        boolean resultado = Float.isInfinite(1.0f / 0.0f);
        System.out.println("É infinito? " + resultado);
    }

    // Wrapper: Float
    // Método: parseFloat()
    // Converte uma string em float.
    // Exemplo: Float.parseFloat("2.71") retorna 2.71.
    // Resultado: 2.71.
    public void parseFloat() {
        float valor = Float.parseFloat("2.71");
        System.out.println("Float convertido: " + valor);
    }
    //Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Float.html
}
