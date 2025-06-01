public class Pessoa{

	private int cpf = 0;
	private String nome = "";
	
//=====================================++
// THROWS (com "s"): "AVISO"-> "POSSO" lançar um objt do tipo...
// THROW &sem "s"): "ORDEM" -> "LANCE" o objt tal


	public void setCpf(int cpf) throws CpfNegException, CpfGrdException{
		if(cpf >= 10){
			if(cpf <= 100){
				this.cpf = cpf;
			}
			else{
				throw new CpfGrdException();
				
			}
		}
		else{
			throw new CpfNegException();
		}
	}

//=====================================
	public Pessoa(){
		cpf = 0;
		nome = "";
	}
//=====================================	
	public int getCpf(){
		return cpf;
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}


}