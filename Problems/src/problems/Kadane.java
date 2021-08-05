package problems;

/**
 * 
 * find Largest sum contiguous Subarray [V. IMP]
 *
 */
public class Kadane {

	public static void main(String[] args) {
		int[] n = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(Solution.largestSum(n));
	}

	// [-2,-3,4,-1,-2,1,5,-3]
	// sum = 4 -1 -2 + 1 + 5 = 7
	static class Solution {
		public static int largestSum(int[] num) {
			int a = 0;
			int b = Integer.MIN_VALUE;
			for (int i = 0; i < num.length; i++) {
				a = Math.max(a + num[i], num[i]);
				b = Math.max(a, b);
				//System.out.println(a + " " + b + " ");
			}
			return b;
		}
	}
}
