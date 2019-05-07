package Implementation;

import java.util.SortedSet;
import java.util.TreeSet;

public class MaxIndexProduct {

  static int solve(int[] arr) {

    SortedSet<Integer> products = new TreeSet<>();

    for (int i = 1; i < arr.length - 1; i++) {
      int j = 1;
      int k = 1;
      while(!(arr[i-j]==0) || !(arr[i-j] > arr[i])){j--;}
      while (!(arr[i+k] == 0) || !(arr[i+k] > arr[i])){k++;}
      products.add((i-j) * (i+k));
    }
  return products.last();
  }

}
