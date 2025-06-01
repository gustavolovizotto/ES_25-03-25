// Nome: Gustavo Lovizotto Tesin  RA:2648830
public final class Funcionario extends Pessoa implements Exibir {
    private String funcao;
    private String turno;

    // Construtor padrão
    public Funcionario() {
        super();           // Chama o construtor padrão da superclasse Pessoa
        this.funcao = "";
        this.turno = "";
    }

    // Construtor com parâmetros (sobrecarga)
    public Funcionario(String nome, String cpf, Endereco endereco, Cidade cidade, char genero, String funcao, String turno) {
        super(nome, cpf, endereco, cidade, genero); // Inicializa os atributos herdados
        this.funcao = funcao;
        this.turno = turno;
    }
    //Uso de interface e Sobrescrita
@Override
    public void exibirResumo() {
        System.out.println("Funcionário: " + getNome());
        System.out.println("Turno: " + getTurno());
        System.out.println("Função: " + getFuncao());
    }

    // Getters e Setters
    public String getFuncao()               { return funcao; }
    public void setFuncao(String funcao)    { this.funcao = funcao; }

    public String getTurno()                { return turno; }
    public void setTurno(String turno)      { this.turno = turno; }
}
