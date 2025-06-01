public class Aluno extends Pessoa { //herança
    private String curso;
    private int ra;


    public Aluno() {
        System.out.println("Construtor Aluno"); //chamada do método
        curso = "";
        ra = 0;
    }

    
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public int getRa() {
        return ra;
    }
    public void setRa(int ra) {
        this.ra = ra;
    } 
}

