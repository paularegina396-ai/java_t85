package aula_04_repeticoes;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//11:40 -->12:00 erro: pensamento for --> de numero ate numero2, não é de numero ENUANTO a condição 2 não for satisfeita
		Scanner leia = new Scanner(System.in);
		
		//Declaração de variáveis
		int numero, numero2;
		
		//Leitura dos valores digitados pelo usuário
		System.out.println("Digite o primeiro número do intervalo: ");
		numero = leia.nextInt();
		System.out.println("Digite o segundo número do intervalo: ");
		numero2 = leia.nextInt();
		
		//Validação --> O 1 num deve ser menor que o 2
		if (numero<numero2) {
			
			for(int contador = numero; contador <= numero2; contador++) {//Inicia no numero 1, enquanto o contor for <= numero 2
				
				if(contador%5 == 0 && contador%3 ==0) //Mostre na tela todes os números que são múltiplos de 3 e 5,para isso usamos o contador
					System.out.printf("%d é múltiplo de 3 e 5\n",contador);
				
			}
		} else {
			System.out.println("Intervalo inválido!");
		}
		

		leia.close();
	}

}
