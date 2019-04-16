package warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

  public static void main(String[] args) {

  }

  static int birthdayCakeCandles(int[] ar) {
    List<Integer> arList = new ArrayList<>();
    for (int i = 0; i < ar.length; i++) {
      arList.add(ar[i]);
    }
    int max = Collections.max(arList);

    int amount = 0;
    for (int i = 0; i < arList.size(); i++) {
      if (arList.get(i) == max) {
        amount += 1;
      }
    }
    return amount;
  }
}
