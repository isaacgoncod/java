package exemplos.ex001.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Isaac");
		list.add("Gustavo");
		list.add("Melissa");
		list.add("Maria");
		list.add("Gabriel");
		
//		add no indice da lista
		list.add(2, "Bruno");
		
//		remover por indice
		list.remove(1);
		
//		remover por predicado(removendo os nomes que começam com M)
		list.removeIf(x -> x.charAt(0) == 'G');

//		mostrando o indice dos nomes
		list.indexOf("Isaac");
		
//		tamanho da lista
		System.out.println(list.size());
		
		for(String i: list) {
			System.out.println(i);
		}
		
		System.out.println();
		
//		Filtrar a lista e mostrar os nomes que começam com a letra M
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for(String i : result) {
			System.out.println(i);
		}
		
		System.out.println();
		
//		Encontrar o nome da primeira pessoa que começa com a letra M
		String nome = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);

		System.out.println(nome);

	}

}
