//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
import java.util.Scanner;

public class ContLetGustavoTesin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite uma frase: ");
            String frase = sc.nextLine();
            
            System.out.print("Digite uma letra para procurar na frase: ");
            char letra = sc.nextLine().toLowerCase().charAt(0);
            
            String fraseLower = frase.toLowerCase();
            int contador = 0;
            
            System.out.println("Posições da letra '" + letra + "' na frase:");
            
            for (int i = 0; i < fraseLower.length(); i++) {
                if (fraseLower.charAt(i) == letra) {
                    System.out.println("Posição: " + i);
                    contador++;
                }
            }
            
            if (contador > 0) {
                System.out.println("A letra '" + letra + "' apareceu " + contador + " vez(es).");
            } else {
                System.out.println("A letra '" + letra + "' não existe na frase.");
            }
        }
    }
}
