
public class Alcool {
	// Atributo
	private String tipo;
	private double porcentagem;
	private double quantidade;
	
	// Construtor
	Alcool(){
		
	}
	
	// Construtor (sobrecarga de método)
	Alcool(String _tipo){
		this.tipo = _tipo;
	}
	
	// Criar Getters e Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPorcentagem() {
		return porcentagem;
	}
	public void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
	
	
}
