package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		//Condição
		if(numero > 10 && numero < 100) {
			System.out.println("O número digitado é maior do que 10."); //Só exibe a msg se o número for maior que 10
		}
		
		System.out.println("***Fim do Programa***"); //Pra saber que o programa esta fechando
		
		leia.close();

	}

}
