package easy;

public class ContadorDeVogais {
	
	
	//Declarando a função/método ContandoVogais
	// O método não precisa de variáveis estáticas fora dele.
    // Ele recebe a String e RETORNA um int.
	public static int contandoVogais(String texto) {
		int tamanhoTexto = texto.length();
		int contadorVogais = 0;
		for(int i=0;i<tamanhoTexto;i++) {
		
			if(		texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || 
					texto.charAt(i) == 'i' || texto.charAt(i) == 'o' || 
					texto.charAt(i) == 'u') {
				contadorVogais++;
			}
			
		}
		// Em vez de printar, o método DEVOLVE o resultado para quem chamou
		return contadorVogais;
	}
	//Fim do método ContandoVogais
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textoParaTestar = "estudar programacao";
		
		// Chamamos o método e guardamos o retorno dele em uma variável
		int resultado = contandoVogais(textoParaTestar);
		
		// O main decide como exibir o resultado
		System.out.println("O número de vogais é: " + resultado);
		
		
		
	}

}
