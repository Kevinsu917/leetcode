package test;

import org.junit.Assert;
import org.junit.Test;

import code.CompareVersionNumbers;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午7:47:40
 * @Description: 
 */
public class CompareVersionNumbersTest {

	@Test
	public void testcompareVersion() {
		CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
		
		Assert.assertEquals(0, compareVersionNumbers.compareVersion("1", "1.0"));
		Assert.assertEquals(1, compareVersionNumbers.compareVersion("0.101", "0.10"));
		Assert.assertEquals(-1, compareVersionNumbers.compareVersion("1.3323", "12.23"));
	}
}
