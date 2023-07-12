package in.kmnk;

public class Program2 {
	public static void main(String args[]) {
		boolean flag = false;
		String s1 = "mmmaheeeessh";// sdfhjdg
									// 01234567891011
		int start = 0;// 0
		while (start < s1.length()) { // 0<12

			for (int j = 0; j < start; j++) {
				if (s1.charAt(start) == s1.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				for (int i = start + 1; i < s1.length(); i++) {// i=1,0,1,2 -
					if (s1.charAt(start) == s1.charAt(i)) { // s0==s1
						System.out.print(s1.charAt(i));
						break;
					}
				}
			}

			start++;
			flag = false;
		}
	}
}
