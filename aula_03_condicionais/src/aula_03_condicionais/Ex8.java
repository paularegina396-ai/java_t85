package aula_03_condicionais;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		float saldo = 1000;
		float valor;
		int operacao;
		
		//Menu de seleção da operação
		System.out.println("*******************************************************");
		System.out.println("                     OPERAÇÃO                      ");
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("   1 - Saldo           ");
		System.out.println("   2 - Saque      ");
		System.out.println("   3 - Depósito  ");
		
		System.out.println("                                                       ");
		System.out.println("*******************************************************");
		
		System.out.println("Operação: ");
		operacao = leia.nextInt();
		
		
		switch(operacao) {
		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f",saldo);

		break;
		case 2:
			System.out.println("Valor: ");
			valor = leia.nextFloat();
			System.out.println("Operação - Saque");
				if(valor<saldo) {
				saldo=saldo-valor;
				System.out.printf("Saldo: R$%.2f",saldo);
				}else {
					System.out.printf("Saldo insuficiente");
				}
			

		break;
		case 3:
			System.out.println("Valor: ");
			valor = leia.nextFloat();
			System.out.println("Operação - Depósito");
			saldo=saldo+valor;
			System.out.printf("Saldo: R$%.2f",saldo);

		break;
			
	
		default:
			System.out.println("Opção inválida");
		
		}
		

	}

}
