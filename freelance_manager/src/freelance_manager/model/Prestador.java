package freelance_manager.model;

import freelance_manager.service.Pagavel;
import freelance_manager.service.Validacao;

public abstract class Prestador implements Pagavel {
	//Atributos
	private String nome;
	private int horasTrabalhadas;
	private double valorHora;
	
	
	//Método Construtor
	public Prestador(String nome, int horasTrabalhadas, double valorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		
		Validacao.validarvalorHora(valorHora);//Validação vem antes de salvar o valor no construtor
		this.valorHora = valorHora;
	}

	//Get  dos atributos - Não crie Setters (uma vez contratado, o valor da hora e o nome não mudam direto por set, garantindo segurança)
	
	public String getNome() {
		return nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}
	
	//Método sem retorno - Soma as novas horas as horas trabalhadas atual do objeto
	public void registrarHoras(int novasHoras) {
		this.horasTrabalhadas += novasHoras;
	}


	
	
	
	

}
