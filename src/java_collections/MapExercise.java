package java_collections;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExercise {

  // Complete the pairs function below.
  static int pairs(int k, int[] arr) {

    int counter = 0;

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      if (!map.containsKey(arr[i])) {
        map.put(arr[i], 1);
      } else {
        map.put(arr[i], map.get(arr[i] + 1));
      }
    }


     /* System.out.println(map);
      for(Integer item : map){
        for(Integer item2 : map){
          if(item - item2 == k){
            counter++;
          }
        }
      }*/
    return counter;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] nk = scanner.nextLine().split(" ");

    int n = Integer.parseInt(nk[0]);

    int k = Integer.parseInt(nk[1]);

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    int result = pairs(k, arr);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}

