package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex2_Pilha_CollectionStack {

	public static void main(String[] args) {
		//18:30-->19:00
		
		////////////////////////////
		//Declarando Scanner e Fila(Collection Queue)
		Scanner leia = new Scanner(System.in);
		Deque<String> pilha = new ArrayDeque<String>();
		int opcao;
		opcao = 1;
		
		//Menu
		System.out.println("\n\n**********************************************");
		System.out.println("***      Livraria        ***");
		System.out.println("**********************************************");
		System.out.println("1 - Add Livros na pilha");
		System.out.println("2 - Listar todos os livros");
		System.out.println("3 - Retirar Livro da pilha");
		System.out.println("0 - Sair");
		
		while (opcao != 0) {
			System.out.println("**********************************************");
			System.out.print("\nDigite uma opção: "); 
			opcao = leia.nextInt();
			leia.nextLine();
			System.out.print("\n"); 
			
			
			
			//Operações conforme MENU
			
				if(opcao ==3 && pilha.isEmpty() || opcao==3 && pilha.isEmpty()) {
					System.out.print("Pilha Vazia: \n");
				}else if(opcao==1) {
					
					//Adicionar livro na pilha
					System.out.println("Digite o nome: ");
					pilha.push(leia.nextLine());
				
					System.out.println("	Livro Adicionado!");
					
				}else if (opcao ==2) {
					
					//Listar todos os livros
					System.out.println("	Lista de livros na pilha: ");
					for(var cliente : pilha) {
						System.out.println(cliente);
					}
					
				}else if(opcao == 3) {
					
					//Remove livro da pilha
					pilha.pop();
					System.out.println("	Pilha: ");
					for(var cliente : pilha) {
						System.out.println(cliente);
					}
					System.out.println("O livro foi retirado da pilha!\n");
					
				}else if(opcao != 0) {
					//Validação caso digite numero que nao seja 0,1,2,3,4
					System.out.println("Digite um número válido!\n");
				} else {
					System.out.println("Programa Finalizado!\n");
				}
				
			
			
			
			
		}		
		
		
		
		
		

	}

}
