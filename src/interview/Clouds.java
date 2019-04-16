package interview;

public class Clouds {

  public static void main(String[] args) {

    System.out.println(jumpingOnClouds(new int[]{0, 0, 1, 0, 0, 1, 0}));
  }

  static int jumpingOnClouds(int[] c) {
    int i = 0;
    int count = 0;
    while (i+1 < c.length) {
      System.out.println(i);
      if (i + 2 < c.length && c[i + 2] == 0) {
        i += 2;
        count += 1;
      } else {
        i += 1;
        count += 1;
      }
    }
    return count;
  }
}
