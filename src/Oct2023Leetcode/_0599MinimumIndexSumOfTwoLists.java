package Oct2023Leetcode;

import java.util.Arrays;

public class _0599MinimumIndexSumOfTwoLists {

	public static void main(String[] args) {
		System.out.println(
				Arrays.toString(findRestaurant(new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
						new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" })));

		System.out.println(
				Arrays.toString(findRestaurant(new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
						new String[] { "KFC", "Shogun", "Burger King" })));

		System.out.println(
				Arrays.toString(findRestaurant(new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
						new String[] { "KFC", "Burger King", "Tapioca Express", "Shogun" })));

		System.out.println(
				Arrays.toString(findRestaurant(new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" },
						new String[] { "KNN", "KFC", "Burger King", "Tapioca Express", "Shogun" })));

		System.out.println(Arrays.toString(findRestaurant(new String[] { "KFC" }, new String[] { "KFC" })));
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {

	}

}
