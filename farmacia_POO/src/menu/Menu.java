package menu;

import java.util.Scanner;

import controller.ProdutoController;

public class Menu {
	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcao = 0;
		//Menu de seleção
				System.out.println("*******************************************************");
				System.out.println("                     MENU                     ");
				System.out.println("*******************************************************");
				System.out.println("                                                       ");
				System.out.println("   1 - Criar produto           ");
				System.out.println("   2 - Listar Todos os Produtos       ");
				System.out.println("   3 - Consultar Produto por Id    ");
				System.out.println("   4 - Atualizar Produto	    ");
				System.out.println("   5 - Deletar Produto     ");
				System.out.println("   0 - Sair     ");
				
				System.out.println("                                                       ");
				System.out.println("*******************************************************");
				
				System.out.println("Escolha a sua opção: ");
				opcao = leia.nextInt();
				
				String nome;
				int tipo, id,opcao2;
				float preco;
				
				
				switch(opcao) {
				case 1:
					System.out.println("Criar produto");
					System.out.println("Digite a id: ");
					id = leia.nextInt();
					System.out.println("Digite o nome: ");
					nome = leia.next();
					System.out.println("Digite o tipo: ");
					tipo = leia.nextInt();
					System.out.println("Digite o preço: ");
					preco = leia.nextFloat();
					System.out.println("Digite 1|Genrico ou 2|Fragrancia: ");
					opcao2 = leia.nextInt();
					
					if(opcao2 == 1) {
						System.out.println("Digite o generico: ");
						String generico = leia.next();
						//ProdutoController.criarProduto();
					} else if(opcao2 == 2) {
						System.out.println("Digite a fragrancia: ");
						String fragrancia = leia.next();
					} else {
						System.out.println("Incorreto ");
					}
					


				break; 
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
				case 0:
					System.exit(opcao);
					System.out.println("OBRIGADA POR USAR!");

				break;
				default:
					System.out.println("Opção inválida");
				
				}

	}

}
