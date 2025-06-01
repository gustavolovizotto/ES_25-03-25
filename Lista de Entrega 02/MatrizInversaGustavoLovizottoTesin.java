//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
import java.util.Scanner;
public class MatrizInversaGustavoLovizottoTesin {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int linhas = 2;
            int colunas = 3;
            int[][] matriz = new int[linhas][colunas];
            
            System.out.println("Digite " + (linhas * colunas) + " números para preencher a matriz:");
            
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    System.out.print("Valor [" + i + "][" + j + "]: ");
                    matriz[i][j] = sc.nextInt();
                }
            }
            
            System.out.println("Matriz em ordem inversa:");
            for (int i = linhas - 1; i >= 0; i--) {
                for (int j = colunas - 1; j >= 0; j--) {
                    System.out.println("Valor [" + i + "][" + j + "]: " + matriz[i][j]);
                }
            }
        }
    }
}
