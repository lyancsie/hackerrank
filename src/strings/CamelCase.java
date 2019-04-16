package strings;

public class CamelCase {

  public static void main(String[] args) {
    System.out.println(camelCase("zeroOneTwoThreeFour"));
  }

  static int camelCase(String s) {
    int count = 1;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i))) {
        count += 1;
      }
    }
    return count;
  }
}
