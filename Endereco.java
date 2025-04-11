public class Endereco {
    private String rua = "";
    private int numero = 0;

public int getNumero() {
    return numero;
}
public String getRua() {
    return rua;
}

public void setNumero(int numero) {
    if (numero >= 0) {
        this.numero = numero;
    } else {
        System.out.println("Número inválido!");
    }
}

public void setRua(String rua) {
    this.rua = rua;
}
}