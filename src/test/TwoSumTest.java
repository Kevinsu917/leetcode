package test;

import org.junit.Test;

import code.TwoSum;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午5:40:41
 * @Description: 
 */
public class TwoSumTest {

	@Test
	public void testtwoSum()
	{
		int[] array = {-1,7,11, 8,5,1,4,15};
		int target = 9;
		
		TwoSum sum = new TwoSum();
		int[] result = sum.twoSum(array, target);
		
//		int[] expected = {};
//		Assert.assertArrayEquals(expected, sum.twoSum(array, target));
		for(int i = 0; i < result.length; i++)
		{
			System.out.print("index=" + result[i]);
		}
	}
}
