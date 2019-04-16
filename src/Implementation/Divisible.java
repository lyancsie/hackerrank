package Implementation;

public class Divisible {

  public static void main(String[] args) {

    System.out.println(divisibleSumPairs(6, 5, new int[]{1, 2, 3, 4, 5, 6}));
  }

  static int divisibleSumPairs(int n, int k, int[] ar) {

    int count = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i<j && ((ar[i] + ar[j]) % k) == 0) {
          count += 1;
        }
      }

    }
    return count;
  }

}

