package java;

import java.util.HashMap;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午5:32:34
 * @Index 1
 * @Description: Given an array of integers, find two numbers such that they add
 *               up to a specific target number. The function twoSum should
 *               return indices of the two numbers such that they add up to the
 *               target, where index1 must be less than index2. Please note that
 *               your returned answers (both index1 and index2) are not
 *               zero-based. You may assume that each input would have exactly
 *               one solution. Input: numbers={2, 7, 11, 15}, target=9 Output:
 *               index1=1, index2=2
 */
public class TwoSum {

	public int[] solution(int[] numbers, int target) {

		int[] result = new int[2];
		/**
		 * key:target - indexValue value:position
		 */
		HashMap<Integer, Integer> valuePosMap = new HashMap<Integer, Integer>();
		int count = numbers.length;
		for (int i = 0; i < count; i++) {
			int indexValue = numbers[i];
			if (valuePosMap.containsKey(indexValue)) {
				result[0] = valuePosMap.get(indexValue) + 1;
				result[1] = i + 1;
				return result;

			} else {
				int targetValue = target - indexValue;
				valuePosMap.put(targetValue, i);
			}

		}
		return result;
	}

	// unpass:time limit error
	public int[] solution2(int[] numbers, int target) {
		int[] result = new int[2];

		int count = numbers.length;
		int firstIndex;
		int secondIndex;
		for (int i = 0; i < count; i++) {
			firstIndex = i;
			for (int j = i + 1; j < count; j++) {
				secondIndex = j;
				if (numbers[i] + numbers[j] == target) {
					result[0] = firstIndex + 1;
					result[1] = secondIndex + 1;
					return result;
				}
			}
		}
		return result;
	}
}
