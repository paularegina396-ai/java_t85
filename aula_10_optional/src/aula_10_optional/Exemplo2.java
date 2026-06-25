package aula_10_optional;

import java.util.Optional;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frases[] = new String[5];
		
		frases[2] = "Generation Brasil";
		
		//Para confirma se realmente colocou criaremos um for each
		for(var frase : frases) {
			System.out.println(frase);
		}
		
		//Optional vazio
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("Exibir o valor de optionalVazio" + optionalVazio);
		System.out.println("O optionVazio esta vazio?" + optionalVazio.isEmpty());
		System.out.println("O optionalVazio tem alguma coisa?" + optionalVazio.isPresent());
		
		
		//Optional com dados
		Optional<String> valorIndice2 = Optional.of(frases[2]);
		System.out.println("Exibir o valor de valorIndice2" + valorIndice2);
		//Checar se tem algo dentro
		System.out.println("O valorIndice 2 tem alguma coisa?" + valorIndice2.isPresent());
		System.out.println("Qual é o valor armazenado em valorIndice 2?" + valorIndice2.get());

	}

}
