package in.kmnk;

import java.util.Scanner;

public class Program5 {
	public static boolean areAnagrams(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();

		System.out.println("Create an array to count the occurrences of each character");
		int[] charCount = new int[26];

		System.out.println("Counting the occurrences of characters in the first word");
		for (int i = 0; i < word1.length(); i++) {
			// System.out.print(word1.charAt(i) - 'a'+", "); debug purpose only
			charCount[word1.charAt(i) - 'a']++;
			// System.out.println(charCount[word1.charAt(i) - 'a']); debug purpose only
		}

		System.out.println("\nDecreasing the count for characters in the second word");

		for (int i = 0; i < word2.length(); i++) {
			// System.out.print(word2.charAt(i) - 'a'+", "); debug purpose only
			charCount[word2.charAt(i) - 'a']--;
			// System.out.println(charCount[word2.charAt(i) - 'a']); debug purpose only
		}

		System.out.println("\nChecking if all counts are zero");
		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first word: ");
		String word1 = scanner.nextLine();

		System.out.print("Enter the second word: ");
		String word2 = scanner.nextLine();

		if (areAnagrams(word1, word2)) {
			System.out.println("The words are anagrams.");
		} else {
			System.out.println("The words are not anagrams.");
		}

		scanner.close();
	}
}