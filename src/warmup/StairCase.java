package warmup;

import java.sql.Timestamp;

public class StairCase {

  public static void main(String[] args) {
    staircase(30000);

  }

  // Complete the staircase function below.
  static void staircase(int n) {
    Long x = System.currentTimeMillis();
    StringBuilder spaces = new StringBuilder();
    for (int i = 0; i < n - 1; i++) {
      spaces.append(" ");
    }
    String customChar = "#";
    for (int i = 0; i < n; i++) {
      System.out.print(spaces);
      System.out.print(customChar);
      if (spaces.length() > 0) {
        spaces.deleteCharAt(spaces.lastIndexOf(" "));
      }
      customChar += "#";
      System.out.println();
    }
    System.out.println(System.currentTimeMillis() - x);
    }
  static void staircase2 (int n) {
    Long x = System.currentTimeMillis();
    for (int i = n; i > 0; i--) {
      for (int j = 1; j <= n; j++) {
        if (i <= j) {
          System.out.print("#");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    System.out.println(System.currentTimeMillis() - x);

  }

  }




