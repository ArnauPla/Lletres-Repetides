package Paquet;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {

		List<Character> nom = new ArrayList<Character>();
		nom = createNameArray();

		checkNumbers(nom);

		printNameInfo(nom);

	}

	public static List<Character> createNameArray() {

		List<Character> nom = new ArrayList<Character>();
		nom.add('A');
		nom.add('5');
		nom.add('n');
		nom.add('a');
		nom.add('u');

		return nom;
	}

	public static void checkNumbers(List<Character> nom1) throws Exception {

		char[] numeros = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

		for (char i : nom1) {
			for (char z : numeros) {
				if (i == z) {
					throw new Exception("Els noms de persones no contenen números!"); 
				}
			}
		}
	}

	public static void printNameInfo(List<Character> nom1) {
		for (char i : nom1) {
			i = Character.toLowerCase(i);
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				System.out.println(i + " VOCAL");
			} else {
				System.out.println(i + " CONSONANT");
			}
		}
	}
}