package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Funcionario;

public class ExecutaFuncionario {
static int id;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Funcionario funcionario1 = new Funcionario(333,"Maria Braum",4000.00);
		Funcionario funcionario2 = new Funcionario(536,"Alex Grey",3000.00);
		Funcionario funcionario3 = new Funcionario(772,"Bob Green",5000.00);
		
		List<Funcionario>funcionarios = new ArrayList<>();
		funcionarios.add(funcionario1);
		funcionarios.add(funcionario2);
		funcionarios.add(funcionario3);
		
	
		System.out.println(funcionarios.toString());
		System.out.println("Entre com o  ID do funcionario a receber o aumento");
	    id = in.nextInt();
		Funcionario name = funcionarios.stream().filter(x -> x.getId() ==id).findFirst().orElse(null);
		if(name.getId()==id) {
			System.out.println("Entre com a porcentagem do aumento");
			double porcent = in.nextDouble();
			name.setSalario(name.getSalario()*(porcent/100)+name.getSalario());
			
		}
		System.out.println("Entre com o ID do Funcionario para procurar");
	    id = in.nextInt();
		name = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(name == null) {
			System.out.println("Funcionario inexistente!!");
		}
	//	System.out.print(name);
		System.out.println(funcionarios.toString());
		in.close();
	}

}
