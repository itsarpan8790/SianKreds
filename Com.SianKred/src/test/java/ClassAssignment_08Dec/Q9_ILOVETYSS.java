package ClassAssignment_08Dec;

public class Q9_ILOVETYSS {
	public static void main(String[] args) {
		String s = "i love tyss";
		String s1 = s.replaceAll(" ", "");

		StringBuilder sb = new StringBuilder(s1);
		StringBuilder rev = sb.reverse();
		// System.out.println(rev);

//		int count = s1.length() - 1;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != ' ')
//				System.out.print(s1.charAt(count--));
//			else
//				System.out.print(s.charAt(i));
//
//		}
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				System.out.print(rev.charAt(count++));
			else
				System.out.print(s.charAt(i));

		}

	}

}
