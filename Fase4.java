package Paquet;

import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		List<Character> nom = new ArrayList<Character>();
		nom = createName();
		
		List<Character> cognom = new ArrayList<Character>();
		cognom = createSurname();
		
		List<Character> fullName = new ArrayList<Character>();
		fullName = joinArrays(nom, cognom);
		
		System.out.println(fullName);

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
	
}