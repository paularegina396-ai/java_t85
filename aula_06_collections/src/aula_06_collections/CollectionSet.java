package aula_06_collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> frutas = new HashSet<String>();
		
		frutas.add("Abacate");
		frutas.add("abacate");
		frutas.add("Morango");
		frutas.add("Maça");
		frutas.add("Laranja");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
			
		}
		
	}

}
