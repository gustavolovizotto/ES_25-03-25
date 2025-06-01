// Nome: Gustavo Lovizotto Tesin  RA:2648830;
public final class Carga extends Veiculo implements Calc {
    private int tara;
    private int cargaMax;

    public Carga(String placa, String marca, String modelo, String cor,
                 int qtdRodas, int veloMax, int qtdPistoes, int potencia,
                 String dataCadastro, int tara, int cargaMax)
    {
        super(placa,marca,modelo,cor,qtdRodas,veloMax,qtdPistoes,potencia,dataCadastro);
        this.tara     = tara;
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }

    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    @Override
    public int calcVel() {
        // converte km/h em cm/h: 1 km = 100 000 cm
        return getVelocMax() * 100_000;
    }

    @Override
    public int calcular() {
        // soma de todos os atributos numéricos
        int soma = 0;
        soma += getQtdRodas();
        soma += getVelocMax();
        soma += tara;
        soma += cargaMax;
        soma += getMotor().getQtdPistoes();
        soma += getMotor().getPotencia();
        return soma;
    }
}
