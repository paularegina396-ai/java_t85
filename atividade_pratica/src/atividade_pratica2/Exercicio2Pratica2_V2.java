package atividade_pratica2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2Pratica2_V2 {

	//Scanner leia = new Scanner(System.in);	//Erro frequente do scanner pq faz isso??
	// Change this:
	//Scanner leia = new Scanner(System.in);
	// To this:
	static Scanner leia = new Scanner(System.in);
			
			
	public static void main(String[] args) {
		//Resolução Usando coleção: 16:14-->16:47 Total: 33 minutos
		//Declaração Scanner e ArraysLists
		
		ArrayList<String> nomes = new ArrayList<String>();
		ArrayList<Integer> idades = new ArrayList<Integer>();
		ArrayList<Float> notas = new ArrayList<Float>();
		
		//Declaração da variavel que vai ler as opções do menu
		int opcoes=0;
		
		//Menu com as opções --> Fazer com switch e while
		do {
			System.out.println("Opções:");
			System.out.println("1 - Add Aluno");
			System.out.println("2 - Listar todos os alunos");
			System.out.println("3 - Calcular média geral das notas");
			System.out.println("Digite a opção: ");
			opcoes = leia.nextInt();
			
			switch(opcoes) {
			case 1:
				adicionarAluno(nomes,  idades,  notas);
				break;
			case 2:
				listarAlunos(nomes,  idades,  notas);
				break;
			case 3:
				calculoMedia(nomes,  idades,  notas);
				break;
			case 0:
				System.out.println("Obrigado por usar nosso sistema!");
			
				break;
			default://Caso de digitar outro caracter
				System.out.println("Opção inválida!!!");
				
			}
			
		}while(opcoes != 0);
	}
	
	public static void adicionarAluno(ArrayList<String> nomes1, ArrayList<Integer> idades1, ArrayList<Float> notas1) {
		// Duvida --> Esse parametro q passamos aqui precisa ser igual ao que ele tras? N entendi bem essa parte de parametros e retornos
		System.out.println("Digite o nome do aluno: ");
		nomes1.add(leia.next());
		
		System.out.println("Digite a idade do aluno: ");
		idades1.add(leia.nextInt());
		
		System.out.println("Digite a Nota Final do aluno: ");
		notas1.add(leia.nextFloat());
		
		//Não retorna nada pois esse só cadastra
	}
	public static void listarAlunos(ArrayList<String> nomes1, ArrayList<Integer> idades1, ArrayList<Float> notas1) {
		// TODO Auto-generated method stub
		//Pra mostrar somente o nome dos alunos então só lista os nomes ne? E se fosse pra mostra todas as infos?
		for(String aluno:nomes1) {
			System.out.println(aluno);
		}

	}
	public static void calculoMedia(ArrayList<String> nomes1, ArrayList<Integer> idades1, ArrayList<Float> notas1) {
		// 
		float media=0.0f;
		for(int cont=0; cont<notas1.size(); cont++) {
			media = media + notas1.get(cont);
		}
		media = media/notas1.size();
		
		System.out.println("A média da NOTA FINAL de todos os alunos é: "+ media);

	}
	//Erros e dificuldades durante o código:
//Erro1: decalrando a ArrayList como global ele ainda assim da um erro quando eu tento criar o metodo com public static void
	//Dificuldade em colocoar parametro de arrays
}
