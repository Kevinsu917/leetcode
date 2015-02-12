package test;

import org.junit.Assert;
import org.junit.Test;

import code.ExcelSheetColumnNumber;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午8:21:59
 * @Description: 
 */
public class ExcelSheetColumnNumberTest {

	@Test
	public void testtitleToNumber() {
		ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
		
		Assert.assertEquals(1, excelSheetColumnNumber.titleToNumber("A"));
		Assert.assertEquals(26, excelSheetColumnNumber.titleToNumber("Z"));
		Assert.assertEquals(27, excelSheetColumnNumber.titleToNumber("AA"));
		Assert.assertEquals(999, excelSheetColumnNumber.titleToNumber("ALK"));
	}
}
