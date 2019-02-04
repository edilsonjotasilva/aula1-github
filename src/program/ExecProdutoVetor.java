package program;

import java.util.Scanner;

import util.ProdutoVetor;

public class ExecProdutoVetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double soma=0;
		double media;
		double maior;
		double menor;
	//	double[]maior = new double[3];
		//maior[0]= 0;
		ProdutoVetor[]  produto = new ProdutoVetor[3];
		for(int i=0; i<produto.length;i++) {
			System.out.println("digite o nome do "+ (i+1)+"° Produto");
			String nome = in.next();
			System.out.println("Digite o Preco: ");
			double preco = in.nextDouble();
			produto[i]= new ProdutoVetor(nome,preco);
			soma += produto[i].getPreco();
		
			}
			
			
		
		for(ProdutoVetor vetor : produto) {
			System.out.println(vetor.toString());
		}
		//media = soma/3;
		System.out.printf("Média: %.2f ", soma/3);
		
		in.close();
	}

}
