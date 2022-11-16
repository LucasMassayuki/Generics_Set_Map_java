package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");//.put() para inserir
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");
		
		cookies.remove("email");//removendo com remove()
		cookies.put("phone", "99771133");//é o novo valor que vai ser imprimido
		//conteinsKey() mostra se existe 
		System.out.println("Conteins 'phone' key: " + cookies.containsKey("phone"));
		//mostra o 'valor' 
		System.out.println("Phone number: " + cookies.get("phone"));
		//quando não existe volta null
		System.out.println("Email: " + cookies.get("emial"));
		//Para ver o tamanho do elemento
		System.out.println("Size: " + cookies.size());
		
		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {//pegando as cheves de forma de Set
			System.out.println(key + ": " + cookies.get(key));//passando o valor com .get(key)
		}
	}

}
