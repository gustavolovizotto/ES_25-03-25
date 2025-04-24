public class Pessoa {
    private int cpf = 0; //Agora o cpf e o nome são privados, ou sejam, não podem ser acessadors diretamente fora da classe.
    private String nome = "";
    private Endereco ender = new Endereco(); //Atributo de classe, ou seja, é um atributo que pertence a classe Pessoa.
    //==========================================================//
    public Endereco getEnder() {
        return ender;
    }
    public void setEnder(Endereco ender) {
        this.ender = ender;
    }
    //==========================================================//
//Um objeto é uma instância de uma classe. Uma classe é um tipo de dados.
    public void entDados(int a, String b) {
        cpf = a;
        nome = b;
    }

    public void impDados() {
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
    }

    //Metodos Getters

public int getCpf() {
    return cpf;
}

public String getNome() {
    return nome;
}
//Membros de uma classe: Atributos e Métodos

//Metodos Setters
public void setCpf(int cpf) {
    if (cpf >= 0) {
        this.cpf = cpf;
    }
    else {
        System.out.println("CPF inválido!");
    }
    this.cpf = cpf;
}
//O this é uma referência ao objeto atual. Ele é usado para acessar os membros da classe atual (atributos e métodos).
//Ele é útil quando os nomes dos parâmetros do método são iguais aos nomes dos atributos da classe, para diferenciar entre eles.
public void setNome(String nome) {
    this.nome = nome;
}
//Padrão é sempre dois construtores


//ÚNICO: Construtor padrão é o que a gente deve fazer durante o projeto
public Pessoa (){
    cpf = 0; //atribuição de valor ao atributo
    nome = ""; //atribuição de valor ao atributo
    ender = new Endereco(); //atribuição de valor ao atributo
}


//Para chamar esse segundo metodo, devemos passar os parametros cpf, nome e ender, que são os atributos da classe Pessoa.
public Pessoa (int cpf, String nome, Endereco ender){ 
    System.out.print("Construtor Sobrecarga"); //chamada do método
    this.cpf = cpf; //atribuição de valor ao atributo
    this.nome = nome; //atribuição de valor ao atributo
    this.ender = ender; //atribuição de valor ao atributo
}

}
