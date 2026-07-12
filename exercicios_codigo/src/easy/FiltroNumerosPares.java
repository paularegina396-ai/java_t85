package easy;

import java.util.ArrayList;
import java.util.List;

public class FiltroNumerosPares {
	
	public static List<Integer> filtroNumerosPares(int[] numeros)  {
		int tamanhoVetor = numeros.length;
		
		//Como não sabemos o tamanho que tera a nova Array, usaremos ArrayList, qual a outra possibilidade?
		List<Integer> novaLista = new ArrayList<>();
		
		//Loop para percorrer o Array
		for(int contador = 0; contador < tamanhoVetor; contador++) {
			if(numeros[contador]%2 == 0) {novaLista.add(numeros[contador]);	}
		}
		return novaLista;
		
	}
	
	
	
	public static void main(String[] args) {
		//Vetor de Entrada:
		int[] numeros = {1, 4, 7, 12, 19, 20};
		List<Integer> novaLista = filtroNumerosPares(numeros);
		
		for(int num : novaLista) {
			System.out.println(num);
		}
		
	}
	
}
