package aula_05_array;

import java.util.Scanner;

public class Ex4V2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 14:23-->14:31 ;;; 15:58-->16:08 -->Total:18 minutos
		//Gerar uma matriz String, com a primeira coluna de nomes e as outras de float
		//Declaração Scanner
				Scanner leia = new Scanner(System.in);
				
				//Declaração da matriz - lerá a nota de 2 alunos
				String matrizNotas[][] = new String[2][5];
				
				//Leitura dos dados da matriz
				for(int lin = 0; lin < matrizNotas.length; lin++) { //matrizNotas.length --> Retorna qtd de linhas da matriz
					for(int col = 0; col < matrizNotas[0].length; col++) { //Para retornar o número de colunas de uma matriz (array bidimensional) em Java, você usa o atributo .length especificando uma linha específica, geralmente a primeira.A fórmula básica é:int colunas = matriz[0].length;
						if(col == 0) {//Casos da 1 coluna = Nome
							System.out.printf("\nDigite o nome = ");
							matrizNotas[lin][col] = leia.next();
						} else {
							System.out.printf("\nDigite a nota [%d][%d] = ",lin, col); //lin e col são inteiros logo d, estava errando pois coloquei %f, n se aplica nesse caso estava confundido a matriz com lin e col
							matrizNotas[lin][col] = leia.next();
						}
					}
				}
				
				//Calculo da média e salvar em um vetor
				//Declaração do vetor
				float vetorMedias[] = new float[2];
				
				//Calculo da média, convertendo valores guardando de Stg pra float e guardar ela dentro do novo vetor criado
				for(int lin = 0; lin < matrizNotas.length; lin++) {//cada linha = novo aluno, precisa excluir a coluna 0 
					//Declaração da variavel media, sera zerada a cada novo aluno
					float soma = 0;
					//Percorrer todas as notas de cada aluno
					for(int col = 0; col < matrizNotas[lin].length; col++) { //Matriz de medias, não tem nome
						if(col != 0) {
							soma = soma + Float.parseFloat(matrizNotas[lin][col].replace(",","."));//Altera para Float e converte , para .
						}
						
					}
					//Guardar a média no vetor de medias
					// Antes de somar:
					// - Converte a nota de String para Float (Float.parseFloat)
					// - Substitui a virgula pelo ponto (replace)
					vetorMedias[lin] = soma/(matrizNotas[0].length-1);
					
					
				}
				///
				/// Exibição do vetorMedias 
				for(int lin = 0; lin < vetorMedias.length; lin++) {  
					System.out.printf("\nMedia das notas [%d]=[%f]",lin,vetorMedias[lin]);
				}
				
			}
		
		//Erro esqueci que agora são 1 nome + 4 notas então são 5 colunas
		
	}


