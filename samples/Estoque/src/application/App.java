package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite uma quantidade de itens para o estoque: ");
		int estoque = keyboard.nextInt();
		
		while( estoque != 0 ) {
			if ( estoque > 0 ) {
				System.out.println("Estou vendendo! Estoque atual: " + estoque + " itens");
				estoque--;
			} else {
				System.out.println("Estou comprando! Estoque pendente: " + (-1*estoque) + " itens");
				estoque++;
			}
		}
		
		System.out.println("Fim do programa");
		
	}

}
