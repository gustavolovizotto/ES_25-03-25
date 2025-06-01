public class Contexto {
    public static void main(String[] args) {
        String x = args[0];
        String y = args[1];

        int z = Integer.parseInt(x);
        int w = Integer.parseInt(y);

        calc(z,w);
    }

    public static void calc(int a, int b) {
        int soma = a + b;
        System.out.println("Soma: " + soma);
    }
}
