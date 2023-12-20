package LearnArrayPrograms;

public class FirstMinandSecondMinOfArray {
	public static void main(String[] args) {
		int ar[] = { 4, 5, 6, 2, 3 };
		int fmin = ar[0];
		int smin = ar[0];
		for (int i = 0; i < ar.length; i++) {

			if (ar[i] < fmin)
				fmin = ar[i];
		}
		System.out.println("first minimum= " + fmin);

		for (int i = 0; i < ar.length; i++) {

			if (ar[i] > fmin) {

				for (int j = 0; j < ar.length; j++) {
					if (ar[i] < smin)
						smin = ar[i];
				}

			}

		}
		System.out.println("Second min = " + smin);
	}

}
