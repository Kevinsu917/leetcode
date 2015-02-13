package code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月13日 上午10:29:19
 * @Index 3
 * @Description: Given a string, find the length of the longest substring
 *               without repeating characters. For example, the longest
 *               substring without repeating letters for "abcabcbb" is "abc",
 *               which the length is 3. For "bbbbb" the longest substring is
 *               "b", with the length of 1
 */
public class LongestSubstringWithoutRepeatingCharacters {

	
	//Submission Result: Time Limit Exceeded
	public int lengthOfLongestSubstring(String s) {

		// key:wrod,value:position
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		int times = 0;
		
		int maxLength = 0;
		int currentLength = 0;
		int strLength = s.length();

		for (int i = 0; i < strLength; i++) {
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				// because for loop will add 1,so no need to add// 1 here
				i = map.get(c);
				map.clear();

				maxLength = Math.max(maxLength, currentLength);
				currentLength = 0;
			} else {
				map.put(c, i);
				currentLength++;
			}
			times ++;
		}

		maxLength = Math.max(maxLength, currentLength);

		System.out.println("1==" + times);
		return maxLength;
	}

	//pass
	public int lengthOfLongestSubstring2(String s) {

		if(s == null || s.length() <= 0)
		{
			return 0;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		int length = s.length();
		int max = 0;
		int start = 0;
		int end = 0;
		
		for(;end < length; end++ )
		{
			Character c = s.charAt(end);
			if(map.containsKey(c) && map.get(c) >= start){
				start = map.get(c) + 1;
				map.remove(c);
			}
			map.put(c, end);
			max = Math.max(max, end - start + 1);
		}
		
		return max;
	}
	
	// @See http://blog.csdn.net/likecool21/article/details/10858799
	public int lengthOfLongestSubstring3(String s) {
		int length = s.length();
		if (length == 0) {
			return 0;
		}
		int[] countTable = new int[256];
		Arrays.fill(countTable, -1);
		int max = 1;
		int start = 0;
		int end = 1;

		countTable[s.charAt(0)] = 0;
		while (end < length) {
			// Has not reached a duplicate char
			if (countTable[s.charAt(end)] >= start) {
				start = countTable[s.charAt(end)] + 1;
			}
			max = Math.max(max, end - start + 1);
			countTable[s.charAt(end)] = end;
			end++;
		}
		return max;
	}
	
}
