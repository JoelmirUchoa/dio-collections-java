package src;
import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    	public static void main(String[] args) {
		// Exemplo sem Generics
		List listaSemGenerics = new ArrayList();
		listaSemGenerics.add("Elemento 1"); 
		listaSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto(String como um Integer(int)).

		// Exemplo com Generics //<String> o único tipo que será aceito
		List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Elemento 1");
		listaGenerics.add("Elemento 2");

		// Iterando sobre a lista com Generics
		for (String elemento : listaGenerics) {
			System.out.println(elemento);
		}

		// Iterando sobre a lista sem Generics (necessário fazer cast)
		for (Object elemento : listaSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
	}
}
