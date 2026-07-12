package model;

public class Cosmético extends Produto {
	private String fragrancia;
	//Construtor

	public Cosmético(String fragrancia) {
		this.fragrancia = fragrancia;
	}
	//Get e set
	public String getFragrancia() {
		return fragrancia;
	}

	public void setFragrancia(String fragrancia) {
		this.fragrancia = fragrancia;
	}
	
	@Override
	public void visualizar() {
		
	}
	
	

}
