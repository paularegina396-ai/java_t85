package aula_03_condicionais;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		float numero1,numero2;
		int operacao;
		//Leitura dos valores
		System.out.println("Digite o 1° Número: ");
		numero1 = leia.nextFloat();
		System.out.println("Digite o 2° Número: ");
		numero2 = leia.nextFloat();
		
		//Menu de seleção da operação
		System.out.println("*******************************************************");
		System.out.println("                     OPERAÇÃO                      ");
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("   1 - Soma           ");
		System.out.println("   2 - Subtração      ");
		System.out.println("   3 - Multiplicação  ");
		System.out.println("   4 - Divisão        ");
		
		System.out.println("                                                       ");
		System.out.println("*******************************************************");
		
		System.out.println("Operação: ");
		operacao = leia.nextInt();
		
		
		switch(operacao) {
		case 1:
			System.out.printf("%.1f + %.1f = %.1f",numero1,numero2, numero1 + numero2);

		break;
		case 2:
			System.out.printf("%.1f - %.1f = %.1f",numero1,numero2, numero1 - numero2);

		break;
		case 3:
			System.out.printf("%.1f x %.1f = %.1f",numero1,numero2, numero1 * numero2);

		break;
			
		case 4:
			System.out.printf("%.1f / %.1f = %.1f",numero1,numero2, numero1 / numero2);
		break;
	
		default:
			System.out.println("Opção inválida");
		
		}
		
		
	}

}
