package _01_IntroToArrayLists;

import java.util.ArrayList;
import java.util.Iterator;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList <String> string = new ArrayList();
		//   Don't forget to import the ArrayList class

		//2. Add five Strings to your list
		string.add("Bob");
		string.add("Joe");
		string.add("Susan");
		string.add("Karen");
		string.add("George");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < string.size(); i++) {
			System.out.println(string.get(i));
		}
		
				
		//4. Print all the Strings using a for-each loop
		for (String string2 : string) {
			System.out.println(string2);
		}
		
	
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < string.size(); i++) {
			if (i % 2 == 0) {
				System.out.println(string.get(i));
			}
			
			}
		
		//6. Print all the Strings in reverse order.
		
		for (int i = 4; i >= 0; i--) {
			System.out.println(string.get(i));
		}


				//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < string.size(); i++) {
			if (string.get(i).contains("e")) {
				System.out.println(string.get(i));
			}
			
		}
	}
}
