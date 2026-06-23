package aula_05_array;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//12:38-->13:03 -->25 minutos
		//Declaração Scanner
		Scanner leia = new Scanner(System.in);
		
		//Declaração da matriz - lerá a nota de 2 alunos
		float matrizNotas[][] = new float[2][4];//Explicar melhor essa estrutura
		
		//Leitura dos dados da matriz
		for(int lin = 0; lin < matrizNotas.length; lin++) { //matrizNotas.length --> Retorna qtd de linhas da matriz
			for(int col = 0; col < matrizNotas[lin].length; col++) { //Para retornar o número de colunas de uma matriz (array bidimensional) em Java, você usa o atributo .length especificando uma linha específica, geralmente a primeira.A fórmula básica é:int colunas = matriz[0].length;
				System.out.printf("\nDigite a nota [%d][%d] = ",lin, col); //lin e col são inteiros logo d, estava errando pois coloquei %f, n se aplica nesse caso estava confundido a matriz com lin e col
				matrizNotas[lin][col] = leia.nextFloat();
			}
			
		}
		//Precisei olhar sobre a função length, não sabia aplica-la direito
		
		
		//Calculo da média e salvar em um vetor, no caso o tamanho do vetor = 2 porque é a quantidade de linahs da matriz de notas
		//Declaração do vetor
		float vetorMedias[] = new float[2];
		
		//Calculo da média e guardar ela dentro do novo vetor criado
		for(int lin = 0; lin < matrizNotas.length; lin++) {//cada linha = novo aluno 
			//Declaração da variavel media, sera zerada a cada novo aluno
			float media = 0;
			//Percorrer todas as notas de cada aluno
			for(int col = 0; col < matrizNotas[lin].length; col++) { 
				media = media + matrizNotas[lin][col];
			}
			//Guardar a média no vetor de medias
			vetorMedias[lin] = media/matrizNotas[0].length;
			
			
		}
		///
		/// Exibição do vetorMedias 
		for(int lin = 0; lin < vetorMedias.length; lin++) {  
			System.out.printf("\nMedia das notas [%d]=[%f]",lin,vetorMedias[lin]);
		}
		
	}

}
