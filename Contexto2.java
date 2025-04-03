public class Contexto2 {
    static int x = 10;
    static int y = 6;

    public static void main(String[] args) {
        int x =15;
        int y = 10;
        calc();
        System.out.println("Soma-main: " + (x + y));
        //Como foi declarado x e y localmente, o Soma-main irá usar x = 15 e y = 10
        //E o Soma-calc irá usar x = 10 e y = 6, pois não houve declaração local nem passagem de parametros, logo irá usar as variaveis globais
    }

    public static void calc() {
        System.out.println("Soma-calc: " + (x + y + 10));
    }
}
