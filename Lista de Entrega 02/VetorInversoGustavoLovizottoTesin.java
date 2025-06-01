//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
import java.util.Scanner;
public class VetorInversoGustavoLovizottoTesin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int tamanho = 5; // Pode ser alterado
            int[] vetor = new int[tamanho];
            
            System.out.println("Digite " + tamanho + " números:");
            
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                vetor[i] = sc.nextInt();
            }
            
            System.out.println("Valores em ordem inversa:");
            for (int i = tamanho - 1; i >= 0; i--) {
                System.out.println(vetor[i]);
            }
        } 
    }
}
