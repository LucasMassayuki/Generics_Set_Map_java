package application;

import java.util.Scanner;
import services.PrintService;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);//vai add os valores digitados
		}

		ps.print();//vai imprimir os números digitados
		String x = ps.first();//ps.first() vai mostrar o primeiro "número" digitado
		System.out.println("First: " + x);
		sc.close();

	}

}
