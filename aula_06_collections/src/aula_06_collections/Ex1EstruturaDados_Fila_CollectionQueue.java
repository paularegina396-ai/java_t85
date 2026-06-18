package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex1EstruturaDados_Fila_CollectionQueue {

	public static void main(String[] args) {
		// 13:59 --> 14:40
		
		//Declarando Scanner e Fila(Collection Queue)
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int continua, opcao;
		opcao = 1;
		
		//Menu
		System.out.println("\n\n**********************************************");
		System.out.println("***      Fila de clientes do banco:        ***");
		System.out.println("**********************************************");
		System.out.println("1 - Add Clientes na fila");
		System.out.println("2 - Listar todos os clientes");
		System.out.println("3 - Retirar Cliente da fila");
		System.out.println("0 - Sair");
		
		while (opcao != 0) {
			System.out.println("**********************************************");
			System.out.print("\nDigite uma opção: "); 
			opcao = leia.nextInt();
			leia.nextLine();
			System.out.print("\n"); 
			
			
			
			//Operações conforme MENU
			
				if( opcao==3 && fila.isEmpty()) {
					System.out.print("Fila Vazia: \n");
				}else if(opcao==1) {
					
					//Adicionar Cliente na fila
					System.out.print("Digite o nome: \n");
					fila.add(leia.nextLine());
				
					System.out.print("	Cliente Adicionado!\n");
					
				}else if (opcao ==2) {
					
					//Listar todos os clientes
					System.out.println("	Lista de clientes na fila: ");
					for(var cliente : fila) {
						System.out.println(cliente);
					}
					
				}else if(opcao == 3) {
					
					//Remove cliente da fila
					fila.remove();
					System.out.println("	Lista: ");
					for(var cliente : fila) {
						System.out.println(cliente);
					}
					System.out.println("O cliente foi chamado!\n");
					
				}else if(opcao != 0) {
					//Validação caso digite numero que nao seja 0,1,2,3,4
					System.out.println("Digite um número válido!\n");
				} else {
					System.out.println("Programa Finalizado!\n");
				}
				
			
			
			
			
		}
		
		
		
		
		/////////////////////////////////////////////
		
	

	}

}
