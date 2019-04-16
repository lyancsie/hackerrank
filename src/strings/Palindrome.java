package strings;

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    StringBuilder B = new StringBuilder();
    for(int i = A.length() - 1; i>=0; i--){
      B.append(A.charAt(i));
    }
    if(A.equals(B.toString())){
      System.out.print("Yes");
    }
    else{System.out.print("No");}

    String x = "z";
    System.out.println(x.compareTo("y"));
;
  }
  }

