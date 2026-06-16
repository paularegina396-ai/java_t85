package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, esporte, totalRespostas = 0,somaIdade=0, futebol=0,voleiM18=0;
		double mediaIdades= 0.0;
		char continua = 'S';
		
		while (continua == 'S') {
			System.out.println("**********************************************");
			System.out.println("***    Pesquisa Sobre Esportes Favoritos   ***");
			System.out.println("**********************************************");
			System.out.print("Digite sua idade: "); //Usando print pro cursor ficar do lado
			idade = leia.nextInt();
			
			
			
			do {
				System.out.println("Escolha o seu esporte favorito: ");
				System.out.println("1 - Futebol");
				System.out.println("2 - Voleibol");
				System.out.println("3 - Basquetebol");
				System.out.println("4 - Outros");
				
				esporte = leia.nextInt();
			}while(esporte<1 || esporte>4); //limitando pelos extremos
			
			
			
			//Definir as estatisticas, calculos devem ser feitos antes
			/*Estatísticas******************************************************************************************/
			//Total de pessoas que respondram a pesquisa
			totalRespostas ++;
			//Soma total das idades da spessoas que responeram a pesquisa
			somaIdade += idade; //Valor que já esta + idade digitada
			
			//Totald e pessoas que gostam de futebol
			if(esporte == 1) {
				futebol ++;
			}
			//Total de pessoas que gostam de voleibol e são maiores de 18
			if(idade>18 && esporte== 2)
				//Não precia de {} para 1 condição 1 linha
				voleiM18 ++;
			
			do {
				//Saber se a pessoa quer ou não continuar,   não existe método especifico pa ler char, então vamos aaptar método de leitura de string para fazer a leitura do char
				System.out.println("Deseja continuar? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);//To upper case pega oq vc digitou e converte pra maiuscula e o chat add pega so o 1 caracter que vc digita
			} while (!(continua =='S') && !(continua == 'N')); //se não for S e N digita dnovo  --> Validação
			
			
			
		}
		
		mediaIdades = somaIdade/totalRespostas;
		System.out.printf("Total de pessoas que gostam de futebol: %d\n", futebol);
		System.out.printf("Total de pessoas maiores de 18 anos e que gostam de volei: %d\n", voleiM18);
		System.out.printf("Média das idades: %.2f\n", mediaIdades);
		leia.close();
	}

}
