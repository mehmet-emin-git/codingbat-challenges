package code.codingbat.array1;

import java.util.Arrays;

/**
 * Given an array of ints length 3, return a new array with the elements in
 * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
 * 
 * reverse3([1, 2, 3]) → [3, 2, 1] reverse3([5, 11, 9]) → [9, 11, 5]
 * reverse3([7, 0, 0]) → [0, 0, 7]
 */

class ReverseThree {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 5, 11, 9 };
		int[] c = { 7, 0, 0 };

		System.out.println(Arrays.toString(reverse3(a)));
		System.out.println(Arrays.toString(reverse3(b)));
		System.out.println(Arrays.toString(reverse3(c)));
	}

	public static int[] reverse3(int[] nums) {
		int[] arr = { nums[2], nums[1], nums[0] };
		return arr;
	}
}