package problems;

/**
 * find duplicate in an array of N+1 Integers
 * Time Complexity : o(n)
 *
 */
public class duplicateinArray {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,2};
		System.out.println(Solution.duplicate(n));
		
		int[] n1 = {1,2,3,4,4};
		System.out.println(Solution.duplicate(n1));
	}

	static class Solution {
		public static int duplicate(int[] n) {
			for (int i = 0; i < n.length; i++) {
				if (n[Math.abs(n[i])] > 0) {
					n[Math.abs(n[i])] = -1 * n[Math.abs(n[i])];
				} else {
					return Math.abs(n[i]);
				}
			}
			return 0;
		}
	}
}
