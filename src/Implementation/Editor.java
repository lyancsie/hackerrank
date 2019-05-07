package Implementation;

import java.util.Scanner;

public class Editor {

  static String s = "";
  static Scanner read = new Scanner(System.in);


  public static void main(String[] args) {
    int size = read.nextInt();
    for (int i = 0; i < size; i++) {
      int x = read.nextInt();
      if(x==1){
        String w = read.nextLine();
        append(w);
      }
      if(x==2){
        int k = read.nextInt();
        delete(k);
      }
      if(x==3){
        int k = read.nextInt();
        System.out.println(s.charAt(k));
      }
      if(x==4){

      }
    }
  }
}
