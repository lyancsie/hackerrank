package warmup;

import java.util.Scanner;

// Complete the plusMinus function below.
public class PlusMinus {

  static void plusMinus(int[] arr) {
    double positive = 0;
    double negative = 0;
    double zeros = 0;
    for (int i = 0; i < arr.length; i++) {
      if(arr[i] == 0){zeros++;}
      else if(arr[i] > 0){positive++;}
      else{negative++;}
    }
    System.out.println(positive/arr.length);
    System.out.println(negative/arr.length);
    System.out.println(zeros/arr.length);
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    plusMinus(arr);

    scanner.close();
  }
}


