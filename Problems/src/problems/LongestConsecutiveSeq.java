package problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence. You must write an algorithm that runs in O(n)
 * time.
 * 
 *
 */
public class LongestConsecutiveSeq {

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 1, 100 };
		System.out.println(Solution.longConsSqLen(a));
	}

	static class Solution {
		/*
		 * Sort the array and loop through it prev and current is diff -1 then incr.
		 * pointer. and then do Math.max(currentPointer, LongestPointer). And that have
		 * o(nlog(n)) where n is length of an array. Now to have in o(n) we think of
		 * using set.
		 */
		public static int longConsSqLen(int[] a) {

			Set<Integer> x = new HashSet<>();
			for (int n : a) {
				x.add(n);
			}
			int longest = 0;
			for (int temp : x) {
				if (!x.contains(temp - 1)) {
					int current = 1;
					int xtemp = temp + 1;
					while (x.contains(xtemp)) {
						current++;
						xtemp++;
					}
					longest = Math.max(longest, current);
				}
			}
			return longest;
		}
	}

}
