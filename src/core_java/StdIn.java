package core_java;

import java.util.Scanner;

public class StdIn {

  public static void main(String[] args) {
    std();
  }

  public static void std() {

    Scanner scan = new Scanner(System.in);
    int i = scan.nextInt();
    double d = scan.nextDouble();
    scan.nextLine();
    String s = scan.nextLine();

    // Write your code here.

    System.out.println("String: " + s);
    System.out.println("Double: " + d);
    System.out.println("Int: " + i);
  }
}
