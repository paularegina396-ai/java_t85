package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Thiago");
		fila.add("Guilherme");
		fila.add("Higor");
		fila.add("Sara");
		fila.add("Bella");
		
		
		fila.remove();
		
		System.out.println("A Sara ainda esta na fila?" + fila.contains("Sara"));
		for(var cliente : fila) {
			System.out.println(cliente);
		}
		
	}

}
