package April2021PrepLeetcode;

import java.util.HashMap;
import java.util.Map;

public class _0567PermutationInString {
	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidbaooo"));
		System.out.println(checkInclusion("ab", "eidboaoo"));
	}

	public static boolean checkInclusion(String s1, String s2) {
		if (s1.length() > s2.length())
			return false;
		HashMap<Character, Integer> s1Map = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			s1Map.compute(s1.charAt(i), (k, v) -> v == null ? 1 : v + 1);
		}
		HashMap<Character, Integer> s2Map = new HashMap<Character, Integer>();

		int left = 0, right = 0;
		while (right < s2.length()) {
			char c = s2.charAt(right);
			s2Map.compute(c, (k, v) -> v == null ? 1 : v + 1);
			if (right >= s1.length() - 1) {
				if (mapIsEqual(s1Map, s2Map)) {
					return true;
				}
				c = s2.charAt(left);
				s2Map.put(c, s2Map.get(c) - 1);
				if (s2Map.get(c) == 0)
					s2Map.remove(c);
				left++;
			}
			right++;
		}
		return false;
	}

	public static boolean mapIsEqual(HashMap<Character, Integer> s1Map, HashMap<Character, Integer> s2Map) {
		if (s1Map.size() != s2Map.size())
			return false;

		for (Map.Entry<Character, Integer> entry : s1Map.entrySet()) {
			if (!s2Map.containsKey(entry.getKey()))
				return false;
			if (s2Map.get(entry.getKey()).intValue() != entry.getValue().intValue())
				return false;
		}
		return true;
	}

}
