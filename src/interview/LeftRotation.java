package interview;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.org.apache.xpath.internal.operations.Variable;
import com.sun.webkit.graphics.Ref;
import sun.reflect.Reflection;

import java.util.Map;

public class LeftRotation {

  public static void main(String[] args) {
    int[] result = rotLeft(new int[]{1, 2, 3, 4, 5}, 120);

    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i]);
    }
  }

  // Complete the rotLeft function below.
  static int[] rotLeft(int[] a, int d) {
    int temp = a[a.length - 1];
    for (int i = a.length - 1; i > 1; i--) {
      if (i > 2) {
        a[i - 2] = temp;
        temp = a[i - 3];
      } else {
        a[0] = a[a.length - 1];
      }
    }

    return a;
  }

}
