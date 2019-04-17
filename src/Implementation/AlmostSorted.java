package Implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public class AlmostSorted {

  public static void main(String[] args) throws Exception {
    System.out.println(isSwappable(new int[]{1, 3, 2}));
    System.out.println(isSwappable(new int[]{3, 5, 4}));
  }

  // Complete the almostSorted function below.
  static void almostSorted(int[] arr) {
    boolean swappable = true;
    boolean reversible = true;
    boolean isGap = false;
    int counter = 0;

  }

  static boolean isReversible(int[] arr) {

    return false;

  }

  static int[] swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
    return arr;
  }

  static boolean isSwappable(int[] arr) throws Exception {

    Map<Integer, Integer> map = new HashMap<>();

    if (arr.length <= 2) {
      return true;
    }

    int counter = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        map.put(i, arr[i]);
      }
    }

/*    for (int i = 0; i < arr.length; i++) {
      if (arr[i+1] < arr[i]){
        map.put(i+1,arr[i+1]);
      }
    }*/
    System.out.println(map);

    if (map.size() > 2) {
      return false;
    }



    throw new RuntimeException();
  }

  static int[] reverse(int[] arr, int from, int to) {
    return new int[5];
  }
}


