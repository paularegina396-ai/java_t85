package atividade_pratica2;

import java.util.Scanner;

public class Exercicio2Pratica2 {
	
	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		//Declarando scanner e a matriz String -1hia
		Scanner leia = new Scanner(System.in);
		String matrizString[][] = new String[30][3];
		int opcao;
		

				////////////////////////////
				char continua = 'S';
				int linhaAtual= 0 ;
				float soma = 0, media = 0;
				while (continua == 'S') {
					System.out.println("*******************************************************");
					System.out.println("                   Cadastro de Alunos                  ");
					System.out.println("*******************************************************");
					System.out.println("                                                       ");
					System.out.println("   1 - Adicionar um aluno           ");
					System.out.println("   2 - Listar todos os alunos cadastrados           ");
					System.out.println("   3 - Calcular a média geral das notas       ");
					System.out.println("   0 - SAIR           ");
					
					System.out.println("                                                       ");
					System.out.println("*******************************************************");
					
					System.out.println("Escolha a opção: ");
					opcao = leia.nextInt();
					
					
					
					//Colocar valores na matriz
					if (opcao == 1) {
					    // adiciona UM aluno.
						linhaAtual = adicionarAluno(matrizString, linhaAtual);

					} else if (opcao == 2) {
					    // lista todos os cadastrados
						listarAlunos(matrizString);
						
					} else if (opcao == 3) {
					    // calcula a média.
						calcularMediaGeral(matrizString);
					

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
	public static int adicionarAluno(String[][] matrizString, int linhaAtual) {
	    
	    System.out.println("Digite o nome:");
	    matrizString[linhaAtual][0] = leia.next();
	    
	    System.out.println("Digite a idade:");
	    matrizString[linhaAtual][1] = leia.next();
	    
	    System.out.println("Digite a nota:");
	    matrizString[linhaAtual][2] = leia.next();
	    

	    linhaAtual++; 
	    
	    return linhaAtual; 
	}
	
	
	public static void listarAlunos(String[][] matriz) {
	    for(int linha = 0; linha < matriz.length; linha++) {
	        if (matriz[linha][0] != null) {
	            System.out.printf("Aluno:[%s] Idade:[%s] Nota: [%s]\n", 
	                matriz[linha][0], matriz[linha][1], matriz[linha][2]);
	        }
	    }
	}
	
	public static void calcularMediaGeral(String[][] matrizString) {
	    int alunosCadastrados = 0; 
	    float soma = 0; 
	    float media = 0; 

	    for (int linha = 0; linha < matrizString.length; linha++) {
	        // Só faz a conta se a linha não for nula
	        if (matrizString[linha][2] != null) {
	            soma = soma + Float.parseFloat(matrizString[linha][2].replace(',', '.'));   
	            alunosCadastrados++;
	        }
	    }                       

	    if (alunosCadastrados > 0) {
	        media = soma / alunosCadastrados;
	        System.out.printf("A média é: %.2f%n", media);
	    } else {
	        System.out.println("Nenhum aluno cadastrado para calcular a média.");
	    }
	}
				
				
				////////////////////////////
				
				
				
				
				
	}
	


