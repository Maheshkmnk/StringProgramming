package in.kmnk;

import java.util.HashMap;
import java.util.Map;

public class Program8 {

	public static void main(String[] args) {
		boolean flag = false;
		int count = 1;
		int repeatCount = 1;
		char maxOccurLetter = 0;
		String s1 = "isggttddisksjst";

		int start = 0;

		Map<Character, Integer> map = new HashMap<>();

		while (start < s1.length()) {
			for (int i = start + 1; i < s1.length(); i++) {
				if (s1.charAt(start) == s1.charAt(i)) {
					s1 = s1.substring(0, i) + s1.substring(i + 1);
					count++;
					flag = true;
				}

				if (flag || s1.charAt(start) == s1.charAt(start + 1)) {
					i--;
					flag = false;
				}
			}
			if (count > repeatCount) {
				repeatCount = count;
				maxOccurLetter = s1.charAt(start);
				if (map.isEmpty()) {
					map.put(maxOccurLetter, repeatCount);
				} else {
					map.clear();
					map.put(maxOccurLetter, repeatCount);
				}
			} else if (count == repeatCount) {
				repeatCount = count;
				maxOccurLetter = s1.charAt(start);
				map.put(maxOccurLetter, repeatCount);
			}
			count = 1;
			start++;
		}

		if (map.size() == 1) {
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				System.out.println("Maximum occuring character in a given string is " + entry.getKey() + " and occured "
						+ entry.getValue() + " times");
			}
		} else {
			System.out.print("Maximum occuring characters in a given string in a same pace are ");
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {
				System.out.print(entry.getKey() + ", ");
				repeatCount = entry.getValue();
			}
			System.out.println("and Occured " + repeatCount + " times");
		}
	}
}
