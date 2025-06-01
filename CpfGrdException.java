public class CpfGrdException extends Exception{
	
	public CpfGrdException(){
		System.out.println("\nGerou um NOVO objt do tipo CpfGrdException");
	}

	public Pessoa corPesCpfGrd(Pessoa pes){
		
		try{
			pes.setCpf(Integer.parseInt(l.entDados("\nGRANDE- NOVO CPF: ")));
		}
	
		catch(CpfGrdException cge){
			System.out.println("\nEntrou no catch da CpfGrdException");
			pes = cge.corPesCpfGrd(pes);
		}
	
		catch(NumberFormatException nfe){
			System.out.println("\nO valor informado deve ser um número");
			pes = corPesCpfGrd(pes);
		}

		finally{
			System.out.println("\nEntrou no finally da CpfGrdException");
		System.gc();
		}
		return pes;
		
	}
	
}