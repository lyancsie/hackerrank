package interview;

public class ArrayFiller {

  public static void main(String[] args) throws CloneNotSupportedException, Exception {
    int[][] myIntArray = new int[52636][99];
    for (int i = 0; i < myIntArray.length; i++) {
      for (int j = 0; j < myIntArray[j].length; j++) {
        myIntArray[i][j] = 5 - i;
      }
    }

    for (int i = 0; i < myIntArray.length; i++) {
      for (int j = 0; j < myIntArray[j].length; j++) {
        System.out.print(myIntArray[i][j] + " ");
      }
      System.out.println();
    }
  }
}