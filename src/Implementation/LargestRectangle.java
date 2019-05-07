package Implementation;

public class LargestRectangle {

  public static void main(String[] args) {
  }

  // Complete the largestRectangle function below.
  static long largestRectangle(int[] h) {
    int max = h[0];
    int min = h[0];

    for (int i = 1; i < h.length; i++) {
      if (h[i] > max) {
        max = h[i];
      }
      if (h[i] < min) {
        min = h[i];
      }
    }
    System.out.println(max);

    long maxArea = min * h.length;
    int area ;

    for (int i = max; i > min; i--) {
      area = 0;
      for (int j = 0; j < h.length; j++) {
        if (h[j] >= i) {
          area += i;
          if (area > maxArea) {
            maxArea = area;
          }
        }
        else area = 0;
      }
    }
    return maxArea;
  }

}
