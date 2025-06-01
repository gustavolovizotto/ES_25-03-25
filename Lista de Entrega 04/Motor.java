// Nome: Gustavo Lovizotto Tesin  RA:2648830;
public class Motor {
    private int qtdPistoes;
    private int potencia;

    public Motor(int qtdPistoes, int potencia) {
        this.qtdPistoes = qtdPistoes;
        this.potencia = potencia;
    }

    public int getQtdPistoes(){
        return qtdPistoes;
    }

    public int getPotencia(){
        return potencia;
    }

    public final void setQtdPistoes(int qtdPistoes){
        if (qtdPistoes > 0) {
            this.qtdPistoes = qtdPistoes;
        } else {
            System.out.println("Quantidade de pistões inválida.");
        }
    }

    public final void setPotencia(int potencia){
        if (potencia > 0) {
            this.potencia = potencia;
        } else {
            System.out.println("Potência inválida.");
        }
    }
}
