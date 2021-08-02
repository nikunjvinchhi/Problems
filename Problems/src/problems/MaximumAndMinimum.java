package problems;

/**
 * 
 * Complexity : o(length of array)
 *
 */
public class MaximumAndMinimum {

	public static void main(String[] args) {

		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = i + 1;

		maxMin(a);
	}

	private static void maxMin(int[] a) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}

		System.out.println("Maximum :: " + max);
		System.out.println("Maximum :: " + min);
	}
}
