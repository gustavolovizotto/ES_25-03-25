//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
import java.util.Scanner;
public class G1GustavoLovizottoTesin {
    
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            

            System.out.print("Digite o valor de a: ");
            double a = Double.parseDouble(sc.nextLine());
            
            System.out.print("Digite o valor de b: ");
            double b = Double.parseDouble(sc.nextLine());
            
            System.out.println("\nMenu de Opções:");
            System.out.println("1 - Somar (a + b)");
            System.out.println("2 - Multiplicar (a * b)");
            System.out.println("3 - Subtrair (a - b)");
            System.out.println("5 - Dividir (a / b)");
            System.out.print("Escolha uma opção: ");
            
            int opcao = Integer.parseInt(sc.nextLine());
            
            switch (opcao) {
                case 1:
                    System.out.println("A soma de a + b é: " + (a + b));
                    break;
                case 2:
                    System.out.println("A multiplicação de a * b é: " + (a * b));
                    break;
                case 3:
                    System.out.println("A subtração de a - b é: " + (a - b));
                    break;
                case 5:
                    if (b != 0) {
                        System.out.println("A divisão de a / b é: " + (a / b));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}


