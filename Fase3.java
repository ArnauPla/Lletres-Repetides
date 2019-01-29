package Paquet;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		List<Character> nom = new ArrayList<Character>();
		nom = createNameArray();

		countName(nom);

	}

	public static List<Character> createNameArray() {

		List<Character> nom = new ArrayList<Character>();
		nom.add('A');
		nom.add('r');
		nom.add('n');
		nom.add('a');
		nom.add('u');

		return nom;
	}

	public static void countName(List<Character> nom1) {
		Map<Character, Integer> dataMap = new HashMap<Character, Integer>();
		for (char i : nom1) {
			i = Character.toLowerCase(i);
			if(dataMap.containsKey(i)) {
				dataMap.put(i, dataMap.get(i) + 1);
			} else {
				dataMap.put(i, 1);
			}
		}
		System.out.println(dataMap);
		
	}
}
