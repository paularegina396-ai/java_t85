package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ex1CollectionList {

	public static void main(String[] args) {
		// 13:29-->13:41
		
		//Declaração Scanner
		Scanner leia = new Scanner(System.in);
		
		//Declaração da Collection ArrayList de Objetos da Classe String
		ArrayList<String> cores = new ArrayList<String>();
		
		//Leitura de dados do usuário - 5 cores
		System.out.println("Olá, digite via teclado 5 cores: ");
		for(int cont = 0; cont<5 ; cont++) {
		 cores.add(leia.next());
		}
		
		//Listar todas as cores:
		System.out.println("\nListar todas as cores: ");
		for(String cor:cores) {
			System.out.println(cor);
		}
		
		//Ordenar todas as cores:
		cores.sort(null);
		System.out.println("\nOrdenar todas as cores: ");
		for(String cor:cores) {
			System.out.println(cor);
		}
		
		
	}

}
