//Nome: Gustavo Lovizotto Tesin  RA:2648830
public abstract class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private Endereco endereco;
    private Cidade cidade;
    private char genero;
    

     // Construtor padrão (sem parâmetros)
    public Pessoa() {
        this.nome = "";
        this.cpf = ""; // Definindo valor padrão diretamente para evitar chamada de método sobrescrevível e exceções
        this.idade = 0; // Inicializando idade, caso seja necessário
        this.endereco = new Endereco(); // assumindo que Endereco tem um construtor padrão
        this.cidade = new Cidade();     // assumindo que Cidade tem um construtor padrão
        this.genero = ' ';
    }

     // Construtor com parâmetros (sobrecarga)
    public Pessoa(String nome, String cpf, Endereco endereco, Cidade cidade, char genero) {
        System.out.println("Construtor Sobrecarga"); // Apenas para sinalizar visualmente a chamada
        this.nome = nome;
        this.cpf = cpf;
        this.idade = 0; // Inicializando idade, caso seja necessário
        this.endereco = endereco;
        this.cidade = cidade;
        this.genero = genero;
    }

     // Getters e Setters
    public String getNome()             { return nome; }
    public void setNome(String nome)    { this.nome = nome; }

    public String getCpf()                 { return cpf; }
    public void setCpf(String cpf) throws CpfPeqException, CpfGrdException, CpfNegException {
    if (!cpf.matches("\\d+")) {
        throw new CpfNegException(); // CPF não numérico ou negativo (contém '-')
    } else if (cpf.length() < 11) {
        throw new CpfPeqException();
    } else if (cpf.length() > 11) {
        throw new CpfGrdException();
    } else {
        this.cpf = cpf;
    }
}

    public int getIdade()               { return idade; }
    public void setIdade(int idade) throws IdadeNegException {
    if (idade < 0) {
        throw new IdadeNegException();
    }
    this.idade = idade;
}

    public Endereco getEndereco()       { return endereco; }
    public void setEndereco(Endereco e) { this.endereco = e; }

    public Cidade getCidade()           { return cidade; }
    public void setCidade(Cidade c)     { this.cidade = c; }

    public char getGenero()             { return genero; }
    public void setGenero(char g)       { this.genero = g; }

    
}

