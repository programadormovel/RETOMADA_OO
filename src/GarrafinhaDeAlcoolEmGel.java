
// Classe de Negócio
// Regra de Negócio = Entendimento do Processo
public class GarrafinhaDeAlcoolEmGel {
	// Atributos
	private String cor;
	private boolean transperente;
	private String rotulo;
	private double volume;
	
	// Métodos
	public Alcool dispensarAlcool() {
		Alcool objAlcool = new Gel();
		objAlcool.setTipo("Gel");
		return objAlcool;
	}
	
	public void armazenarAlcool(Alcool alcool) {
		this.volume = alcool.getQuantidade();
	}

	// Getters e Setters
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public boolean isTransperente() {
		return transperente;
	}

	public void setTransperente(boolean transperente) {
		this.transperente = transperente;
	}

	public String getRotulo() {
		// programar o retorno
		return rotulo;
	}

	public void setRotulo(String rotulo) {
		// Verificação
		// if(pessoa.nivelDeAcesso = 0) {
			this.rotulo = rotulo;
		// }
		
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	
	
}
