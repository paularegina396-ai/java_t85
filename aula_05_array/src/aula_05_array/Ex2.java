package aula_05_array;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Inicio 11:32 -->11:51 Pontos de melhoria o media e soma podem ser simplificados 
		
		//Declaração do vetor
		int vetor[]=new int [10];
		
		//Declaração do Scanner
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu vetor: ");
		//Leitura dos 10 número digitados pelo usuário
		for(int cont = 0; cont < 10; cont++) {
			vetor[cont] = leia.nextInt();
		}
		
		//Saída de dados:
		System.out.println("Elementos nos índices ímpares: ");
		//Todos os elementos dos índices ímpares do vetor - Comecei no índice 1 que é o primeiro ímpar de depois fui de 2 em 2
		for(int cont = 1; cont < 10; cont+=2) {
			System.out.print(vetor[cont]+" ");
		}
		
		System.out.println("\nElementos pares: ");
		//Todos os elementos do vetor que são números pares
		for(int cont = 0; cont < 10; cont++) {
			if(vetor[cont]%2==0) {
			System.out.print(vetor[cont]+" ");
			}
		}
		
		
		//A Soma de todos os elementos do vetor
		int soma = 0;
		for(int cont = 0; cont < 10; cont++) {
			soma=soma+vetor[cont];
		}
		System.out.printf("\nSoma: %d", soma);
		
		//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real
		float media = 0;
		for(int cont = 0; cont < 10; cont++) {
			media=media+vetor[cont];
		}
		System.out.printf("\nMédia: %.2f", media/10);
		
		
		
		//Fechamento do Scanner
		leia.close();
		
	}

}
