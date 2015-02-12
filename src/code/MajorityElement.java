package code;

import java.util.HashMap;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午8:03:52
 * @Index 169
 * @Description: Given an array of size n, find the majority element. The
 *               majority element is the element that appears more than ⌊ n/2 ⌋
 *               times.
 * 
 *               You may assume that the array is non-empty and the majority
 *               element always exist in the array.
 */
public class MajorityElement {

	public int majorityElement(int[] num) {

		HashMap<Integer, Integer> value = new HashMap<Integer, Integer>();
		int length = num.length;
		int halfLength = length / 2;
		for (int i = 0; i < length; i++) {
			int key = num[i];
			if (value.containsKey(key)) {
				value.put(key, value.get(num[i]) + 1);
			} else {
				value.put(key, 1);
			}

			if (value.get(key) > halfLength) {
				return key;
			}
		}

		return 0;
	}
}
