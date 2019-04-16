package interview;

public class HourGlassSum {

  public static void main(String[] args) {
    int[][] x = new int[][]{
            {1, 1, 1, 1, 1, 1},
            {0, 125252, 0, 0, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {0, 1, 0, 0, 1, 0},
            {1, 1, 1, 1, 1, 1}
    };
    int[][] y = new int[][]{
            {2, 1, 1},
            {44, 1, 100},
            {1, 1, 1}
    };
    System.out.println(hourglassSum(x));
    System.out.println(hourglassSum(y));
  }

  // Complete the hourglassSum function below.
  static int hourglassSum(int[][] arr) {
    /*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
     */
    int highestSum = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + + arr[2][0] + arr[2][1] + arr[2][2];
    int actualSum = 0;
    for (int i = 0; i < arr[i].length - 2; i++) {
      for (int j = 0; j < arr[j].length - 2; j++) {
        actualSum += arr[j][i];
        actualSum += arr[j][i + 1];
        actualSum += arr[j][i + 2];
        actualSum += arr[j + 1][i + 1];
        actualSum += arr[j + 2][i];
        actualSum += arr[j + 2][i + 1];
        actualSum += arr[j + 2][i + 2];
        if (actualSum > highestSum) {
          highestSum = actualSum;
        }
        actualSum = 0;
      }
    }

    return highestSum;
  }
}
