package atividade_pratica1;

import java.util.Scanner;

public class Exercicio2Pratica1 {

	public static void main(String[] args) {
		//  inicio 16:21 -->16:30 
		Scanner leia = new Scanner(System.in);
		//Declaração variaveis
		String nome;
		float nota;
		
		//Leitura das variaveis
		System.out.println("Nome: ");
		nome = leia.nextLine(); 
		System.out.println("Nota: ");
		nota = leia.nextFloat();
		

		//Verificação das condições usando estrutura de decisão
		if(nota >= 0 && nota<=10) { //Verifica Se a nota esta no intervalo 0 a 10
			
			if(nota >= 7) { //Nota maior ou igual a 7 → Aprovado
				System.out.printf("Aluno: %s | Nota: %.1f | Situação: Aprovado", nome, nota);
			}else if(nota >= 5 && nota <7) { //Nota maior ou igual a 5 e menor que 7 → Recuperação
				System.out.printf("Aluno: %s | Nota: %.1f | Situação: Recuperação", nome, nota);
			}else {//Nota menor que 5 → Reprovado
				System.out.printf("Aluno: %s | Nota: %.1f | Situação: Reprovado", nome, nota);
			}
			
		} else { //Casos de negação de autorização
			System.out.println("Digite uma nota válida → entre 0 e 10.");
		}
		
		leia.close(); //Fechando o Scanner
	}

}
