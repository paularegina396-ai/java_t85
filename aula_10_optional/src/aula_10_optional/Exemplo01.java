package aula_10_optional;

import java.util.Optional;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palavras[] = new String[10];

		for(var palavra : palavras) {
			System.out.println(palavra);
		}
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);
		
		String palavra = palavras[5].toLowerCase();//Converte para letras minusculas
		System.out.println(palavra);
	}

}
