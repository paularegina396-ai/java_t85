package atividade_pratica2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1Pratica2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub15:30-->15:54 errei coisas pequenas
		//Declaração da Coleção ArrayList
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//Scanner
		Scanner leia = new Scanner(System.in);
		//Leitura de dados e inclusão na ArrayList --> Isso precisa ir pro metodo de alguma forma kk
		
		//Possibilidade 1: Criar um for no método main, esse for vai ler as 5 numeros e jogar na arraylist
		System.out.println("Digite os 5 números inteiros: ");
		for(int cont = 0; cont < 5; cont++) {
			numeros.add(leia.nextInt());
		}
		
		//Possibilidade 1: Depois eu chaamria o método que vai fazer as 3 operações, ou um método pra cada
		
		analisarColecao(numeros);

	}
	
	public static void analisarColecao(ArrayList<Integer> numeros1) {
		//Aqui vamos fazer as 3 operações solicitadas, soma, média e encontrar o maior número
		//Laço para percorrer todos os itens na ArrayList
		int soma = 0, maiorNum = numeros1.get(0);
		double media=0.0;
		
		for(int cont = 0; cont<5; cont++) {
			
			soma = soma + numeros1.get(cont);
			if(numeros1.get(cont) > maiorNum) {
				maiorNum = numeros1.get(cont);
			}
			
		}
		media =soma/5.0; //daria pra colcoar direto no sysout? e outra coisa se for só/5 o java retorna sem casa decinaml na media kk
		System.out.printf("Soma: %d  | Média = %.1f | Maior Valor: %d",soma, media, maiorNum);
		
		
	}
	
	
	
	
	

}
