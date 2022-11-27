package fpoo02.project014.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Isaac");
		list.add("gustavo");
		list.add("Bruno");
		
		
		//adicionando na posicao 2
		list.add(2, "Marco");
		
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println(list.size());
		
		list.remove("gustavo");
		System.out.println();
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("Indice de maria: " + list.indexOf("Maria"));
		
		System.out.println();
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(name);

		list.remove(1);
		System.out.println();
		for(String x : list) {
			System.out.println(x);
		}
		//remover com predicado
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println();
		for(String x : list) {
			System.out.println(x);
		}
		
		
		
	}

}
