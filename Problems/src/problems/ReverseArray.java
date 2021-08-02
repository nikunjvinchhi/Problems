package problems;

/**
 * 
 * Complexity Time : o(length of Array)
 *
 * Idea traverse the array to half elements and swap start and last element and
 * increment start pointer. When start pointer reaches to half of the length our
 * job is done.
 */
public class ReverseArray {

	public static void main(String[] args) {

		int[] a = new int[10];
		for (int i = 0; i < 10; i++)
			a[i] = i + 1;

		reverseArray(a);

		for (int i = 0; i < 10; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void reverseArray(int[] a) {
		int len = a.length;
		int x = 0;
		int limit = len / 2;
		while (x < limit) {
			int temp = a[x];
			a[x] = a[len - x - 1];
			a[len - x - 1] = temp;
			x++;
		}
	}
}
