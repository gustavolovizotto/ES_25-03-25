// Nome: Gustavo Lovizotto Tesin  RA:2648830
public final class Medico extends Pessoa implements Exibir {
    private int crm;
    private String especialidade;

    // Construtor padrão
    public Medico() {
        super(); // Chama o construtor padrão da classe Pessoa
        this.crm = 0;
        this.especialidade = "";
    }

    // Construtor com parâmetros (sobrecarga)
    public Medico(String nome, String cpf, Endereco endereco, Cidade cidade, char genero, int crm, String especialidade) {
        super(nome, cpf, endereco, cidade, genero); // Inicializa os atributos herdados
        this.crm = crm;
        this.especialidade = especialidade;
    }
    //Uso de interface e Sobrescrita
    @Override
    public void exibirResumo() {
        System.out.println("Médico: " + getNome() + 
                           " | CPF: " + getCpf() + 
                           " | CRM: " + crm + 
                           " | Especialidade: " + especialidade);
    }

    // Getters e Setters
    public int getCrm()                       { return crm; }
    public void setCrm(int crm)               { this.crm = crm; }

    public String getEspecialidade()          { return especialidade; }
    public void setEspecialidade(String esp)  { this.especialidade = esp; }
}
