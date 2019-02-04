package couse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		List<String>lista = new ArrayList<>();
		lista.add("Maria");
		lista.add("Alex");
		lista.add("Marco");
		lista.add("Bob");
		lista.add("Ana");
		System.out.println("tamanho da llista: "+lista.size());
		System.out.println("LISTA1: "+lista);
		System.out.println("--------------------------");		
		lista.removeIf(x -> x.charAt(0)== 'M');
				
		System.out.println("LISTA2: "+lista);
		
		List<String>result = lista.stream().filter(x -> x.charAt(0)=='A').collect(Collectors.toList());
		System.out.println("--------------------------");
		System.out.println("LISTA3: "+result);
		System.out.println("--------------------------");
		String name = lista.stream().filter(x -> x.charAt(0)=='A').findFirst().orElse(null);
		String name2 = lista.stream().filter(x -> x.charAt(0)=='Z').findFirst().orElse(null);
		System.out.println("--------------------------");
		System.out.println("primeiro nome coma a letra A : "+ name);
		System.out.println("primeiro nome coma a letra A : "+ name2);
		
		
		
		
	}

}
