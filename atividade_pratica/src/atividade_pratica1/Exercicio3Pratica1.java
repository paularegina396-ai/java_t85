package atividade_pratica1;

import java.util.Scanner;

public class Exercicio3Pratica1 {

	public static void main(String[] args) {
		// Inicio 16:36 --> 16:41 já havia feito um semelhante anteriormente
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
		case 1: //Caso Soma
			System.out.printf("Operação: Soma |Resultado = %.1f", numero1 + numero2);

		break;
		case 2: //Caso Subtração
			System.out.printf("Operação: Subtração |Resultado = %.1f", numero1 - numero2);

		break;
		case 3: //Caso multiplicação
			System.out.printf("Operação: Multiplicação |Resultado = %.1f", numero1 * numero2);

		break;
			
		case 4: //Caso divisão
			if(numero2 == 0) { //Verifica a divisão por 0
				System.out.printf("Erro: Não é possível dividir por zero!");
			}else {
				System.out.printf("Operação: Divisão |Resultado = %.1f", numero1 / numero2);
			}
			
		break;
	
		default:
			System.out.println("Opção inválida");
		
		}
		leia.close(); //Fechando o Scanner
	}

}
