package test;

import org.junit.Assert;
import org.junit.Test;

import code.MajorityElement;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午8:07:57
 * @Description: 
 */
public class MajorityElementTest {

	@Test
	public void testmajorityElement() {
		MajorityElement majorityElement = new MajorityElement(); 
		int[] testArray = {3,2,3,4,3,2,3,3,2,3};
		
		Assert.assertEquals(3, majorityElement.majorityElement(testArray));
	}
}
