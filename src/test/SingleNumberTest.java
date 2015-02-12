package test;


import org.junit.Assert;
import org.junit.Test;

import code.SingleNumber;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午7:31:08
 * @Description: 
 */
public class SingleNumberTest {

	@Test
	public void testsolution()
	{
		int[] testArray = {1,2,3,4,3,2,1};
		
		SingleNumber sigleNumber = new SingleNumber();
		Assert.assertEquals(4, sigleNumber.solution(testArray));
	}
}
