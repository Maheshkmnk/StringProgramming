package in.kmnk;

public class Program4 {
	public static void main(String args[]) {
		String s1 = "s@d&ehai!jsdosud)+g-";
		int specialCount = 0;
		int vowelCount = 0;
		int consonantsCount = 0;
		for (int i = 0; i < s1.length(); i++) {
			if ((s1.charAt(i) >= 32 && s1.charAt(i) <= 47) || (s1.charAt(i) >= 58 && s1.charAt(i) <= 64)
					|| (s1.charAt(i) >= 91 && s1.charAt(i) <= 96) || (s1.charAt(i) >= 123 && s1.charAt(i) <= 126)) {
				specialCount++;
			}

			if ((s1.charAt(i) >= 65 && s1.charAt(i) <= 90) || (s1.charAt(i) >= 97 && s1.charAt(i) <= 122)) {
				if (Character.toString(s1.charAt(i)).equalsIgnoreCase("a")
						|| Character.toString(s1.charAt(i)).equalsIgnoreCase("e")
						|| Character.toString(s1.charAt(i)).equalsIgnoreCase("i")
						|| Character.toString(s1.charAt(i)).equalsIgnoreCase("o")
						|| Character.toString(s1.charAt(i)).equalsIgnoreCase("u")) {

					vowelCount++;
				} else {
					consonantsCount++;
				}
			}
		}

		System.out.println("Consonants:: " + consonantsCount + "\nVowels Count:: " + vowelCount
				+ "\nSpecial Characters Count:: " + specialCount);
	}
}
