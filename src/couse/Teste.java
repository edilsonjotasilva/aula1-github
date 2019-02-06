package couse;


import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o seu nome");
		String nome = in.next();
		System.out.println("Meu nome é: "+ nome);
		in.close();

	}
}
