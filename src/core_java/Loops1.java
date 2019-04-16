package core_java;

import java.util.Scanner;

public class Loops1 {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    for (int i = 0; i < 10; i++) {
      System.out.println(N + " x " + Math.addExact(1,i)  + " = " +(i+1)*N);
    }
    scanner.close();
  }
}
