package warmup;

public class DiagonalDifference {

  public static void main(String[] args) {

  }

  static int diagonalDifference(int[][] arr) {
      int sum1 = 0;
      for (int i = 1; i <= arr[0].length; i++) {
        sum1 += arr[i-1][i-1];
      }
      int sum2 = 0;
      for (int i = 1; i <= arr[0].length; i++) {
        sum2 += arr[i-1][arr[0].length-i];
      }
      System.out.println(sum1);
      System.out.println(sum2);
      if (sum1 < sum2) {
        return sum2 - sum1;
      }
      return sum1 - sum2;
    }
}

