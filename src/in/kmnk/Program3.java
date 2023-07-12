package in.kmnk;

public class Program3 {
	public static void main(String args[]) {
		int num = 2552;
		String s2 = "";
		String s1 = Integer.toString(num);

		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + Character.toString(s1.charAt(i));
		}

		System.out.println("Before reversing the number:: " + s1);

		System.out.println("After reversing the number:: " + s2);

		if (s1.equalsIgnoreCase(s2)) System.out.println("\nthe given number " + num + " is palindrome");
		else System.out.println("\nNot Palindrome");
	}
}
