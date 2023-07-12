package in.kmnk;

public class Program6 {

	public static void main(String[] args) {
		
		String sentence = "The quick brown fox jumps over the lazy dog";

		if (isPangram(sentence)) {
			System.out.println("The given string is a Pangram.");
		} else {
			System.out.println("The given string is not a Pangram.");
		}

	}

	public static boolean isPangram(String sentence) {
		sentence = sentence.toLowerCase();
		if (sentence.length() < 26) {
			return false;
		}
		
		int[] charArray = new int[26];
		
		for(int i=0; i<sentence.length();i++) {
			if(sentence.charAt(i)!=32) {
				charArray[sentence.charAt(i)-'a']++;
			}
		}
		
		for(int c:charArray) {
			if(c==0) {
				return false;
			}
		}
		
		return true;
	}
}