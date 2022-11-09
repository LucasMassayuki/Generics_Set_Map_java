package services;

import java.util.List;

public class CalculationService {
	//tem que colocar <T> no método pra poder usar
	//Ele vai trabalhar com qualquer tipo T desde que o T seja qualquer subtipo de comparable
	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {//vai comparar de o item é maior que o outro
				max = item;
			}
		}
		return max;
	}
}
