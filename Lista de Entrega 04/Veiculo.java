// Nome: Gustavo Lovizotto Tesin  RA:2648830;
public abstract class Veiculo {
    private String placa;
    private String modelo;
    private String cor;
    private String marca;
    private int qtdRodas;
    private int velocMax;
    private Motor motor;
    private String dataCadastro;

    public Veiculo(String placa, String marca, String modelo, String cor,
                   int qtdRodas, int veloMax, int qtdPistoes, int potencia,
                   String dataCadastro){
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.marca = marca;
        this.qtdRodas = qtdRodas;
        this.velocMax = veloMax;
        this.motor = new Motor(qtdPistoes, potencia);
        this.dataCadastro = dataCadastro;
    }

    public String getPlaca(){
        return placa;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCor(){
        return cor;
    }
    public String getMarca(){
        return marca;
    }
    public int getQtdRodas(){
        return qtdRodas;
    }
    public int getVelocMax(){
        return velocMax;
    }	
    public Motor getMotor(){
        return motor;
    }
    public String getDataCadastro(){
        return dataCadastro;
    }

    public final void setPlaca(String placa){
        this.placa = placa;
    }
    public final void setModelo(String modelo){
        this.modelo = modelo;
    }
    public final void setCor(String cor){
        this.cor = cor;
    }
    public final void setMarca(String marca){
        this.marca = marca;
    }
    public final void setQtdRodas(int qtdRodas){
        this.qtdRodas = qtdRodas;
    }
    public final void setVelocMax(int velo){
        if (velo < 10 || velo > 250) {
            System.out.println("A velocidade está fora dos limites brasileiros.");
            this.velocMax = 100;
        } else {
            this.velocMax = velo;
        }
    }
    public abstract int calcVel();
}
