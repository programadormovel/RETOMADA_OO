
// Classe execut�vel
public class Higienizar {
	
	 // Declarar globalmente
	static Pessoa objPessoa;
	static GarrafinhaDeAlcoolEmGel objGarrafa;
	
	public static void main(String[] args) {
		// Intera��o entre objetos
		
		objPessoa = new Pessoa();
		objGarrafa = new GarrafinhaDeAlcoolEmGel();
		objGarrafa.setRotulo("GARRAF�O");
		objPessoa.setNome("Ad�o");
		
		// Solicitar higieniza��o
		boolean resultado = objPessoa.higienizar(objGarrafa);
		
		if(resultado == true) {
			System.out.println("\n" + objPessoa.getNome() + " higienizou com ");
			System.out.println("\n SUCESSO");
		}
		
		

	}

}
