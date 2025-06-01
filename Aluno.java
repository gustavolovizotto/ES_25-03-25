public class Aluno extends Pessoa{

	private int ra;
	private String curso;
	
// ===========================================
	public void calcRenda(){
		System.out.println("\n calcRenda");
	}


public void impDados(){
	System.out.println("\n impDados() Default da classe-filha Aluno");
}
public void tellMae(){
		super.impDados();
}
// =============================================	
	

	public int getRa(){
		return ra;
	}

	public String getCurso(){
		return curso;
	}
	

	public void setRa(int ra){
		this.ra = ra;
	}

	public void setCurso(String curso){
		this.curso = curso;
	}


}