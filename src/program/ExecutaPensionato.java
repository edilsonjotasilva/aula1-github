package program;

import java.util.ArrayList;
import java.util.List;

import util.Pensionato;

public class ExecutaPensionato {

	public static void main(String[] args) {
		Pensionato[]aluno = new Pensionato[10];
			for(int i=0;i<aluno.length;i++) {
			
			aluno[5]= new Pensionato("Edilson","eilsonsilva@gmail.com;",6);
			aluno[3]= new Pensionato("Bruno","brunosilva@gmail.com;",4);
			aluno[2]= new Pensionato("Wilker","wilkersilva@gmail.com;",3);
			aluno[9]= new Pensionato("Danilo","danilosilva@gmail.com;",10);
			aluno[7]= new Pensionato("Maria","mariasilva@gmail.com;",8);
			if(aluno[i]== null) {
				aluno[i]= new Pensionato("DISPONIVEL","XXXXXXXXX",i+1);
				}
			System.out.println(aluno[i]);
			
			
		}
//		for(int i =0;i<aluno.length;i++) {
//			System.out.println(aluno[i]);
//			if(aluno[i]== null) {
//				
//			}
		}
		
	}


