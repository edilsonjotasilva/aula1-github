package produto.executar;

import java.util.Scanner;

import produto.principal.Produto;

public class ProdutoExecutar {
	static String op;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Produto p1 = new Produto("TV", 1200.0);
		System.out.println(p1.toString());
		do {
		
		
			System.out.println("Adiciona (A)---Remove(R)---Sair(S)");
			op = in.next();
			if (op.equalsIgnoreCase("A")) {
				System.out.println("Escolha a quant para Adiciona");
				int quant = in.nextInt();
				p1.adicionaProduto(quant);
				System.out.println(p1.toString());
				
			} else if (op.equalsIgnoreCase("R")) {
				System.out.println("Escolha a quant para Remover");
				int quant = in.nextInt();
				p1.removeProduto(quant);
				System.out.println(p1.toString());

			} else if (op.equalsIgnoreCase("S")) {
				System.out.println("Fim de Programa!!!!");
				op = in.next("S");

			} else {
				System.out.println("Opção invalida, digite novamente");
			}
		} while (!op.equalsIgnoreCase("S")) ;
				
		System.out.println(p1.toString());
	}
}
