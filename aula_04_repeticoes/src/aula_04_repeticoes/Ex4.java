package aula_04_repeticoes;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
Scanner leia = new Scanner(System.in);
		
		int idade, idGenero,area, totalRespostas = 0,somaIdade=0, backend=0,cond2=0,cond3=0, cond4=0,cond5=0;
		double mediaIdades= 0.0;
		char continua = 'S';
		
		while (continua == 'S') {
			System.out.println("**********************************************");
			System.out.println("********** Pesquisa  *************************");
			System.out.println("**********************************************");
			
			//Leitura da idade
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();			
			
			
			idGenero=0;
			
			while (idGenero<1 || idGenero>6) {//limitando pelos extremos, leitura da identidade de genero
				System.out.println("Escolha sua identidade de Genero: ");
				System.out.println("1 - Mulher cis");
				System.out.println("2 - Homem cis");
				System.out.println("3 - Não Binario");
				System.out.println("4 - Mulher trans");
				System.out.println("5 - Homem trans");
				System.out.println("6 - Outros");
				
				idGenero = leia.nextInt();
			} 
			area=0;
			while (area<1 || area>4) {//limitando pelos extremos, leitura da pessoa desenvolvedora
				System.out.println("Escolha sua área: ");
				System.out.println("1 - Backend");
				System.out.println("2 - Frontend");
				System.out.println("3 - Mobile");
				System.out.println("4 - Fullstack");
				
				area = leia.nextInt();
			} 
			
			
			/*Estatísticas******************************************************************************************/
			//Total de pessoas que respondram a pesquisa
			totalRespostas ++;
			//Soma total das idades da spessoas que responeram a pesquisa
			somaIdade += idade; //Valor que já esta + idade digitada
			
			//Total de pessoas desenvolvedoras backend
			if(area == 1) {
				backend ++;
			}
			//O número de Mulheres Cis e Trans desenvolvedoras Frontend
			if((idGenero==1 || idGenero ==4) && area== 2)
				cond2 ++;
			
			//O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
			if((idGenero==2 || idGenero ==5) && area== 3 && idade>40)
				cond3 ++;
			
			//O número de Não Binários desenvolvedores FullStack menores de 30 anos
			if((idGenero==3 ) && area== 4 && idade<30)
				cond4 ++;
			
			//O número total de pessoas que responderam à pesquisa
				cond5 ++;
				
				
			
			do {
				//Saber se a pessoa quer ou não continuar, se SIM repete tudo
				System.out.println("Deseja continuar? (S/N)");
				continua = leia.next().toUpperCase().charAt(0);
			} while (!(continua =='S') && !(continua == 'N')); 
			
			
			
		}
		
		//Depois do Looping, printar as informações solicitadas
		mediaIdades = (double) somaIdade/totalRespostas;
		System.out.printf("Total de pessoas desenvolvedoras backend: %d\n", backend);
		System.out.printf("O número de Mulheres Cis e Trans desenvolvedoras Frontend: %d\n", cond2);
		System.out.printf("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: %d\n", cond3);
		System.out.printf("O número de Não Binários desenvolvedores FullStack menores de 30 anos: %d\n", cond4);
		System.out.printf("O número total de pessoas que responderam à pesquisa: %d\n", cond5);
		System.out.printf("Média das idades: %.2f\n", mediaIdades);
		leia.close();

	}

}
