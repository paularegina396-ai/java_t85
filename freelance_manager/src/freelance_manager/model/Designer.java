package freelance_manager.model;

import freelance_manager.service.Pagavel;

public class Designer extends Prestador {
	//Atributo
	private boolean temPortfolioBehance;
	
	//Método construtor
	public Designer(String nome, int horasTrabalhadas, double valorHora, boolean temPortfolioBehance) {
		super(nome, horasTrabalhadas, valorHora);
		this.temPortfolioBehance = temPortfolioBehance;
	}
	
	//Get e set
	public boolean isTemPortfolioBehance() {
		return temPortfolioBehance;
	}

	public void setTemPortfolioBehance(boolean temPortfolioBehance) {
		this.temPortfolioBehance = temPortfolioBehance;
	}
	
	//Método com retorno para calcular faturamento do designer, se true que tem portfolio ele ganha 10% bonus
	@Override
	public double calcularFaturamento() {
		if(this.temPortfolioBehance) { //this.temPortfolioBehance == true essa é a melhor forma de verificar se um bool é true ou false? Não
			return (getHorasTrabalhadas()*getValorHora())*1.1; //ganha 10% bonus
		}else {
			return (getHorasTrabalhadas()*getValorHora());
		}
	}

	
	
	
}
