package warmup;

import java.math.BigInteger;
import java.util.*;

public class MinMaxSum {

  public static void main(String[] args) {
    miniMaxSum(new int[]{1, 100, 3, 4, 5});

  }

  static void miniMaxSum(int[] arr) {
    List<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      arrayList.add(arr[i]);
    }

    arrayList.sort(Comparator.naturalOrder());

    BigInteger sum = BigInteger.valueOf(0);
    for (int i = 0; i < arrayList.size() - 1; i++) {
      sum = sum.add(BigInteger.valueOf(arrayList.get(i)));
    }
    System.out.println(sum);


    arrayList.sort(Collections.reverseOrder());
    sum = BigInteger.valueOf(0);
    for (int i = 0; i < arrayList.size() - 1; i++) {
      sum = sum.add(BigInteger.valueOf(arrayList.get(i)));
    }
    System.out.println(sum);
  }
}
