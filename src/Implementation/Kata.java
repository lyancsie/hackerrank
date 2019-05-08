package Implementation;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Kata {

  public static void sort(String[] strings) {
    Arrays.sort(strings, (s1, s2) -> {
      if (s1.length() > s2.length()) {
        return 1;
      }
      return -1;
    });
  }

  public static int findShort(String s) {
    String[] divided = s.split(" ");
    sort(divided);
    return divided[0].length();
  }


    static List<Integer> sort(List<Integer> integers){

    integers.sort((o1, o2) -> {
        if (o1 % 2 == o2 % 2) {
          return 0;
        }
        if (o1 % 2 == 1) {
          return 1;
        }
        return -1;
      });
    return integers;
    }

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,5,7,9);
    List<Integer> list2 = Arrays.asList(2,32,414,225225221,1411211112,11112,992);
    sort(list);
    sort(list2);
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }
    System.out.println();
    for (int i = 0; i < list2.size() ; i++) {
      System.out.print(list2.get(i) + " ");
    }

  }
      static int find(int[] integers){
      sort(Arrays.stream(integers).boxed().collect(Collectors.toList()));
      if(integers[0] == integers[1]){
        return integers[integers.length-1];
      }
      return integers[0];
    }}

