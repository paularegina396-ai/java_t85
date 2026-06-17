package aula_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Vetor inicializado com dados
		int vetorInteiros[] = {10,20,70,45,78,100, 35, 70};
		
		//Vetor vazio
		float vetorReais[] = new float[5];
		
		
		//Listar todos os dados do vetor de inteiros
		for(int contador = 0; contador < vetorInteiros.length ; contador++) { //Não igual pois começa em 0 então não conta o 6
		System.out.printf("vetorInteiros[%d] = %d\n", contador,vetorInteiros[contador]);
		}
		
		System.out.println("Tamanho do vetor de Inteiros: " + vetorInteiros.length); //Printa o tamanho do vetor Inteiros
		
		//Inserir dados no vetor de Reais
		for(int contador = 0; contador < vetorReais.length ; contador++) { 
		System.out.printf("Digite um valor real para a posição [%d]: \n", contador);
		vetorReais[contador] = leia.nextFloat(); //Adiciona em cada posição o valor digitado pelo usuário
		}
		
		//Ordena o vetor em ordem crescente (muda a ordem no vetor)
		Arrays.sort(vetorReais);//Método sort
		
		//Listar todos os dados do vetor de reais decrescente ou crescente (não muda a ordem no vetor)
				for(int contador = 0; contador < vetorReais.length ; contador++) { //Não igual pois começa em 0 então não conta o 6
				System.out.printf("vetReal[%d] = %.2f\n", contador,vetorReais[contador]);
				}
				
		System.out.println("Tamanho do vetor de reais: " + vetorReais.length); //Printa o tamanho do vetor Reais
	
		System.out.println("Qual é o índice do valor 10 no vetor de Reais? " + Arrays.binarySearch(vetorReais, 10));
		
		
		
		leia.close();
	}

}
