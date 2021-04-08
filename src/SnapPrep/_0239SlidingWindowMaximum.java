package SnapPrep;

import java.util.Arrays;

public class _0239SlidingWindowMaximum {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] { 1 }, 1)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] { 1, -1 }, 1)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] { 9, 11 }, 2)));
		System.out.println(Arrays.toString(maxSlidingWindow(new int[] { 4, -2 }, 2)));

	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int[] leftMax = new int[nums.length];
		int[] rightMax = new int[nums.length];

		for (int i = 0; i < nums.length;) {
			int left = i;
			int right = i + k < nums.length ? i + k - 1 : nums.length - 1;

			leftMax[left] = nums[left];
			left++;

			for (int j = left; j <= right; j++) {
				leftMax[j] = Math.max(leftMax[j - 1], nums[j]);
			}
			i += k;
		}

		for (int i = 0; i < nums.length;) {
			int left = i;
			int right = i + k < nums.length ? i + k - 1 : nums.length - 1;

			rightMax[right] = nums[right];
			right--;

			for (int j = right; j >= left; j--) {
				rightMax[j] = Math.max(rightMax[j + 1], nums[j]);
			}
			i += k;
		}

		for (int i = 0; i <= nums.length - k; i++) {
			nums[i] = Math.max(rightMax[i], leftMax[i + k - 1]);
		}

		return Arrays.copyOfRange(nums, 0, nums.length - k + 1);
	}

}
