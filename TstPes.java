public class TstPes{

	public static void main(String arg[]){ //classLoader
		
		Aluno a1 = new Aluno();
		Leitura l = Leitura.geraLeitura();

		try{
			a1.setCpf(Integer.parseInt(l.entDados("\nCPF-X..: ")));
			a1.setNome(l.entDados("NOME..:"));
			a1.getEnder().setRua(l.entDados("RUA..: "));//Reflexividade
			a1.getEnder().setNum(Integer.parseInt(l.entDados("NUMERO-X..: "))); //Reflexividade
		}
		catch (CpfNegException e){
			System.out.println("\nCPF NEGATIVO");
		}
		catch (NomeGrdException e){
			System.out.println("\nNOME MUITO GRANDE");
		}
		catch (NomePqException e){
			System.out.println("\nNOME MUITO PEQUENO");
		}

		
 
 
 /*
		Pessoa p1; //declaração

		p1 = new Aluno(); //Coersão
		
		//p1 = new Pessoa(); //instanciação
		
		p1.setCpf(1);
		*/
		
		
		
		
	/*	
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Aluno(); //Coersão
		
		//p2.setRa(13); // Erro de direcionalidade
		
		p1.impDados();
		p2.impDados();

	*/	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		
		a1.setDoc(17); //Pessoa
		a1.setCurso("Eng. Soft."); //Aluno
		a1.getEnder().setNum(34);
		a1.getEnder().setRua("Das Dores");
		
		a1.setCpf(34); //Pessoa
		a1.setNome("Dusbão"); // Pessoa
	
System.out.println("\nRA-Aluno..: "+a1.getRa());//Aluno
System.out.println("CURSO - Aluno.: "+a1.getCurso());//Aluno	
System.out.println("\nCPF-Aluno..: "+a1.getCpf());//Pessoa
System.out.println("\nCPF-Aluno..: "+a1.getDoc());//Pessoa
System.out.println("NOME - Aluno.: "+a1.getNome());//Pessoa	
System.out.println("RUA - Aluno.: "+a1.getEnder().getRua());//Pessoa		
System.out.println("NUMERO - Aluno.: "+a1.getEnder().getNum());//Pessoa	
		
*/		
		
		
		
		
		
		
		
		
		
		
		
	
	


/*	
	
		//Leitura l1 = new Leitura();
		//Leitura l2 = new Leitura();
		//Leitura l3 = new Leitura();	
		
		Leitura l1 =  Leitura.geraLeitura();
		Leitura l2 =  Leitura.geraLeitura();
		Leitura l3 =  Leitura.geraLeitura();	

System.out.println("\n Ender. de L1: " + l1);
System.out.println(" Ender. de L2: " + l2);		
System.out.println(" Ender. de L3: " + l3);

	
*/	

		
		
		
		
		
		
		
		
		
		
		
		
/*		
		Pessoa p1 = new Pessoa();		
		
	System.out.println("\nCPF..: "+p1.getCpf());
	System.out.println("NOME.: "+p1.getNome());
	
		p1.setCpf(Integer.parseInt(l.entDados("\nCPF-X..: ")));
		p1.setNome(l.entDados("NOME..:"));
		
	System.out.println("\nCPF..: "+p1.getCpf());
	System.out.println("NOME.: "+p1.getNome());		
		
*/
		
	
	} //fim do main
} //fim da classe

/*

		p1.setCpf(Integer.parseInt(l.entDados("\nCPF-X..: ")));
		p1.setNome(l.entDados("NOME..:"));
		p1.getEnder().setRua(l.entDados("RUA..: "));//Reflexividade
		p1.getEnder().setNum(Integer.parseInt(l.entDados("NUMERO-X..: "))); //Reflexividade
		
		
	System.out.println("\nCPF..: "+p1.getCpf());
	System.out.println("NOME.: "+p1.getNome());
	System.out.println("\nRUA.: "+p1.getEnder().getRua()); //Reflexividade
	System.out.
*/