package interview;

import java.util.*;

public class SockMerchant {

  public static void main(String[] args) {

    System.out.println(sockMerchant(6, new int[]{1, 2, 1, 1, 100, 1}));

  }

  static int sockMerchant(int n, int[] ar) {
    Map<Integer, Integer> newMap = new HashMap<>();
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (newMap.containsKey(ar[i])) {
        newMap.replace(ar[i], newMap.get(ar[i]) + 1);
        if (newMap.get(ar[i]) % 2 == 0) {
          count++;
        }
      } else {
        newMap.put(ar[i], 1);
      }
    }
    return count;


  }
}
