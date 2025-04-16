
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public String entDados (String rotulo){
        System.out.println(rotulo);
        InputStreamReader teclado = new InputStreamReader(System.in);//Captura a entrada do teclado
        BufferedReader bufTec = new BufferedReader(teclado);//Cria um buffer para a entrada do teclado

        String ret = "";
        try{
            ret = bufTec.readLine(); //Lê a linha digitada pelo usuário
        }
        catch (IOException ioe){
            System.out.println("Erro no jvm ou ram "); //Exibe a mensagem de erro caso ocorra
        }
        return ret;
    }
}