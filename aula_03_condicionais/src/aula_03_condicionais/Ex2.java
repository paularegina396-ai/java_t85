package aula_03_condicionais;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero;
		//Ler o numero digitado pelo usuário
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		//Verifica a condição
		if(numero > 0 && numero%2 == 0){
			System.out.printf("O número %d é par e positivo ",numero);
		} else if(numero < 0 && numero%2 == 0){
			System.out.printf("O número %d é par e negativo ",numero);
		} else if(numero > 0 && numero%2 != 0){
			System.out.printf("O número %d é ímpar e positivo ",numero);
		} else if(numero < 0 && numero%2 != 0){
			System.out.printf("O número %d é ímpar e negativo ",numero);
		}  else {
			System.out.printf("O número %d é neutro ",numero);
		}
		
		
		
		leia.close();
	}

}
