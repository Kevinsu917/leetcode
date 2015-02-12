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

	HashMap<String, Integer> catMap = new HashMap<String, Integer>();

	public ExcelSheetColumnNumber() {
		// TODO Auto-generated constructor stub
		catMap.put("A", 1);
		catMap.put("B", 2);
		catMap.put("C", 3);
		catMap.put("D", 4);
		catMap.put("E", 5);
		catMap.put("F", 6);
		catMap.put("G", 7);
		catMap.put("H", 8);
		catMap.put("I", 9);
		catMap.put("J", 10);
		catMap.put("K", 11);
		catMap.put("L", 12);
		catMap.put("M", 13);
		catMap.put("N", 14);
		catMap.put("O", 15);
		catMap.put("P", 16);
		catMap.put("Q", 17);
		catMap.put("R", 18);
		catMap.put("S", 19);
		catMap.put("T", 20);
		catMap.put("U", 21);
		catMap.put("V", 22);
		catMap.put("W", 23);
		catMap.put("X", 24);
		catMap.put("Y", 25);
		catMap.put("Z", 26);
	}

	public int titleToNumber(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result += catMap.get(String.valueOf(s.charAt(i)))
					* Math.pow(26, s.length() - 1 - i);
		}
		return result;
	}
}
