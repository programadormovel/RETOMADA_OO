
public class Liquido extends Alcool {

	// m�todo
	public Liquido fabricacao() {
		return new Liquido();
	}
	
	// Construtor
	Liquido(String _tipo){
		super(_tipo);
	}
	
	Liquido(){
		
	}
	
}
