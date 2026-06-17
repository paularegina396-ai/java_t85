package aula_02_operadores;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
				Scanner leia = new Scanner(System.in);
				float n1, n2, n3, n4, diferenca;
				
				System.out.println("Digite  o numero 1: ");
				n1 = leia.nextFloat();
				
				System.out.println("Digite o numero 2: ");
				n2 = leia.nextFloat();
				
				System.out.println("Digite o numero 3: ");
				n3 = leia.nextFloat();
				
				System.out.println("Digite o numero 4: ");
				n4 = leia.nextFloat();
				
				diferenca = (n1*n2) - (n3*n4);
				
				System.out.printf("\n Diferença = %.2f  ", diferenca);
				
				leia.close();
	}

}
