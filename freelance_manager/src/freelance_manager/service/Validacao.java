package freelance_manager.service;

public class Validacao extends RuntimeException {
	
	public Validacao(String mensagem) {
		super(mensagem);// Passa o texto para o construtor da mãe armazenar
	}
	
		public static void validarvalorHora(double valorHora) {
			if (valorHora<=0) // Checa se é null/vazia e se tamanho 0 
				throw new Validacao("Valor hora não pode ser vazio nem ser <= 0!"); //Se isso for true daí dispara uma exceção 
		}//Antes usei throw new RuntimeException, mas dai todos os tipos precisam ser RuntimeException
	
	
	

}
