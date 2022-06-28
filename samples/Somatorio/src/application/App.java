package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de n: ");
		int n = sc.nextInt();
		
		int i = 1, soma = 0;
		
		while( i <= n ) {
			soma += i;
			i++;
		}
		
		int soma2 = (n*(n+1))/2;
		
		System.out.println("Soma manual = " + soma);
		System.out.println("Soma pela formula = " + soma2);
	}
	
}
