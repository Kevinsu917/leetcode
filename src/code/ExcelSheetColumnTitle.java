package code;

import java.util.ArrayList;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午7:51:58
 * @Index 168
 * @Description: Given a positive integer, return its corresponding column title
 *               as appear in an Excel sheet.
 * 
 *               For example:
 * 
 *               1 -> A 2 -> B 3 -> C ... 26 -> Z 27 -> AA 28 -> AB
 */
public class ExcelSheetColumnTitle {

	private int modSize = 26;
	private final int OFFSET = 64;

	public String convertToTitle(int n) {

		String resultStr = "";
		ArrayList<Integer> resultList = new ArrayList<Integer>();

		if (n <= 0) {
			return "please input non-zero positive integer";
		}

		while (n > 0) {
			int index = n % modSize;
			resultList.add(index);
			n = n / modSize;
		}

		for (int i = 0; i < resultList.size(); i++) {
			if (i < resultList.size() - 1 && resultList.get(i) <= 0) {
				resultList.set(i, resultList.get(i) + modSize);
				if (i < resultList.size() - 1) {
					resultList.set(i + 1, resultList.get(i + 1) - 1);
				}
			}

			if (i == resultList.size() - 1) {
				if (resultList.get(i) <= 0) {
					resultList.remove(i);
					resultList.trimToSize();
				}
			}
		}

		for (int i = resultList.size() - 1; i >= 0; i--) {
			resultStr += (char) (resultList.get(i) + OFFSET);
		}

		return resultStr;
	}
}
