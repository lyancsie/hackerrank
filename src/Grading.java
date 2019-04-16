import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grading {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(gradingStudents(new int[]{74, 20, 1, 0, 39, 99, 83, 43, 37, 57})));
  }

  static int[] gradingStudents(int[] grades) {

    //ha nagyobb mint 38 ÉS
    //ha a különbség a következő 5-tel osztható számig kisebb mint 3, akkor kerekítsen fel

    int counter = 0;
    int temp = grades[0];

    ArrayList<Integer> returnList = new ArrayList<>();
    for (int i = 0; i < grades.length; i++) {
      temp = grades[i];
      if (grades[i] >= 38) {
        while (temp % 5 != 0) {
          temp = grades[i];
          counter += 1;
          temp += 1;
        }
        returnList.add(temp);
      } else {
        returnList.add(grades[i]);
      }
    }
    int[] returnArray = new int[returnList.size()];
    for (int i = 0; i < returnList.size(); i++) {
      returnArray[i] = returnList.get(i);
    }
    return returnArray;
  }

}
