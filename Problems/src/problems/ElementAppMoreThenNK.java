package problems;

import java.util.HashMap;
import java.util.Map;

public class ElementAppMoreThenNK {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 3, 5, 4, 2, 2, 3, 1, 1, 1 };

		Solution.elementMoreThenNK(a, 4);
	}

	static class Solution {
		public static void elementMoreThenNK(int[] a, int k) {
			Map<Integer, Integer> x = new HashMap<>();
			for (int y : a) {
				x.put(y, x.getOrDefault(y, 0) + 1);
			}

			int times = a.length / k;
			for (int key : x.keySet()) {
				if (x.get(key) > times) {
					System.out.println(key);
				}
			}
		}
	}

}
