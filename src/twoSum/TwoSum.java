package twoSum;

/*
	Given an array of integers and a target, return the indices of the two numbers that add up to the target number
	Assume that every case has only 1 solution and you may not use the same element twice
*/

public class TwoSum {
	public static void main(String[] args) {
		int[] array = { 2, 11, 15, 7 };
		int[] array2 = { 2, 3, 7, 4, 8 };
		int target = 9;
		int target2 = 7;
		twoSum(array, target);
		twoSum(array2, target2);
	}

	public static void twoSum(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					if ((array[i] + array[j] == target)) {
						System.out.println(i);
						System.out.println(j);
						return;
					}
				}
			}
		}
	}

}
