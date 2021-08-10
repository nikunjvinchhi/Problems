package problems;

/**
 * 
 * Given an array that contains both positive and negative integers, find the
 * product of the maximum product subarray. Expected Time complexity is O(n) and
 * only O(1) extra space can be used.
 *
 */
public class MaxProductSubArray {

	public static void main(String[] args) {
		int[] a = { 6, -3, -10, 0, 2 };
		System.out.println(Solution.maxProductSubArray(a));

		int[] c = { -1, -3, -10, 0, 60 };
		System.out.println(Solution.maxProductSubArray(c));

		int[] b = { -2, -40, 0, -2, -3 };
		System.out.println(Solution.maxProductSubArray(b));
	}

	/*
	 * Input: arr[] = {6, -3, -10, 0, 2} Output: 180 // The subarray is {6, -3, -10}
	 * 
	 * Input: arr[] = {-1, -3, -10, 0, 60} Output: 60 // The subarray is {60}
	 * 
	 * Input: arr[] = {-2, -40, 0, -2, -3} Output: 80 // The subarray is {-2, -40}
	 * 
	 * 6,-3,-10
	 * here we need to check 3 compare let's say 
	 * 6*(-3) = -18, and -3 and 6. so minimum c is -18 and max = -3 and ans=6
	 * -3*-10 = 30, -18*-10=180, so b=180 and ans=180
	 */

	static class Solution {
		public static int maxProductSubArray(int[] a) {
			int ans = Integer.MIN_VALUE;
			int b = 1;
			int c = 1;
			for (int i = 0; i < a.length; i++) {
				int temp = b * a[i];
				b = Math.max(a[i], Math.max(temp, c * a[i]));
				c = Math.min(a[i], Math.min(temp, c * a[i]));

				ans = Math.max(ans, b);
			}
			return ans;
		}
	}
}
