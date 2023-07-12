package in.kmnk;

import java.util.HashSet;
import java.util.Set;

public class Program7 {

	// Better space complexity
	public static void isContainingUniqueCharacters(String s1) {
		boolean flag = true;
		int start = 0;
		while (start < s1.length()) {
			for (int i = start + 1; i < s1.length(); i++) {
				if (s1.charAt(start) == s1.charAt(i)) {
					flag = false;
				}
			}
			if (flag) {
				start++;
			} else {
				System.out.println("Given String not conataining all unique characters");
				System.out.println("Given String:: " + s1);
				break;
			}
		}
		if (flag) {
			System.out.println("Given String conataining all unique characters");
			System.out.println("Given String:: " + s1);
		}
	}

	// Better time complexity
	public static void isContainingUniqueCharactersUsingHashSet(String s1) {
		Set<Character> set = new HashSet<>();
		boolean flag = true;
		for (char c : s1.toCharArray()) {
			if (set.contains(c)) {
				flag = false;
				break;
			}
			set.add(c);
		}
		if (flag) {
			System.out.println("Given String conataining all unique characters");
			System.out.println("Given String:: " + s1);
		} else {
			System.out.println("Given String not conataining all unique characters");
			System.out.println("Given String:: " + s1);
		}
	}

	public static void main(String[] args) {

		String s1 = "mahes";
		isContainingUniqueCharactersUsingHashSet(s1);
	}
}
