// Nome: Gustavo Lovizotto Tesin  RA:2648830;
public class TstVeic {
    public static void main(String[] args) {
        // --- Veículo de Passeio ---
        String placa   = Leitura.entDados("Informe a placa do carro de passeio");
        String marca   = Leitura.entDados("Informe a marca");
        String modelo  = Leitura.entDados("Informe o modelo");
        String cor     = Leitura.entDados("Informe a cor");
        int    rodas   = Integer.parseInt(Leitura.entDados("Informe a quantidade de rodas"));
        int    velo    = Integer.parseInt(Leitura.entDados("Informe a velocidade máxima (km/h)"));
        int    pist   = Integer.parseInt(Leitura.entDados("Informe qtd de pistões do motor"));
        int    pot    = Integer.parseInt(Leitura.entDados("Informe a potência do motor"));
        String data   = Leitura.entDados("Informe a data de cadastro");
        int    passageiros = Integer.parseInt(Leitura.entDados("Informe qtde de passageiros"));

        Passeio passeio = new Passeio(placa,marca,modelo,cor,rodas,velo,pist,pot,data,passageiros);

        // --- Veículo de Carga ---
        placa   = Leitura.entDados("Informe a placa do caminhão");
        marca   = Leitura.entDados("Informe a marca");
        modelo  = Leitura.entDados("Informe o modelo");
        cor     = Leitura.entDados("Informe a cor");
        rodas   = Integer.parseInt(Leitura.entDados("Informe a quantidade de rodas"));
        velo    = Integer.parseInt(Leitura.entDados("Informe a velocidade máxima (km/h)"));
        pist    = Integer.parseInt(Leitura.entDados("Informe qtd de pistões do motor"));
        pot     = Integer.parseInt(Leitura.entDados("Informe a potência do motor"));
        data    = Leitura.entDados("Informe a data de cadastro");
        int tara      = Integer.parseInt(Leitura.entDados("Informe a tara (kg)"));
        int cargaMax  = Integer.parseInt(Leitura.entDados("Informe a carga máxima (kg)"));

        Carga carga = new Carga(placa,marca,modelo,cor,rodas,velo,pist,pot,data,tara,cargaMax);

        // --- Impressão dos resultados ---
        System.out.println("\n=== DADOS DO CARRO DE PASSEIO ===");
        System.out.println("Placa: "         + passeio.getPlaca());
        System.out.println("Marca/Modelo: "  + passeio.getMarca() + " " + passeio.getModelo());
        System.out.println("Cor: "           + passeio.getCor());
        System.out.println("Rodas: "         + passeio.getQtdRodas());
        System.out.println("Cadastro: "      + passeio.getDataCadastro());
        System.out.println("Motor: "         + passeio.getMotor().getQtdPistoes() + " pistões, " +
                                              passeio.getMotor().getPotencia() + " cv");
        System.out.println("Passageiros: "   + passeio.getQtdePassageiro());
        System.out.println("Velocidade máxima: " + passeio.getVelocMax() + " km/h");
        System.out.println("Velocidade exibida (m/h): " + passeio.calcVel());
        System.out.println("Valor calcular(): "      + passeio.calcular());

        System.out.println("\n=== DADOS DO CAMINHÃO ===");
        System.out.println("Placa: "         + carga.getPlaca());
        System.out.println("Marca/Modelo: "  + carga.getMarca() + " " + carga.getModelo());
        System.out.println("Cor: "           + carga.getCor());
        System.out.println("Rodas: "         + carga.getQtdRodas());
        System.out.println("Cadastro: "      + carga.getDataCadastro());
        System.out.println("Motor: "         + carga.getMotor().getQtdPistoes() + " pistões, " +
                                              carga.getMotor().getPotencia() + " cv");
        System.out.println("Tara: "          + carga.getTara());
        System.out.println("Carga Máx.: "    + carga.getCargaMax());
        System.out.println("Velocidade máxima: " + carga.getVelocMax() + " km/h");
        System.out.println("Velocidade exibida (cm/h): " + carga.calcVel());
        System.out.println("Valor calcular(): "       + carga.calcular());
    }
}

