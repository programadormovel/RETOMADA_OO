
public class Pessoa {
	//Atributo
	private String nome;
	
	// M�todo
	public boolean higienizar(GarrafinhaDeAlcoolEmGel garrafa) {
		
		// Usar a garrafinha
		Alcool objAlcool = garrafa.dispensarAlcool();
		
		System.out.print("Higienizou com " + objAlcool.getTipo());
		
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
