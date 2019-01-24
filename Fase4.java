package Paquet;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		List<Character> nom = new ArrayList<Character>();
		nom = createName();
		
		List<Character> cognom = new ArrayList<Character>();
		cognom = createSurname();
		
		List<Character> fullName = new ArrayList<Character>();
		fullName = joinArrays(nom, cognom);
		
		checkNumbers(fullName);
		
		checkVowels(fullName);
		
		checkLetters(fullName);

	}
	
	public static List<Character> createName() {
		
		List<Character> nom = new ArrayList<Character>();
		nom.add('A');
		nom.add('r');
		nom.add('n');
		nom.add('a');
		nom.add('u');
		
		return nom;
	}
	
	
	public static List<Character> createSurname(){
		List<Character> cognom = new ArrayList<Character>();
		
		cognom.add('p');
		cognom.add('l');
		cognom.add('a');
		
		return cognom;
	}
	
	
	public static List<Character> joinArrays(List<Character> nom1, List<Character> cognom1) {
		List<Character> fullName = new ArrayList<Character>();
		fullName.addAll(nom1);
		fullName.add(' ');
		fullName.addAll(cognom1);
		return fullName;
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
			}else if(i == ' '){
				System.out.println(i + " ");
			}else {
				System.out.println(i + " CONSONANT");
			}
		}
	}
	
	public static void checkLetters(List<Character> nom1) {
		Map<Character, Integer> dataMap = new HashMap<Character, Integer>();
		int c = 0;
		for(char i : nom1) {
			if(i != ' ') {
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

		}
		System.out.println(dataMap);
	}
}
