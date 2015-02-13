package test;

import org.junit.Assert;
import org.junit.Test;

import code.LongestSubstringWithoutRepeatingCharacters;

/**
 * @author KevinSu kevinsu917@126.com
 * @create 2015年2月13日 上午11:22:05
 * @Description:
 */
public class LongestSubstringWithoutRepeatingCharactersTest {

	@Test
	public void testlengthOfLongestSubstring() {
		LongestSubstringWithoutRepeatingCharacters characters = new LongestSubstringWithoutRepeatingCharacters();
		
		String s = "aaaaa";
		String s1 = "abab";
		
		String s3 = "abcdefghijklmn";
		String s2 = "abcdefghijklmn";
		for(int i = 0; i < 2; i++ )
		{
			s2+=s3;
		}
		
		Assert.assertEquals(characters.lengthOfLongestSubstring3(s), characters.lengthOfLongestSubstring3(s));
		Assert.assertEquals(characters.lengthOfLongestSubstring3(s1), characters.lengthOfLongestSubstring3(s1));
		Assert.assertEquals(characters.lengthOfLongestSubstring3(s2), characters.lengthOfLongestSubstring3(s2));
	}
}
