package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import code.ExcelSheetColumnTitle;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午7:54:34
 * @Description: 
 */
public class ExcelSheetColumnTitleTest {

	@Test
	public void testconvertToTitle() {
		ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
		assertEquals("A", excelSheetColumnTitle.convertToTitle(1));
		assertEquals("Z", excelSheetColumnTitle.convertToTitle(26));
		assertEquals("AA", excelSheetColumnTitle.convertToTitle(27));
		assertEquals("ALK", excelSheetColumnTitle.convertToTitle(999));
	}
}
