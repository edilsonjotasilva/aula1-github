package couse;

import java.util.Scanner;

/*
 * Fazer um programa para ler um número inteiro N e uma matriz de ordem N 
 * contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidadede 
 * valores negativos damatriz.
 */
public class ExerciArray {
	static int diagonal;
	public static void main(String[] args) {

		
	
		Scanner in  = new Scanner(System.in);
		System.out.println("Escolha as dimenssões da Matriz:");
		int n = in.nextInt();
		System.out.println("Digite os numeros da Matriz");
		int[][]mat = new int[n][n];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int num = in.nextInt();
				mat[i][j] = num;
				
			}
						
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"   ");
				
			}
			System.out.println();
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] == mat[i][i]) {
					 diagonal = mat[i][j];
					 System.out.print( diagonal+ " ");
				}
				
			}
			
		}
	in.close();
	}

}
