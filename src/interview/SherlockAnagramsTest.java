/*
package interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class SherlockAnagramsTest {

  @Test
  public void uniqueSubstringsSize_similarCharacters_lengthMinusOne() {
    Assertions.assertEquals("aaaaa".length() - 1, SherlockAnagrams.uniqueSubstrings("aaaaa").size());
    Assertions.assertEquals("bbbbbbbbbbb".length() - 1, SherlockAnagrams.uniqueSubstrings("bbbbbbbbbbb").size());
  }

  @Test
  public void uniqueSubstringSize_differentCharacters_toCalculate_sumFrom1ToSizeMinus1() {
    Assertions.assertEquals(differentChars(5), SherlockAnagrams.uniqueSubstrings("abcde").size());
    Assertions.assertEquals(differentChars(7), SherlockAnagrams.uniqueSubstrings("abcdefg").size());
  }

  public int differentChars(int n) {
    int sum = 0;
    for (int i = 2; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

}
*/
