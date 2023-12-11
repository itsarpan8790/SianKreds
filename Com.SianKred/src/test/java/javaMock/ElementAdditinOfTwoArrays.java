package javaMock;

public class ElementAdditinOfTwoArrays {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 2, 4, 6, 8 };

		for (int i = 0; i < a2.length; i++) {

			for (int j = 0; j < a1.length; j++) {
				if (i == j)
					System.out.println(a1[i] + a2[j]);
			}
		}
	}

}
