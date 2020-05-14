package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		// 2. Add five Strings to your list
		list.add("hi");
		list.add("salutations");
		list.add("heeey");
		list.add("wassup");
		list.add("hello there");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.println("String at element " + i + ": " + s);
		}
		System.out.println("");

		// 4. Print all the Strings using a for-each loop
		System.out.println("All Strings:");
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			System.out.print(s + ", ");
		}
		System.out.println("\n");

		// 5. Print only the even numbered elements in the list.
		System.out.println("Evens:");
		for (int i = 0; i < list.size(); i += 2) {
			String s = list.get(i);
			System.out.print(s + ", ");
		}
		System.out.println("\n");

		// 6. Print all the Strings in reverse order.
		System.out.println("Reverse Order:");
		for (int i = list.size()-1; i >= 0; i--) {
			String s = list.get(i);
			System.out.print(s + ", ");
		}
		System.out.println("\n");

		// 7. Print only the Strings that have the letter 'e' in them.
		System.out.println("Contains 'e':");
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if (list.get(i).contains("e")) {
				System.out.print(s + ", ");
			}
		}
		System.out.println("");

	}
}
