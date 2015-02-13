package code;

import java.util.HashMap;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午8:16:32
 * @Index  171
 * @Description: Related to question Excel Sheet Column Title
 * 
 *               Given a column title as appear in an Excel sheet, return its
 *               corresponding column number.
 * 
 *               For example:
 * 
 *               A -> 1 
 *               B -> 2 
 *               C -> 3 
 *               ... 
 *               Z -> 26 
 *               AA -> 27 
 *               AB -> 28
 */
public class ExcelSheetColumnNumber {
	private final int OFFSET = 64;

	public int titleToNumber(String s) {
		int result = 0;
		
		for (int i = 0; i < s.length(); i++) {
			result += (Integer.valueOf(s.charAt(i)) - OFFSET) * Math.pow(26, s.length() - 1 - i);
		}
		return result;
	}
}
