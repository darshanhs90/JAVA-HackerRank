package Dec2020Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class _0018FourSum {

	public static void main(String[] args) {
		System.out.println(fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0));
		System.out.println(fourSum(new int[] {}, 0));
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		if (nums.length < 4)
			return output;
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		HashSet<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				int left = j + 1;
				int right = nums.length - 1;
				while (left < right) {
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if (sum == target) {
						list = new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
						if (!set.contains(list)) {
							set.add(list);
							output.add(list);
						}
						left++;
						right--;
					} else if (sum > target) {
						right--;
					} else {
						left++;
					}
				}
			}
		}
		return output;
	}

}
