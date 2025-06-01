//Nome: Gustavo Lovizotto Tesin -  RA: 2648830;
import java.util.Scanner;

public class TstWrap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            TstInt ti = new TstInt();
            TstBool tb = new TstBool();
            TstChar tc = new TstChar();
            TstDoub td = new TstDoub();
            TstByte tby = new TstByte();
            TstShort ts = new TstShort();
            TstFloat tf = new TstFloat();
            TstLong tl = new TstLong();
            
            int opcao;
            do {
                System.out.println("\nMenu de Testes:");
                System.out.println("1. Integer");
                System.out.println("2. Boolean");
                System.out.println("3. Character");
                System.out.println("4. Double");
                System.out.println("5. Byte");
                System.out.println("6. Short");
                System.out.println("7. Float");
                System.out.println("8. Long");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                
                switch (opcao) {
                    case 1 -> { ti.compareInt(); ti.parseInt(); }
                    case 2 -> { tb.parseBoolean(); tb.comparebol(); }
                    case 3 -> { tc.isDigit(); tc.toUpperCase(); }
                    case 4 -> { td.isNan(); td.parseDouble(); }
                    case 5 -> { tby.compareByte(); tby.parseByte(); }
                    case 6 -> { ts.compareShort(); ts.parseShort(); }
                    case 7 -> { tf.isInfinite(); tf.parseFloat(); }
                    case 8 -> { tl.compareLong(); tl.parseLong(); }
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
                
            } while (opcao != 0);
        }
    }
}
