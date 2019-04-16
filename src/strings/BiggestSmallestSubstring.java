/*package strings;
import java.util.Scanner;

public class Solution {

  public static String getSmallestAndLargest(String s, int k) {

    String smallest = "";
    String largest = "";

    for (int i = 0; i < s.length() - k; i++) {
      if (smallest.compareTo(s.substring(i, i + k)) > 0) {
        smallest = s.substring(i, i + k);
      }
      if (largest.compareTo(s.substring(i, i + k) < 0)) {
        largest = s.substring(i, i + k);
      }
    }
    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'

    return smallest + "\n" + largest;
  }

}*/