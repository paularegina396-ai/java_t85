package atividade_pratica1;

import java.util.Scanner;

public class Exercicio1Pratica1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		//Declaração variaveis
		String nome;
		int idade;
		boolean autorizacao;
		
		//Leitura das variaveis
		System.out.println("Nome: ");
		nome = leia.nextLine(); 
		System.out.println("Idade: ");
		idade = leia.nextInt();
		System.out.println("Autorização: ");
		autorizacao = leia.nextBoolean();

		//Verificação das condições usando estrutura de decisão
		if(idade >= 18) { //Verifica Se a idade for maior ou igual a 18--> o acesso deve ser liberado
			System.out.printf("Acesso liberado para %s.",nome);
		}else if ( idade <= 0) { // Caso idade seja invalida
			System.out.printf("Digite uma idade valida.");
		}else if(idade < 18 && autorizacao == true && idade>0) {  //Se a idade for menor que 18 e possuir autorização, o acesso deve ser liberado com autorização.
			System.out.printf("Acesso liberado com autorização para %s.",nome);
		} else { //Casos de negação de autorização
			System.out.printf("Acesso negado para %s.",nome);
		}
		
		leia.close(); //Fechando o Scanner
	}

}
