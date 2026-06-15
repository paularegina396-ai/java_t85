package aula_03_condicionais;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String texto1, texto2, texto3;
		//Ler as String digitadas pelo usuário
		System.out.println("Digite as informações(digite os acentos corretamente): ");
		texto1 = leia.next();
		texto2 = leia.next();
		texto3 = leia.next();
		
		//Verifica as condições vertebrado invertebrado
		if(texto1.equalsIgnoreCase("vertebrado")){
			//Verifica Ave mamifero
			if(texto2.equalsIgnoreCase("ave")) { //2case
				
				if(texto3.equalsIgnoreCase("carnívoro")) {//3case
					System.out.printf("Águia");
				}else if(texto3.equalsIgnoreCase("onívoro")) {//3case
					System.out.printf("Pomba");
				}else {//3case
				System.out.printf("Digitado errado, por favor digite corretamente no 3 texto");

				}
				
			}else if(texto2.equalsIgnoreCase("mamífero")) { //2case
				if(texto3.equalsIgnoreCase("onívoro")) {//3case
					System.out.printf("Homem");
				}else if(texto3.equalsIgnoreCase("herbívoro")) {//3case
					System.out.printf("Vaca");
				}else {//3case
				System.out.printf("Digitado errado, por favor digite corretamente no 3 texto");

				}
				
			}else {//2case
			System.out.printf("Digitado errado, por favor digite corretamente no 2 texto");
			}
			
			
		} else if(texto1.equalsIgnoreCase("invertebrado")){
			if(texto2.equalsIgnoreCase("inseto")) { //2case
				
				if(texto3.equalsIgnoreCase("hematófago")) {//3case
					System.out.printf("Pulga");
				}else if(texto3.equalsIgnoreCase("herbívoro")) {//3case
					System.out.printf("Lagarta");
				}else {//3case
				System.out.printf("Digitado errado, por favor digite corretamente no 3 texto");

				}
				
			}else if(texto2.equalsIgnoreCase("anelídeo")) { //2case
				if(texto3.equalsIgnoreCase("hematófago")) {//3case
					System.out.printf("Sanguessuga");
				}else if(texto3.equalsIgnoreCase("onívoro")) {//3case
					System.out.printf("Minhoca");
				}else {//3case
				System.out.printf("Digitado errado, por favor digite corretamente no 3 texto");

				}
				
			}else {//2case
			System.out.printf("Digitado errado, por favor digite corretamente no 2 texto");
			}
			
		}  else {
			System.out.printf("Digitado errado, por favor digite vertebrado ou invertebrado no primeiro texto");
		}
		
		
		
		leia.close();

	}

}
