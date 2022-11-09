package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {// abrindo a arquivo

			String line = br.readLine();// ler todas as linhas do arquivo
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));// guardando na lista de inteiros do arquivo
				line = br.readLine();
			}

			Product x = CalculationService.max(list);//.max() vai encontrar o maior número da lista
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
