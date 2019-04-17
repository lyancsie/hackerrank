package core_java.codility;

public class BinaryGap {
    public static int solution(int N) {
      // write your code in Java SE 8
      String a = Integer.toBinaryString(N);
      int max = 0;
      int counter = 0;
      for(int i = 0; i<a.length(); i++){
        if(a.charAt(i) == '0'){
          counter++;
        }
        else{
          if(counter > max){max = counter;
          counter = 0;}
        }
      }
      return max;
    }

  public static void main(String[] args) {
    System.out.println(solution(1041));
  }
  }

