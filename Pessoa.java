
import java.awt.geom.Path2D;

public class Pessoa {
    static int cpf = 0;
    static String nome = "";
//Um objeto é uma instância de uma classe. Uma classe é um tipo de dados.
    public static void main(String[] args) {
        Pessoa p1; //declaração
        p1 = new Pessoa(); //instanciação
        p1.entDados(18, "Gustavo"); //chamada do método
        p1.impDados(); //chamada do método

        Pessoa p2 = new Pessoa(); //instanciação
        p2.entDados(19, "POAP"); //chamada do método
        p2.impDados(); //chamada do método

        System.out.println("End. P1: " + p1); //acesso ao atributo
        System.out.println("End. P2: " + p2); //acesso ao atributo
    }


    public static void entDados(int a, String b) {
        cpf = a;
        nome = b;
    }

    public static void impDados() {
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
    }
}
