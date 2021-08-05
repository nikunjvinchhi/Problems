package problems;

/**
 * Minimum no. of Jumps to reach end of an array
 *
 */
public class MinimumJumpToReachEnd {

	public static void main(String[] args) {
		int[] nums = { 2, 1, 1, 1, 1 };
		System.out.println(Solution.getJumps(nums));
		System.out.println(Solution.getJumps(nums));

	}

	/*
	 * The Idea is to use greedy approach At each step we count the till which index
	 * we will reach. And if it's greater then current value we will update it. Then
	 * when we reach that index value we make the jump and update value. 0 1 2 3
	 * [2,1,1,1] at i=0; j = 2 and pos = 2;--------->Jump at i=1; x = 2, pos = 2 and
	 * j=2; at i=2; x = 3, pos = 3 and j = 3 (i == j so we will update j and we made
	 * the jump).-->Jump at i=3, x=4, pos=4 and j=4 (i==j so we updated j and made
	 * the jump) --->jump
	 */
	static class Solution {
		public static int getJump(int[] nums) {
			int j = 0;
			int index = 0;
			int pos = 0;
			int x = 0;
			int ans = 0;
			for (int i = 0; i < nums.length - 1; i++) {
				x = i + nums[i];

				if (pos < x) {
					pos = x;
				}

				if (i == j) {
					j = pos;
					ans++;
					if (j >= nums.length)
						break;
				}
			}
			return ans;
		}

		// [2,1,1,1,1]
		public static int getJumps(int[] nums) {
			int s = nums[0];
			int a = nums[0];
			int ans = 1;
			for (int i = 1; i < nums.length; i++) {
				if (i == nums.length - 1)
					return ans;

				a = Math.max(a, i + nums[i]);
				s--;
				if (s == 0) {
					s = a - i;
					ans++;
				}
			}
			return 0;
		}
	}

}
