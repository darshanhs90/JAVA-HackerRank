package Jan2021Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class _0127WordLadder {

	public static void main(String[] args) {
		System.out.println(ladderLength("hit", "cog",
				new ArrayList<String>(Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"))));

		System.out.println(
				ladderLength("hit", "cog", new ArrayList<String>(Arrays.asList("hot", "dot", "dog", "lot", "log"))));

		System.out.println(ladderLength("a", "c", new ArrayList<String>(Arrays.asList("a", "b", "c"))));
	}

	public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		Set<String> wordSet = new HashSet<String>(wordList);
		if (beginWord.equals(endWord) || !wordSet.contains(endWord))
			return 0;

		Queue<String> q = new LinkedList<String>();
		q.add(beginWord);
		int count = 0;
		while (!q.isEmpty()) {
			int size = q.size();
			for (int i = 0; i < size; i++) {
				String str = q.poll();
				if (str.equals(endWord))
					return count + 1;

				char[] cArr = str.toCharArray();
				for (int j = 0; j < cArr.length; j++) {
					char originalChar = cArr[j];
					for (char c = 'a'; c <= 'z'; c++) {
						cArr[j] = c;
						String newStr = new String(cArr);
						if (wordSet.contains(newStr)) {
							q.offer(newStr);
							wordSet.remove(newStr);
						}
					}
					cArr[j] = originalChar;
				}
			}
			count++;
		}
		return 0;
	}

}
