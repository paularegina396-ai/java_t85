package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaudeCase {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int faixaEtaria;
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		//Menu de seleção da faixa etária
		System.out.println("*******************************************************");
		System.out.println("                     FAIXA ETÁRIA                      ");
		System.out.println("*******************************************************");
		System.out.println("                                                       ");
		System.out.println("   1 - de 0 A 10 ANOS           ");
		System.out.println("   2 - de 11 A 29 ANOS           ");
		System.out.println("   3 - de 30 A 45 ANOS           ");
		System.out.println("   4 - de 46 A 59 ANOS           ");
		System.out.println("   5 - de 60 A 65 ANOS           ");
		System.out.println("   6 - acima de 65 ANOS           ");
		
		System.out.println("                                                       ");
		System.out.println("*******************************************************");
		
		System.out.println("Escolha a sua faixa Etária: ");
		faixaEtaria = leia.nextInt();
		
		System.out.printf("Nome: %s\n",nome);
		
		switch(faixaEtaria) {
		case 1:
			System.out.println("A mensalidade do Plano é R$ 100,00");

		break; //Precisa colcoar para não ir para os proximos cases, ele execute e saia de a case 1 for a certa
		case 2:
			System.out.println("A mensalidade do Plano é R$ 200,00");

		break;
		case 3:
			System.out.println("A mensalidade do Plano é R$ 300,00");

		break;
			
		case 4:
			System.out.println("A mensalidade do Plano é R$ 500,00");

		break;
		case 5:
			System.out.println("A mensalidade do Plano é R$ 600,00");

		break;
		case 6:
			System.out.println("A mensalidade do Plano é R$ 1000,00");

		break;
		default:
			System.out.println("Opção inválida");
		
		}
		
		
		
	}

}
