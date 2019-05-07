package expert;

import java.util.*;

public class CountSubstrings {

  public static void main(String[] args) {
    //TODO: check the size of the string
    //divide into smaller sections
    //count how many individual characters the divided sections have
    //TODO: calculate the formmulae to 2,3,4,5 individual characters on paper
    //if number > 5, collect all substrings, else just add the result to the number and move on
    String a = "aafsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43afsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43fsksste95eerwr4434444444444444wjreijreijei5iej5ieuier55i5iiiiririiiriiriii3i3i4i34i34i34i3i43";
    String x[] = divide(a, a.length() / 10);
    int counter = 0;
    for (int i = 0; i < x.length; i++) {
      //countSubstrings(5);
    }

    System.out.println("abcdabcdabcdeeee".length());
    for (String aX : x) {
      System.out.println(aX);
    }
  }

  static boolean isLong(String s, long limit) {
    return s.length() > limit;
  }

  static int individualCharacters(String s) {
    Set<Character> set = new HashSet<>();
    for (int i = 0; i < s.length(); i++) {
      set.add(s.charAt(i));
    }
    return set.size();
  }

  static String[] divide(String s, int n) {
    String[] divided = new String[n];
    int length = s.length() / n + 1;
    for (int i = 0; i < n; i++) {
      String x;
      if (i != n - 1) {
        divided[i] = s.substring(s.length() * i / n, s.length() * i / n + length - 1);
      } else {
        divided[i] = s.substring(s.length() * i / n);
      }
    }
    return divided;
  }

  static int[] countSubstrings(String s, int[][] queries) {

    if (s.length() > 100) {
      String[] divided = divide(s, 100);
    }
    return new int[]{0};
  }
}
