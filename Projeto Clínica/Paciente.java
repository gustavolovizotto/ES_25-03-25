// Nome: Gustavo Lovizotto Tesin  RA:2648830
public final class Paciente extends Pessoa implements Exibir {
    private String email;
    private String telefone;
    private String nomeAcompanhante;
    private String cpfAcompanhante;

    // Construtor padrão (sem parâmetros)
    public Paciente() {
        super(); // Chama o construtor padrão da superclasse (Pessoa)
        this.email = "";
        this.telefone = "";
    }

    // Construtor com parâmetros (sobrecarga)
    public Paciente(String nome, String cpf, Endereco endereco, Cidade cidade, char genero, String email, String telefone) {
        super(nome, cpf, endereco, cidade, genero); // Chama o construtor completo de Pessoa
        this.email = email;
        this.telefone = telefone;
    }
public String getNomeAcompanhante() {
        return nomeAcompanhante;
    }

    public void setNomeAcompanhante(String nomeAcompanhante) {
        this.nomeAcompanhante = nomeAcompanhante;
    }

    public String getCpfAcompanhante() {
        return cpfAcompanhante;
    }

    public void setCpfAcompanhante(String cpfAcompanhante) {
        this.cpfAcompanhante = cpfAcompanhante;
    }


//Uso de interface e Sobrescrita
    @Override
    public void exibirResumo() {
        System.out.println("Paciente: " + getNome() + 
                           " | CPF: " + getCpf() + 
                           " | Email: " + email + 
                           " | Telefone: " + telefone);
    }

    // Getters e Setters
    public String getEmail()                 { return email; }
    //Sobrecarga
public void setEmail(String email) throws EmailInvalidoException {
    if (!email.contains("@")) {
        throw new EmailInvalidoException("Email inválido! Deve conter '@'.");
    }
    this.email = email;
}

    public String getTelefone()              { return telefone; }
    //Sobrecarga
public void setTelefone(String telefone) throws TelefoneInvalidoException {
    if (telefone.length() < 8) {
        throw new TelefoneInvalidoException("Telefone inválido! Deve ter pelo menos 8 dígitos.");
    }
    this.telefone = telefone;
}
}
