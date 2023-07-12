package in.kmnk;

public class Program1 {

	public static void main(String[] args) {
		boolean flag = false;

		String s1 = "mmmaheeeessh";// sdfhjdg
									// 01234567891011
		int start = 0;// 0
		while (start < s1.length()) { // 0<12
			for (int i = start + 1; i < s1.length(); i++) {// i=1,0,1,2 -
				if (s1.charAt(start) == s1.charAt(i)) { // s0==s1
					s1 = s1.substring(0, i) + s1.substring(i + 1);
					flag = true;
				}

				if (flag || s1.charAt(start) == s1.charAt(start + 1)) {
					i--;
					flag = false;
				}

			}
			start++;
		}
		System.out.println(s1);
	}
}
