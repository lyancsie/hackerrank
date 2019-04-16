package core_java;

import java.util.Scanner;

public class Weird {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    weird(N);
    scanner.close();

  }

  static void weird(int N){
    if (N % 2 == 1 || (N <= 20) && (N >= 6)) {
      System.out.println("Weird");
    } else {
      System.out.println("Not Weird");
    }


  }
}