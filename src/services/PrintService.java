package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T>{
//Lista do tipo T
	private List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);//vai add na lista 
	}

	public T first() {
		if (list.isEmpty()) {//se a lista está vazia
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);//caso ao contrário retorna na prieira da lista
	}

	public void print() {//para imprimir a lista 
		System.out.print("[");
		if (!list.isEmpty()) {//se a lista não estiver vazia 
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
