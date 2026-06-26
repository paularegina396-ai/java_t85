package colaboradores_POO;

public class Gerente extends Funcionario{

	private double bonus;
	//Método Construtor + Puxa a super da classe mãe
	public Gerente(String nome, String email, double salario, double bonus) {
		super(nome, email, salario);
		Validacao.validarBonus(bonus); //Atributo a mais
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		Validacao.validarBonus(bonus);
		this.bonus = bonus;
	}
	
	//Sobrescritas --> Vamos pegar o método da classe MÃE e add coisas
	@Override
	public double calcularSalario() {
		
		return this.getSalario() + this.bonus;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.printf("\nBônus: R$ %.2f", this.bonus);
		System.out.printf("\nO Salário do Gerente %s é R$ %.2f%n", this.getNome(), calcularSalario());
	}

}