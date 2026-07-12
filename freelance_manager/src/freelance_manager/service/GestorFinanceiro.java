package freelance_manager.service;

public class GestorFinanceiro {
	//Ela não pode ser instanciada ?? Coloque construtor como private
	
	//Método construtor
	private GestorFinanceiro() {
	}
	
	//Método estático com retorno - estático - tipo uma formula matematica ne?
	//Ele deve receber um valor e retornar valorBruto * 0.05 (5% de imposto retido na fonte).
	public static double calcularImpostoRetido(double valorBruto) {
		return valorBruto*0.05;
	}
	
	

}
