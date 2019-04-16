package warmup;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VeryBigSum {

  public static void main(String[] args) {
    long[] list = new long[10];

    for (int i = 0; i < list.length; i++) {
      list[i] = 1000000;
    }
    BigInteger sum = BigInteger.valueOf(0);


    System.out.println(aVeryBigSum(list));
  }

  public static BigInteger aVeryBigSum(long[] ar) {
    BigInteger sum = BigInteger.valueOf(0);

    for (int i = 0; i < ar.length; i++) {
      sum = sum.add(BigInteger.valueOf(ar[i]));
    }
    return sum;
  }
}
