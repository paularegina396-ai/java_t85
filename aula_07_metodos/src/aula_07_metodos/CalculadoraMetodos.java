package aula_07_metodos;

import java.util.Scanner;

public class CalculadoraMetodos { //classe

	public static void main(String[] args) { //metodo main
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double numero1, numero2;
		
		System.out.println("*** CALCULADORA BÁSICA ***");
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f%n", numero1, numero2,somar(numero1,numero2));
		System.out.printf("%.2f - %.2f = %.2f%n", numero1, numero2,subtrair(numero1,numero2));
		System.out.printf("%.2f * %.2f = %.2f%n", numero1, numero2,multiplicar(numero1,numero2));
		System.out.printf("%.2f / %.2f = %.2f%n", numero1, numero2,dividir(numero1,numero2));
		
		sobre();
		
		leia.close();
	}
	
	//fora metodo main dentro da clase, fora da classe principal, todos os metodos são estatios
	public static double somar(double coringa1, double coringa2) {
		return coringa1+coringa2;
	}
	
	public static double subtrair(double coringa1, double coringa2) {
		return coringa1-coringa2;
	}
	
	public static double multiplicar(double coringa1, double coringa2) {
		return coringa1*coringa2;
	}
	
	public static double dividir(double coringa1, double coringa2) {
		return coringa1/coringa2;
	}
	
	public static void sobre() {
		System.out.println("Projeto Cacluladora, desenvolvido por Paula");
		System.out.println("Desenvolvido por: Paula");
	}

}
