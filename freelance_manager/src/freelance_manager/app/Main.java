package freelance_manager.app;

import java.util.ArrayList;
import java.util.List;

import freelance_manager.service.GestorFinanceiro;
import freelance_manager.service.Pagavel;
import freelance_manager.service.Validacao;
import freelance_manager.model.Programador;
import freelance_manager.model.Designer;
import freelance_manager.model.Prestador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instanciar uma Lista de pagáveis - porque uma lista da interface? em que situaqções fazemos isso Ç.Ç?
		List<Prestador> listaPrestadores = new ArrayList<>();
		
		//Criação dos objetos dentro do try catch
		try {
			
		//Criar um Programador e usar método para simular que ele trabalhou mais um pouco
		Programador programador = new Programador("Carlos", 40, -10, "Java");
		programador.registrarHoras(10); //aqui puxa o método direto da mãe, super
		
		//Criar um Designer e usar método para simular que ele trabalhou mais um pouco
		Designer designer = new Designer ("Jackeline", 30, 50, true);
		
		//Só addna Lista depois de validar
		//Adicionar ambos na listaPrestadores usando o .add()
		listaPrestadores.add(programador);
		listaPrestadores.add(designer);
		
		} catch(Validacao error) {//Duvida RuntimeException ou Validacao não deveria dar a mesma coisa?
			System.err.printf("Erro: %s", error.getMessage());
		}
		
		
		
		System.out.println("====== RELATÓRIO FINANCEIRO ======");
		for(Prestador prestador: listaPrestadores) {
			//Variavel que pega o nome do prestador
			String nome = prestador.getNome();
			//Valor bruto que o prestador recebe
			double bruto = prestador.calcularFaturamento();
			//Valor de impostos que fica retido
			double imposto =GestorFinanceiro.calcularImpostoRetido(bruto);
			
			
			//Passar esse resultado para o método estático
			//GestorFinanceiro.calcularImpostoRetido(prestador.calcularFaturamento());
			System.out.println("O prestador: " + nome + " vai receber bruto: "+bruto+ "e retido de imposto: "+imposto);
		}

	}

}
