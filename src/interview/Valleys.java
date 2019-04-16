package interview;

public class Valleys {

  public static void main(String[] args) {

  }

  // Complete the countingValleys function below.
  static int countingValleys(int n, String s) {
    int count = 0;
    int altitude = 0;
    int previousAltitude = 0;
    for (int i = 0; i < s.length(); i++) {

      previousAltitude = altitude;

      if(s.charAt(i) == 'U'){
        altitude+=1;
      }
      if(s.charAt(i) == 'D'){
        altitude-=1;
      }
      if(altitude == 0 && previousAltitude == -1){
        count += 1;
      }
    }
  return count;
  }
}
