public class ContaSteam {
    String acount = ""; //Atributo
    String senha = ""; //Atributo
    String email = ""; //Atributo
    //Metodos Getters
    public String getAcount () {
        return acount;
    }
    public String getSenha () {
        return senha;
    }
    public String getEmail () {
        return email;
    }
    //Metodos Setters

    public void setAcount (String acount) {
        this.acount = acount;
    }
    public void setSenha (String senha) {
        this.senha = senha;
    }
    public void setEmail (String email) {
        this.email = email;
    }

    //Método para exibir os dados da conta
    public void exibirDados() {
        System.out.println("Conta: " + acount);
        System.out.println("Senha: " + senha);
        System.out.println("Email: " + email);
    }
}
