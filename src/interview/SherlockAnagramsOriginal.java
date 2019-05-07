package interview;

import java.util.*;

public class SherlockAnagramsOriginal {

  public static void main(String[] args) {
    sherlockAndAnagrams("abba");
    sherlockAndAnagrams("abcd");
    sherlockAndAnagrams("ifailuhkqq");
    sherlockAndAnagrams("kkkk");
  }

  public static int sherlockAndAnagrams(String s) {

    List<String> substrings = new ArrayList<>();
    int size = 1;

    while (size < s.length()) {
      for (int i = 0; i < s.length() - size + 1; i++) {
        substrings.add(s.substring(i, i + size));
      }
      size++;
    }

    List<String> sortedSubstrings = new ArrayList<>();

    for (String element : substrings) {
      char[] c = element.toCharArray();
      Arrays.sort(c);
      //  System.out.println(new String(c));
      sortedSubstrings.add(new String(c));
    }
    System.out.println("size: " + sortedSubstrings.size());
    int counter = 0;
    for (int i = 0; i < sortedSubstrings.size(); i++) {
      for (int j = i; j < sortedSubstrings.size(); j++) {
        if (i != j && sortedSubstrings.get(i).equals(sortedSubstrings.get(j))) {
          counter++;
        }
      }
    }
    System.out.println(counter);
    return counter;
  }

}
