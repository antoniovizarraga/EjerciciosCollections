package ejercicio02;

import java.util.LinkedHashSet;
import java.util.Random;

public class MapRnd {

	public static void main(String[] args) {
		LinkedHashSet<Integer> listaValores = new LinkedHashSet<Integer>();
		
		Random rnd = new Random();
		
		while(listaValores.size() < 10) {
			listaValores.add(rnd.nextInt(1, 21));
		}
		
		System.out.println(listaValores);
	
		
		

	}

}
