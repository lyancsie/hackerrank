package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

  static boolean isAnagram(String a, String b) {
    // Complete the function

    a= a.toLowerCase();
    b= b.toLowerCase();

    Character[] charA = new Character[a.length()];
    Character[] charB = new Character[b.length()];

    for (int i = 0; i < a.length(); i++) {
      charA[i] = a.charAt(i);
    }

    for (int i = 0; i < b.length(); i++) {
      charB[i] = b.charAt(i);
    }

    Arrays.sort(charA);
    Arrays.sort(charB);

    return (Arrays.equals(charA, charB));
    /*HashMap<Character, Integer> freq1 = new HashMap<>();
    HashMap<Character, Integer> freq2 = new HashMap<>();

    for (int i = 0; i < a.length(); i++) {
      if (!freq1.containsKey(a.charAt(i))) {
        freq1.put(a.charAt(i), 1);
      } else {
        freq1.put(a.charAt(i), freq1.get(a.charAt(i)) + 1);
      }
    }

    for (int i = 0; i < b.length(); i++) {
      if (!(freq2.containsKey(b.charAt(i)))) {
        freq2.put(b.charAt(i), 1);
      } else {
        freq2.put(b.charAt(i), freq2.get(b.charAt(i)) + 1);
      }
    }

    return freq1.equals(freq2);*/
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}

