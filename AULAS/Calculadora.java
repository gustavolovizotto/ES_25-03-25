public class Calculadora {
    public static void main(String[] args) {
        String operacao = args[0].trim().toLowerCase();
        String val1 = args[1].trim();
        String val2 = args[2].trim();


        int x = Integer.parseInt(val1);
        int y = Integer.parseInt(val2);
        calc(operacao, x, y);

        
    }

    public static void calc(String operacao, int a, int b) {
        switch (operacao) {
            case "soma" -> System.out.println("Soma: " + (a + b));
            case "subtracao" -> System.out.println("Subtracao: " + (a - b));
            case "multiplicacao" -> System.out.println("Multiplicacao: " + (a * b));
            case "divisao" -> {
                if (b == 0) {
                    System.out.println("Erro: Divisão por zero!");
                } else {
                    System.out.println("Divisao: " + (a / b));
                }
            }
            default -> System.out.println("Operação inválida!");
        }
    }
}
