package warmup;

import java.util.Arrays;

public class BreakingRecords {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(breakingRecords(new int[]{1, 0, 5, 2, 4, 1, 13, 4, 20})));
  }

  static int[] breakingRecords(int[] scores) {
    int biggest = scores[0];
    int biggestCount = 0;
    int smallest = scores[0];
    int smallestCount = 0;
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] < smallest) {
        smallestCount += 1;
        smallest = scores[i];
      }
      if (scores[i] > biggest) {
        biggestCount += 1;
        biggest = scores[i];
      }
    }
    return new int[]{biggestCount, smallestCount};
  }
}
