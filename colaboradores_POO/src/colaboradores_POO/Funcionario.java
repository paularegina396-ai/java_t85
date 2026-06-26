package colaboradores_POO;

public abstract class Funcionario {
	
	private String nome;
	private String email;
	private double salario;
	//Método construtor
	public Funcionario(String nome, String email, double salario) {
		
		Validacao.validarNome(nome);
		Validacao.validarEmail(email);
		Validacao.validarSalario(salario);
		
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	//Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Validacao.validarNome(nome); //Se não validar o nome dispara a exceção, daí não cria o objeto
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Validacao.validarEmail(email); //Se não validar dispara a exceção
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		Validacao.validarSalario(salario);//Se não validar  dispara a exceção
		this.salario = salario;
	}
	
	//OUTROS MÉTODOS

	public void visualizar() {
		System.out.println("Nome: " + this.nome);//This. faz referencia aos atributos DA PRÓPRIA CLASSE
		System.out.println("E-mail: " + this.email);
		System.out.printf("Salário: R$ %.2f", this.salario);
	}

	public abstract double calcularSalario();
}