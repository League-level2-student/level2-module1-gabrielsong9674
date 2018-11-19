package intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> list = new ArrayList<String>();
		//   Don't forget to import the ArrayList class
		//2. Add five Strings to your list
		list.add("blue");
		list.add("green");
		list.add("yellow");
		list.add("orange");
		list.add("hi");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String s : list) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for(int j = 0; j < list.size(); j+=2) {
			System.out.println("even " +list.get(j));
		}
		//6. Print all the Strings in reverse order.
		for(int k = list.size() -1; k >= 0; k--) {
			System.out.println("rev "+list.get(k));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (String s : list) {
			if(s.contains("e")) {
			System.out.println(s);
			}
		}
	}
}
