package aula_06_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex3CollectionSet {
	
	public static void main(String[] args) {
		//13:45-->13:56
		//Declaração do Scanner
		Scanner leia = new Scanner(System.in);
		
		//Declaração da Collection Set
		Set<Integer> numeros = new HashSet<Integer>();
		
		
		//Leitura de dados do usuário - 10 valores
		System.out.println("Olá, digite via teclado 10 valores inteiros: ");
		for(int cont = 0; cont<10 ; cont++) {
			numeros.add(leia.nextInt());
		}
	
		//Listar dados do set
		System.out.println("\nListar dados do Set: ");
		for(int num : numeros) {
			System.out.println(num);
			
		}
		
		
		
		
		
	}
}
