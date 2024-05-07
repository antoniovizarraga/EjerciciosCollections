package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;

public class ListaNombres {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<>();
		String userValue = "";
		int veces = 5;
		
		do {
			
			userValue = GetValue.getString("Introduzca un nombre: " + "(" +
			(lista.size() + 1) + "/" + veces + ")");
			
			if(!lista.contains(userValue)) {
				lista.add(userValue);
			}		
			
		} while(lista.size() < veces);
		
		Collections.reverse(lista);
		
		System.out.println(lista);
	}

}
