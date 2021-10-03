
// Classe executável
public class Higienizar {
	
	 // Declarar globalmente
	static Pessoa objPessoa;
	static GarrafinhaDeAlcoolEmGel objGarrafa;
	
	public static void main(String[] args) {
		// Interação entre objetos
		
		objPessoa = new Pessoa();
		objGarrafa = new GarrafinhaDeAlcoolEmGel();
		objGarrafa.setRotulo("GARRAFÃO");
		objPessoa.setNome("Adão");
		
		// Solicitar higienização
		boolean resultado = objPessoa.higienizar(objGarrafa);
		
		if(resultado == true) {
			System.out.println("\n" + objPessoa.getNome() + " higienizou com ");
			System.out.println("\n SUCESSO");
		}
		
		

	}

}
