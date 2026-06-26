package colaboradores_POO;

public class Validacao {

	public static void validarNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) //trim tira espaços em branco no coemço e final / Checa se é null/vazia e se tamanho 0 
			throw new IllegalArgumentException("Nome não pode ser vazio!"); //Se isso for true daí dispara uma exceção 
	}
	
	public static void validarEmail(String email) {
		if (!email.matches("^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9\\-]+(?:\\.[a-zA-Z0-9\\-]+)*\\.[a-zA-Z]{2,}$"))
			throw new IllegalArgumentException("Digite um e-mail válido!");
	}
	
	public static void validarSalario(double salario) {
		if (salario <= 0)
			throw new IllegalArgumentException("O Salário deve ser maior do que zero!");
	}
	
	public static void validarBonus(double bonus) {
		if (bonus < 0)
			throw new IllegalArgumentException("O Bônus deve ser maior ou igual a zero!");
	}
}