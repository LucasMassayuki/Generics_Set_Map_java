package application;

import entities.Client;

public class Program {
	public static void main(String[] args) {
		//hashCode mostra se um Objeto é igual a outro
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "alex@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));//.equals() mostra se é igual com true/false
	}
}
