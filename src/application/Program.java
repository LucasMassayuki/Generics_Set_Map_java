package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
	public static void main(String[] args) {
		//Set<String> set = new HashSet<>();//HashSet não garante a ordem 
		//Set<String> set = new TreeSet<>();//TreeSet imprimi em ordem alfabética
		Set<String> set = new LinkedHashSet<>();//Mantem na ordem com as ordem inseridos 
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		//System.out.println(set.contains("Notebook"));//.contains() se existe um elemento dentro do " "
		
		//set.remove("Tablet"); remove da lista 
		set.removeIf(x -> x.charAt(0) == 'T');//remove da lista o quem tem 'T'
		
		for (String p : set) {//vai imprimir os elementos dos conjuntos "set.add()"
			System.out.println(p);
		}
	}
}
