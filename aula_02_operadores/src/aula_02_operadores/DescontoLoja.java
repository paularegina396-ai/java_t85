package aula_02_operadores;

import java.util.Scanner;

public class DescontoLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double VALOR_MINIMO_FRETE_GRATIS = 150.00;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o valor total da compra: R$ ");
		double valorCompra = leia.nextDouble();
		
		System.out.print("O cliente é Prime? ");
		boolean isPrime = leia.nextBoolean();
		
		boolean ganhouFrete = valorCompra >= VALOR_MINIMO_FRETE_GRATIS;
		
		System.out.println("--- Sttaus do Pedido ---");
		System.out.printf("\nValor da compra: R$ %.2f", valorCompra);
		System.out.printf("\nCliente Prime? %b", isPrime);
		System.out.printf("\nFrete grátis? %b", ganhouFrete);
		
		leia.close();

	}

}
