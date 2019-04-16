package core_java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormat {

  public static void main(String[] args) {
x();
  }

  public static void x() {
    Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();

    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String  india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
    // Write your code here.

    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
  }
}

