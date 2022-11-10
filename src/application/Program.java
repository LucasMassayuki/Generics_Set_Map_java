package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}
                        //qualquer tipo que extends number //Lista de destino é qualquer ripo de super Number 
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {//para cada number na lista de origin "source" 
			destiny.add(number);//add na lista destiny
		}
	}
	//Metodo generics para imprimir a lista 
	public static void printList(List<?> list) {
		for (Object obj : list) {//Lista de Object (qualquer tipo)
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
