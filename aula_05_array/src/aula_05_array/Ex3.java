package aula_05_array;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		//Declaração do Scanner
		Scanner leia = new Scanner(System.in);
		//Declaração da matriz
		int matriz[][]= new int[3][3];
		
		//Leitura da matriz
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna ++) {
				System.out.printf("Digite o valor da matriz [%d][%d] = ",linha,coluna);
				matriz[linha][coluna]=leia.nextInt();
			}
			
			
		}
		
		
		//Todos os elementos da Diagonal Principal - printa se o valor de linha == coluna
		System.out.print("Elementos da Diagonal Principal: ");
		int somaPrinc = 0;
		for(int linha = 0; linha < 3; linha++) {
			
			for(int coluna = 0; coluna < 3; coluna ++) {
				if(linha==coluna) {
					System.out.printf("%d ",matriz[linha][coluna]);
					somaPrinc=somaPrinc+matriz[linha][coluna];
				}
			}
			
			
		}
		
		//Todos os elementos da Diagonal Secundária 
			System.out.print("\nElementos da Diagonal Secundária: ");
			int somaSec = 0;
			int coluna = 2;
			for(int linha = 0; linha < 3; linha++) {
					
				//for(int coluna = 2; coluna>= 0; coluna-=2) {
					
					System.out.printf("%d ",matriz[linha][coluna]);
					somaSec=somaSec + matriz[linha][coluna];
					coluna--;
					
				//}
					
					
				}
		
		//A Soma de todos os elementos da Diagonal Principal
			System.out.printf("\nSoma dos Elementos da Diagonal Principal: %d ",somaPrinc);
			
		//A Soma de todos os elementos da Diagonal Secundária
			System.out.printf("\nSoma dos Elementos da Diagonal Secundária: %d ",somaSec);
		

	}

}
