package twoSum;

import java.util.HashMap;
import java.util.Map;

/*
	Given an array of integers and a target, return the indices of the two numbers that add up to the target number
	Assume that every case has only 1 solution and you may not use the same element twice
*/

//public class TwoSum {
//	public static void main(String[] args) {
//		int[] array = { 2, 11, 15, 7 };
//		int[] array2 = { 2, 3, 7, 4, 8 };
//		int target = 9;
//		int target2 = 7;
//		twoSum(array, target);
//		twoSum(array2, target2);
//	}
//
//	public static void twoSum(int[] array, int target) {
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				if (i != j) {
//					if ((array[i] + array[j] == target)) {
//						System.out.println(i);
//						System.out.println(j);
//						return;
//					}
//				}
//			}
//		}
//	}
//
//}
// Esta solucion e pouco eficiente, o(n2)

//-----------------------------------------------------------------

public class TwoSum {
	public static void main(String[] args) {
		int[] array = new int[] { 2, 3, 7, 4, 8 };
		int target = 6;
		int[] result = twoSum(array, target);
		System.out.print(result[0] + " " + result[1]);
	}

	public static int[] twoSum(int[] array, int target) {
		Map<Integer, Integer> usedNumbers = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			int diff = target - array[i];
			if (usedNumbers.containsKey(diff)) {
				return new int[] { i, usedNumbers.get(diff) };
			}
			usedNumbers.put(array[i], i);
		}
		return new int[] { -1, -1 };
	}

}