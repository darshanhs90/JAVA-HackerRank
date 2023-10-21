package Oct2023Leetcode;

import java.util.Arrays;

public class _0016ThreeSumClosest {

	public static void main(String[] args) {
		System.out.println(threeSumClosest(new int[] { -1, 2, 1, -4 }, 4));
		System.out.println(threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
		System.out.println(threeSumClosest(new int[] { 0, 1, 2 }, 3));
		System.out.println(threeSumClosest(new int[] { 0, 2, 1, -3 }, 1));
		System.out.println(threeSumClosest(new int[] { 0, 0, 0 }, 1));
	}

	public static int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length < 3)
			return 0;
		int closestSum = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for (int i = 0; i <= nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
					closestSum = sum;
				}

				if (sum > target) {
					right--;
				} else {
					left++;
				}
			}
		}
		return closestSum;
	}

}
