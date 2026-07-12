package freelance_manager.model;

import freelance_manager.service.Pagavel;

public class Programador extends Prestador {

	//Atributo
	private String tecnologiaPrincipal; //Ex: Java, Python
	
	//Método construtor
	public Programador(String nome, int horasTrabalhadas, double valorHora, String tecnologiaPrincipal) {
		super(nome, horasTrabalhadas, valorHora);
		this.tecnologiaPrincipal = tecnologiaPrincipal;
	}
	//Get e Set

	public String getTecnologiaPrincipal() {
		return tecnologiaPrincipal;
	}

	public void setTecnologiaPrincipal(String tecnologiaPrincipal) {
		this.tecnologiaPrincipal = tecnologiaPrincipal;
	}
	
	
	//Método com retorno para calcular o faturamento do programador
	@Override
	public double calcularFaturamento() {
		
		return (getHorasTrabalhadas()*getValorHora()); //Não precisa ser super.get...
		
	}
	
	
	

}
