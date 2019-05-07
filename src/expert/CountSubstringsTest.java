package expert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountSubstringsTest {

  @Test
  void isLong_smaller_false() {
    Assertions.assertFalse(CountSubstrings.isLong("abc", 5));
  }

  @Test
  void isLong_equal_false() {
    Assertions.assertFalse(CountSubstrings.isLong("abcde", 5));
  }

  @Test
  void isLong_bigger_true() {
    Assertions.assertTrue(CountSubstrings.isLong("abcdef", 5));
  }

  @Test
  void individualCharacters_onlyOneChar_1() {
    Assertions.assertEquals(1, CountSubstrings.individualCharacters("a"));
  }

  @Test
  void individualCharacters_sameCharnTimes_1() {
    Assertions.assertEquals(1, CountSubstrings.individualCharacters("aaaaaaaaaaaaaaaaaaaaa"));
  }

  @Test
  void individualCharacters_totallyDifferentCharacters_length() {
    String test = "abcdefghijklmnopqrst";
    Assertions.assertEquals(test.length(), CountSubstrings.individualCharacters(test));
  }

  @Test
  void individualCharacters_mixed_10() {
    Assertions.assertEquals(10, CountSubstrings.individualCharacters("aaaaabcdeffffffghij"));
  }

}
