package code;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月12日 下午7:45:40
 * @Index 165
 * @Description: Compare two version numbers version1 and version2. If version1
 *               > version2 return 1, if version1 < version2 return -1,
 *               otherwise return 0.
 * 
 *               You may assume that the version strings are non-empty and
 *               contain only digits and the . character. The . character does
 *               not represent a decimal point and is used to separate number
 *               sequences. For instance, 2.5 is not "two and a half" or
 *               "half way to version three", it is the fifth second-level
 *               revision of the second first-level revision.
 * 
 *               Here is an example of version numbers ordering:
 * 
 *               0.1 < 1.1 < 1.2 < 13.37    1 = 1.0
 */
public class CompareVersionNumbers {

	public int compareVersion(String version1, String version2) {

		String[] version1Array = version1.split("\\.");
		String[] version2Array = version2.split("\\.");

		int maxCount = Math.max(version1Array.length, version2Array.length);

		for (int i = 0; i < maxCount; i++) {
			try {
				int version1Int = i < version1Array.length ? Integer
						.valueOf(version1Array[i]) : 0;
				int version2Int = i < version2Array.length ? Integer
						.valueOf(version2Array[i]) : 0;

				if (version1Int != version2Int) {
					return Integer.compare(version1Int, version2Int);
				}
			} catch (Exception e) {
				// 强转失败
				throw new ClassCastException("please input correct data");
			}
		}

		return 0;
	}
}
