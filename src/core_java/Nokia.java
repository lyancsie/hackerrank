package core_java;

public class Nokia {

  public static void main(String[] args) {
    System.out.println(solution(5,"one"));
    System.out.println(solution(5, "two"));
    System.out.println(solution(5,"three"));
    System.out.println(solution(5,"four"));
    System.out.println(solution(5,"five"));
  }
  public static int solution(int D, String S) {
    // write your code in Java SE 8
    int s = 0;
    if(S.equals("one")){
      s=1;
    }
    if(S.equals("two")){
      s=2;
    }
    if(S.equals("three")){
      s=3;
    }
    if(S.equals("four")){
      s=4;
    }
    if(S.equals("five")){
      s=5;
    }
    return s*D;
  }

}
