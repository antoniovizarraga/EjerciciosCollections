package ejercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaEnteros {

	public static void main(String[] args) {
		// Creamos un arraylist de enteros
		List<Integer> listaNum = new ArrayList<Integer>();
		
		// La rellenamos con valores del 1 al 10
		for(int i = 1; i <= 10; i++) {
			listaNum.add(i);
		}
		
		// Imprimimos el ArrayList con los valores ya almacenados
		System.out.println(listaNum);
		
		// Invocamos al método correspondiente para que intercambie
		// de posición los valores de forma aleatoria
		Collections.shuffle(listaNum);
		
		// Imprimimos el ArrayList con los valores ya cambiados.
		System.out.println(listaNum);

	}

}
