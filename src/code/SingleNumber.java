package code;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午7:27:39
 * @Index 136
 * @Description: Given an array of integers, every element appears twice except
 *               for one. Find that single one. Note: Your algorithm should have
 *               a linear runtime complexity. Could you implement it without
 *               using extra memory?
 */
public class SingleNumber {

	// tips:(x ^ x = 0)
	public int solution(int[] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result ^= A[i];
		}
		return result;
	}
}
