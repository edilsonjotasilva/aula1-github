package program;

import java.util.Scanner;

import util.ContaBancaria;

public class ExecutaContaBancaria {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char op, op2;
		double dep, saq;
		ContaBancaria c1 = new ContaBancaria(001, "Edilson");
		// DEPOSITOS
		System.out.println(c1.toString());
		do {
			System.out.println("Depositar: SIM(S)- FINALIZAR(F)");
			op = in.next().charAt(0);
			if (op == 's') {
				System.out.println("digite o valor do deposito: ");
				dep = in.nextDouble();
				c1.depositar(dep);
				System.out.println(c1.toString());
			} else if(op == 'f'){
				
				System.out.println(c1.toString());
				
			}else {
				System.out.println("opção invalida, digite novamente!");
			}
		} while (op != 'f');
		System.out.println(c1.getSaldo());
		
		// SAQUES
		
		do {
			System.out.println("Sacar: SIM(S)- FINALIZAR(F)");
			op2 = in.next().charAt(0);
			if (op2 == 's') {
				System.out.println("digite o valor do SAQUE: ");
				saq = in.nextDouble();
				c1.sacar(saq);
				System.out.println(c1.toString());
			} else if(op2 == 'f') {
				System.out.println(c1.toString());
				
			}else {
				System.out.println("opção invalida, digite novamente!");
			}
		} while (op2 != 'f');
		System.out.println(c1.getSaldo());

		in.close();

	}

}
