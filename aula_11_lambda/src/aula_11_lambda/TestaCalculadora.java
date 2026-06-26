package aula_11_lambda;

public class TestaCalculadora {

	public static int calcular(OperacaoMatematica om, int numero1, int numero2) {
		return om.executar(numero1, numero2); //om recebe a lambda
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 10;
		int numero2 = 2;
		
		System.out.println("Soma: " + calcular((a,b) -> a + b, numero1, numero2));
		System.out.println("Subtração: " + calcular((a,b) -> a - b, numero1, numero2));

	}

}
