package Paquet;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		List<Character> nom = new ArrayList<Character>();
		nom = createArray();
		
		checkNumbers(nom);
		
		checkVowels(nom);
		
		checkLetters(nom);

	}
	
	public static List<Character> createArray() {
		
		List<Character> nom = new ArrayList<Character>();
		nom.add('A');
		nom.add('5');
		nom.add('n');
		nom.add('a');
		nom.add('u');
		
		return nom;
	}
	
	public static void checkNumbers(List<Character> nom1) {
		
		char[] numeros ={ '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		
		for(char i : nom1) {
			for(char z: numeros) {
				if(i == z) {
					System.out.println("Els noms de persones no contenen números!");
					return;
				}
			}
		}
	}
	
	public static void checkVowels(List<Character> nom1) {
		for(char i : nom1) {
			i = Character.toLowerCase(i);
			if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ) {
				System.out.println(i + " VOCAL");
			}else {
				System.out.println(i + " CONSONANT");
			}
		}
	}
	
	public static void checkLetters(List<Character> nom1) {
		Map<Character, Integer> dataMap = new HashMap<Character, Integer>();
		int c = 0;
		for(char i : nom1) {
			i = Character.toLowerCase(i);
			for(char j : nom1) {
				j = Character.toLowerCase(j);
				if(i==j) {
					c++;
				}
			}
			dataMap.put(i, c);
			c = 0;
		}
		System.out.println(dataMap);
	}
}
	
