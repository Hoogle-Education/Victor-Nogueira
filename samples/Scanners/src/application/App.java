package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = sc.nextLine();

		System.out.print("Digite a sua idade: ");
		int idade = sc.nextInt();
		sc.nextLine();

		System.out.print("Digite o seu endere�o: ");
		String endereco = sc.nextLine();

		System.out.print("Digite a sua nota na prova: ");
		double nota = sc.nextDouble();

		System.out.println("---------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Endere�o: " + endereco);

		if (nota >= 7.0) {
			System.out.println("Status: Aprovado!");
		} else if (nota >= 6.0) {
			System.out.println("Status: Regular!");
		} else if (nota >= 4.0) {
			System.out.println("Status Recupera��o!");
		} else {
			System.out.println("Status: Reprovado!");
		}
		
		sc.close();
	}

}
