// Nome: Gustavo Lovizotto Tesin  RA:2648830
public class Endereco {
    private String rua;
    private int numero;

    // Construtor padrão (sem parâmetros)
    public Endereco() {
        this.rua = "";
        this.numero = 0;
    }

    // Construtor com parâmetros (sobrecarga)
    public Endereco(String rua, int numero) {
        this.rua = rua;
        this.numero = numero;
    }

    // Métodos getters e setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
