package aula_02_operadores;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float salarioBruto, addNoturno, hExtra, desconto, salarioLiquido;
		
		System.out.println("Digite  o salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o add noturno: ");
		addNoturno = leia.nextFloat();
		
		System.out.println("Digite ass horas extras: ");
		hExtra = leia.nextFloat();
		
		System.out.println("Digite o desconto: ");
		desconto = leia.nextFloat();
		
		salarioLiquido = salarioBruto + addNoturno + (hExtra * 5) - desconto;
		
		System.out.printf("\n Salário Líquido = %.2f  ", salarioLiquido);
	}

}
