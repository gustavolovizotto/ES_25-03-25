// Nome: Gustavo Lovizotto Tesin  RA:2648830;
import java.util.Scanner;

public class Leitura {
    private static Scanner sc = new Scanner(System.in);

    public static String entDados(String prompt) {
        System.out.print(prompt + ": ");
        return sc.nextLine();
    }
}
