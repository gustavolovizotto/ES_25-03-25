// Nome: Gustavo Lovizotto Tesin  RA:2648830

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    // Atributo estático privado que armazenará a instância única
    private static Leitura instanciaUnica;

    // Construtor privado (evita criação externa de objetos)
    private Leitura() {}

    // Método público que retorna a instância única da classe (padrão Singleton)
    public static Leitura getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Leitura(); // cria somente se ainda não foi criada
        }
        return instanciaUnica;
    }

    // Método para entrada de dados
    public String entDados(String rotulo) {
        System.out.println(rotulo);
        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader bufTec = new BufferedReader(teclado);

        String ret = "";
        try {
            ret = bufTec.readLine();
        } catch (IOException ioe) {
            System.out.println("Erro de entrada: " + ioe.getMessage());
        }

        return ret;
    }
}
