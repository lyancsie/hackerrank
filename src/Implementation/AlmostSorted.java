package Implementation;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;

public class AlmostSorted {

  public static void main(String[] args) throws Exception {
    System.out.println(isSwappable(new int[]{5, 2, 3, 4, 1}));
    int[] arr = new int[]{1, 2};
    if (isSwappable(arr).equals("no")) {
    }
  }

  // Complete the almostSorted function below.
  static void almostSorted(int[] arr) {
    boolean swappable = true;
    boolean reversible = true;
    boolean isGap = false;
    int counter = 0;
  }

  static String isReversible(int[] arr) {

    int beginning = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (!(arr[i] <= arr[i + 1])) {
        beginning = i;
        break;
      }
    }
    int end = arr.length - 1;
    for (int j = beginning; j < arr.length - 1; j++) {
      if (!(arr[j] >= arr[j + 1])) {
        end = j;
        break;
      }
    }

    System.out.println("beginning: " + beginning + " end " + end);
    int newArray[] = new int[arr.length];
    int counter = 0;
    for (int i = 0; i < newArray.length; i++) {
      if (i < beginning || i > end) {
        newArray[i] = arr[i];
      } else {
        counter++;
        newArray[i] = arr[end - i + beginning];
      }
    }

    for (
            int j = 0;
            j < arr.length; j++) {
      System.out.println("old :" + arr[j] + " new :" + newArray[j]);
    }

    Arrays.sort(arr);

    if (Arrays.equals(newArray, arr)) {
      return "reverse " + beginning + " " + end;
    }
    return "no";
  }

  static int[] swap(int[] arr, int x, int y) {
    int temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
    return arr;
  }

  static String isSwappable(int[] arr) {
    //it has to give back the swappable values too
    if (arr.length <= 2) {
      return "swap 0 1";
    }

    int[] cloned = arr.clone();
    Arrays.sort(cloned);

    List<Integer> oddItems = new ArrayList<>();
    //position + value
    int counter = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != cloned[i]) {
        counter++;
        oddItems.add(i);
      }
    }
    if (counter > 2) {
      return "no";
    }
    if (counter == 0) {
      return "swap";
    }
    if (counter == 2) {
      if (Arrays.equals(swap(arr, oddItems.get(0), oddItems.get(1)), cloned)) {
        return "swap " + oddItems.get(0) + " " + oddItems.get(1);
      }
    }

    for (int i = 0; i < arr.length; i++) {
      if (Arrays.equals(swap(arr, i, oddItems.get(0)), cloned)) {
        return "swap " + i + " " + oddItems.get(0);
      }
    }
    return "no";
  }

  static int[] reverse(int[] arr, int from, int to) {
    return new int[5];
  }
}


