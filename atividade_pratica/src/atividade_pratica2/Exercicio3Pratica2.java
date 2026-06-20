package atividade_pratica2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3Pratica2 {

	public static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarando  arraylist
		int opcao;
		ArrayList<String> produtos  = new ArrayList<String>();
		ArrayList<Integer> quantidades = new ArrayList<Integer>();
		

				////////////////////////////
				char continua = 'S';
				int linhaAtual= 0 ;
				float soma = 0, media = 0;
				while (continua == 'S') {
					System.out.println("*******************************************************");
					System.out.println("                   Cadastro de Produtos                  ");
					System.out.println("*******************************************************");
					System.out.println("                                                       ");
					System.out.println("   1 - Adicionar um novo produto          ");
					System.out.println("   2 - Atualizar a quantidade de um produto existente       ");
					System.out.println("   3 - Listar todos os produtos    ");
					System.out.println("   0 - SAIR           ");
					
					System.out.println("                                                       ");
					System.out.println("*******************************************************");
					
					System.out.println("Escolha a opção: ");
					opcao = leia.nextInt();
					
					
					
					//Colocar valores 
					if (opcao == 1) {
					    // adiciona produtos
						adicionarProduto(produtos, quantidades);

					} else if (opcao == 2) {
					    // atualiza
						atualizaProdutos(produtos, quantidades);
						
					} else if (opcao == 3) {
						 // lista todos os cadastrados
						listarProdutos(produtos, quantidades);
						
					

					} else if (opcao == 0) {
					    System.out.println("Saindo...");
					    continua = 'N';
					}
					
					
					
					do {
						//Saber se a pessoa quer ou não continuar,
						System.out.println("Deseja continuar? (S/N)");
						continua = leia.next().toUpperCase().charAt(0);
					} while (!(continua =='S') && !(continua == 'N')); 
					
					
					
				}
				
				
				leia.close();
			}
	public static void adicionarProduto(ArrayList<String> produtos1,ArrayList<Integer> quantidade1) {
	    
		System.out.println("Digite oproduto: ");
			produtos1.add(leia.next());
		
			System.out.println("Digite a quantidade: ");
			quantidade1.add(leia.nextInt());
	    

	   
	}
	
	
	public static void listarProdutos(ArrayList<String> produtos1,ArrayList<Integer> quantidade1) {
		for(int cont = 0; cont < produtos1.size(); cont++) {
			System.out.println("Produto: "+ produtos1.get(cont)+" Quantidade: "+quantidade1.get(cont));
			
		}
	}
	
	public static void atualizaProdutos(ArrayList<String> produtos1,ArrayList<Integer> quantidade1) {
		String produtoAtu;
		int novaQtd;
		
		
		
		System.out.println("Digite o produto que deseja atualizar a qtd: ");
		produtoAtu = leia.next();
		int indice = produtos1.indexOf(produtoAtu);
		
		
		System.out.println("Digite a nova qtd: ");
		novaQtd = leia.nextInt();
		//Atualiza a quantidade
		quantidade1.set(indice, novaQtd);
	


	 
	}
				
				
				////////////////////////////
				
				
				
				
				
	}