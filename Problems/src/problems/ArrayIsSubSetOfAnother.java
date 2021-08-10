package problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two arrays: arr1[0..m-1] and arr2[0..n-1]. Find whether arr2[] is a
 * subset of arr1[] or not. Both the arrays are not in sorted order. It may be
 * assumed that elements in both array are distinct.
 *
 */
public class ArrayIsSubSetOfAnother {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 1, 2, 3, 9 };

		System.out.println(Solution.isSubSet(a, b));

		int[] c = { 1, 2, 3, 4, 5, 6 };
		int[] d = { 1, 2, 3 };

		System.out.println(Solution.isSubSet(c, d));
	}

	static class Solution {
		static boolean isSubSet(int[] a, int[] b) {
			Map<Integer, Integer> x = new HashMap<>();
			for (int n : a) {
				x.put(n, x.getOrDefault(n, 0) + 1);
			}
			for (int n : b) {
				if (x.getOrDefault(n, 0) > 0) {
					x.put(n, x.get(n) - 1);
				} else {
					return false;
				}
			}
			return true;
		}
	}

}
