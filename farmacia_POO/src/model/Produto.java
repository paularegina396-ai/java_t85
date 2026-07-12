package model;

public abstract class Produto {
	private int id;
	private String nome;
	private int tipo;
	private float preco;
	//Não tem construtor? Pq é abstrata?
	
	//Métodos - Getter and Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	//Outros métodos
	public void visualizar() {
		
	}
	
	
	
	
	
	
}
