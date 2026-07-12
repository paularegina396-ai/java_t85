package model;

public class Medicamento extends Produto {
	private String generico;
	//Construtor
	public Medicamento(String generico) {
		this.generico = generico;
	}
	//Get e set
	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}
	
	@Override
	public void visualizar() {
		
	}
	
}
