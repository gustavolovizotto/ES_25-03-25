public class Pessoa {
    int cpf = 0;
    String nome = "";
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
    this.cpf = cpf;
}
//O this é uma referência ao objeto atual. Ele é usado para acessar os membros da classe atual (atributos e métodos).
//Ele é útil quando os nomes dos parâmetros do método são iguais aos nomes dos atributos da classe, para diferenciar entre eles.
public void setNome(String nome) {
    this.nome = nome;
}

}
