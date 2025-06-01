// Passeio.java
public final class Passeio extends Veiculo implements Calc {
    private int qtdePassageiro;

    public Passeio(String placa, String marca, String modelo, String cor,
                   int qtdRodas, int velocMax, int qtdPistoes, int potencia,
                   String dataCadastro, int qtdePassageiro)
    {
        super(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia, dataCadastro);
        this.qtdePassageiro = qtdePassageiro;
    }

    public int getQtdePassageiro() {
        return qtdePassageiro;
    }

    public final void setQtdePassageiro(int qtdePassageiro) {
        this.qtdePassageiro = qtdePassageiro;
    }

    @Override
    public int calcVel() {
        // converte km/h em m/h: 1 km = 1000 m
        return getVelocMax() * 1000;
    }

    @Override
    public int calcular() {
        // soma de caracteres em todos os atributos String
        int soma = 0;
        soma += getPlaca().length();
        soma += getMarca().length();
        soma += getModelo().length();
        soma += getCor().length();
        soma += getDataCadastro().length();
        return soma;
    }
}
