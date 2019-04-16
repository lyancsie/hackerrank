package core_java;

import java.util.Scanner;

public class StaticGame {

  static Scanner scanner = new Scanner(System.in);
  static boolean flag;
  static int B;
  static int H;
  static Exception exception = new Exception("Breadth and height must be positive");

  static {
    B = scanner.nextInt();
    H = scanner.nextInt();
    flag = ((B > 0) && (H > 0));
    if (!flag) {
      try {
        throw new Exception(exception);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }

  public static void main(String[] args) {
    if (flag) {
      int area = B * H;
      System.out.print(area);
    }

  }//end of main

}//end of class
