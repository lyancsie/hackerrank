package warmup;

import java.util.Arrays;
import java.util.List;

public class Triplets {

  public static void main(String[] args) {

    System.out.println("Hello World!");
    System.out.println(compareTriplets(Arrays.asList(1, 2, 1), Arrays.asList(1, 8, 1)));
  }

  static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    int custom1 = 0;
    int custom2 = 0;

    for (int i = 0; i < a.size(); i++) {
      if (a.get(i) > b.get(i)) {
        custom1 += 1;
      }
      if (b.get(i) > a.get(i)) {
        custom2 += 1;
      }
    }
    return Arrays.asList(custom1, custom2);
  }

}
