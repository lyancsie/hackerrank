package interview;

public class Repeated {

  public static void main(String[] args) {
    System.out.println(repeatedString("aba", 1000000000));
  }

  // Complete the repeatedString function below.
  static long repeatedString(String s, long n) {

    Long value = 0L;
    Long remainingValue = 0L;
    int remainingLength = 0;
    Long countPerIteration = 0L;
    if (n > s.length()) {
      for (int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == 'a') {
          countPerIteration++;
        }
      }
      remainingLength = (int) (n % s.length());
      for (int i = 0; i < remainingLength; i++) {
        if (s.charAt(i) == 'a') {
          remainingValue++;
        }
      }
      value = ((n / s.length()) * countPerIteration) + remainingValue;
    } else {
      for (int i = 0; i < n; i++) {
        value = (Integer.toUnsignedLong(i)) % s.length();
        if (s.charAt(value.intValue()) == 'a') {
          countPerIteration += 1;
        }
      }
    }
    return value;
  }
}
