package aula_04_repeticoes;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
//10 minutos
		Scanner leia = new Scanner(System.in);
		
		int numero,somaPos=0;
		
		
		do {
			System.out.println("Digite um número inteiro: ");
			numero = leia.nextInt();
			if (numero>0)
				somaPos+=numero;
			
		} while (numero != 0);
		System.out.printf("A soma dos números positivos é: %d", somaPos);
		
		leia.close();
	}

}
