package ejercicio03;

import java.util.HashMap;

public class FrecuenciaLetras {

	public static void main(String[] args) {
		HashMap<Character, Integer> abecedario = new HashMap<>();

		String textazo = "En un agujero en el suelo, vivía un hobbit. No un agujero húmedo, sucio, repugnante, con restos de gusanos y olor a fango, ni tampoco un agujero, seco, desnudo y arenoso, sin nada en que sentarse o que comer: era un agujero-hobbit, y eso significa comodidad";

		for (char ch = 'A'; ch <= 'Z'; ++ch) {
			abecedario.put(ch, 0);
		}

		for (char ch : textazo.toCharArray()) {
			for(char i : abecedario.keySet()) {
				if(i == ch) {
					abecedario.put(i, abecedario.getOrDefault(i, 0) + 1);
				}
			}
		}

		System.out.println(abecedario);

	}

}
