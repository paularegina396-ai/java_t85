package aula_05_array;

import java.util.Scanner;

public class MatrizRegular {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matrizInteiros[][] = {
									{10, 15, 20}, 
									{45, 55, 60}, 
									{75, 80, 85}
								};
		double matrizDouble[][] = new double[2][3]; //Double é float com mais poisições
		
		//Printar valores da matriz Inteiros
		for(int linha = 0; linha <matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna <matrizInteiros.length; coluna++) {
				System.out.printf("matrizInteiros[%d][%d] = [%d]\n",linha, coluna, matrizInteiros[linha][coluna]);//00, 01, 02, ..ele   vai seguir essa ordem
			}
		}
		
		
		//Ler valores de uma matriz
		
		for(int linha = 0; linha <matrizDouble.length; linha++) {
			for(int coluna = 0; coluna <matrizDouble[linha].length; coluna++) {
				System.out.printf("Digite um número para a posição [%d][%d] = \n", linha,coluna);
				matrizDouble[linha][coluna] = leia.nextDouble();
				//00, 01, 02, ..ele   vai seguir essa ordem
			}
		}
		
		//Laço foreach quer mostrar os dados sem preocupação com o indice ... Laço de repetição ForEach (lê todo o array)
		for(double linha[] : matrizDouble) { 
			for (double numero : linha) {
				System.out.println(numero);
			}
			
		}
		
		

	}

}
