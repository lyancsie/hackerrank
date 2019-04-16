package expert;

import java.util.*;

public class CountSubstrings {

  public static void main(String[] args) {
    System.out.println(countSubString("abcdabs", 0, 5));
    System.out.println("TEST: " + countSubString("aabaacccc", 1, 4));

    int[] a = countSubstrings("aabaa", new int[][]{{1, 1}, {1, 4}, {1, 1}, {1, 4}, {0, 2}});
    //   int[] b = countSubstrings("qqqqqqqqqqzrzrrzrzrrzrrzrzrrzrzrrzttttttttttttttttttttttttttttttttttttttttttttttttttttttqncpqzcxpbwa\n", new int[][]{{61, 97}, {15, 50}, {68, 89}});

    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
    System.out.println();

/*    for (int i = 0; i < b.length; i++) {
      System.out.println(b[i]);
    }*/
  }

  static int[] countSubstrings(String s, int[][] queries) {
    List<Integer> answers = new ArrayList<>();
    for (int i = 0; i < queries.length; i++) {
      //System.out.print(queries[i][0] + ";" + queries[i][1]);
      answers.add(countSubString(s, queries[i][0], queries[i][1]));
    }
    int[] answersArr = new int[answers.size()];
    for (int i = 0; i < answers.size(); i++) {
      answersArr[i] = answers.get(i);
    }

    return answersArr;
  }

  static int countSubString(String s, int x, int y) {
    if (x == y) {
      return 1;
    }

    List<String> values = new ArrayList<>();

    int size = 1;
    while (size <= s.length()) {
      for (int i = x; i + size < y + 2; i++) {
     //   if (i + size <= s.length()) {
          if (!values.contains(s.substring(i, i + size))) {
            values.add(s.substring(i, i + size));
    //      }
        }
      }

      size++;
    }
    System.out.println(values);
    return values.size();
  }
}
