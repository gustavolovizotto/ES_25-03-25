//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
public class TstDoub {

    // Wrapper: Double
    // Método: isNaN()
    // Verifica se o valor é "Not a Number".
    // Exemplo: Double.isNaN(0.0 / 0.0) retorna true.
    // Resultado: true se for NaN, false caso contrário.
    public void isNan() {
        boolean resultado = Double.isNaN(0.0 / 0.0);
        System.out.println("É NaN? " + resultado);
    }

    // Wrapper: Double
    // Método: parseDouble()
    // Converte uma string em double.
    // Exemplo: Double.parseDouble("3.14") retorna 3.14.
    // Resultado: 3.14.
    public void parseDouble() {
        double valor = Double.parseDouble("3.14");
        System.out.println("Valor convertido: " + valor);
    }
    //Referência: https://docs.oracle.com/javase/8/docs/api/java/lang/Double.html
}
