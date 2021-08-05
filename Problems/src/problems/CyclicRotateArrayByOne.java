package problems;

/**
 * Write a program to cyclically rotate an array by one.
 *
 */
public class CyclicRotateArrayByOne {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		Solution.rotate(n);
		System.out.print(n);
	}

	static class Solution {
		public static void rotate(int[] a) {
			int temp = a[a.length - 1];
			for (int i = 1; i < a.length; i++) {
				a[i] = a[i - 1];
			}
			a[0] = temp;
		}
	}
}
