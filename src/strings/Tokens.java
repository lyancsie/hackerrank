package strings;
import java.io.*;
import java.util.*;

public class Tokens {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine();
      String[] sArray = new String[s.length()];
      sArray = s.split("-\\.\\'\\,");

      // Write your code here.
      scan.close();
    }
  }

