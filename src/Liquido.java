
public class Liquido extends Alcool {

	// método
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
