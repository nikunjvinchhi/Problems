package problems;

public class Sort012 {

	public static void main(String[] args) {
		int[] a = new int[10];

		Solution sol = new Solution();
		sol.sort(a);
	}
}

class Solution {
	/*
	 * Count Approach. Time Complexity : o(length of array)
	 */
	public void sort(int[] a) {

		// {0,1,0,1,1,1,2,0,2,2}
		// count number of 0's, 1's and 2's and then print.
		int zCount = 0;
		int oCount = 0;
		int tCount = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				zCount++;
			if (a[i] == 1)
				oCount++;
			if (a[i] == 2)
				tCount++;
		}

		for (int i = 0; i < zCount; i++)
			System.out.print("0 ");

		for (int i = 0; i < oCount; i++)
			System.out.print("1 ");

		for (int i = 0; i < tCount; i++)
			System.out.print("2 ");
	}

	/*
	 * Let's take 3 variable,
	 * a - for 0
	 * b - for 1
	 * c - for 2.
	 * And we know that we have to place 2 at last, 1 middle and 0 at starting.
	 * so when we encounter 0, we will swap it with 1 increment a and b both.
	 * and for 2 we will swap it with 1 and decrement c. Increment b in-case of no more one.
	 * and we will use b for conditioning in loop.
	 * 1,0,0,2,0
	 * so a = 0, b=0 and c = 4
	 * we encounter 1 so we just skip.
	 * now b at 1 and it's 0. so we will swap using a. and a = 0, so after swap it become 0,1.
	 * and a and b both will increment.
	 * now we at 0. so it will swap and became 0,0,1
	 * now we at 2, so it will swap with c with is 5. so 0,0,1,0,2. Here we don't increment b because
	 * swapped one might be zero. so we have to swap it with a pointing element.
	 */

	public void sortUsingOneLoop(int[] n) {
		int a = 0;
		int b = 0;
		int c = n.length - 1;

		while (b < n.length) {
			if (n[b] == 0) {
				swap(n, a, b);
				a++;
				b++;
			}else if (n[b] == 1) {
				b++;
			}else if(n[b] == 2 ) {
                if(b < c){
                    swap(n, b, c);
                    c--;    
                } else{
                    b++;
                }
			}
		}
	}

	public void swap(int[] n, int a, int b) {
		int t = n[a];
		n[a] = n[b];
		n[b] = t;
	}
}