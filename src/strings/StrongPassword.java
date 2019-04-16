package strings;

public class StrongPassword {

  static final String numbers = "0123456789";
  static final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
  static final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  static final String specialCharacters = "!@#$%^&*()-+";

  public static void main(String[] args) {
    System.out.println(minimumNumber(6,"1Bcbbca"));

    System.out.println(minimumNumber(5,"z0%Zb"));
  }

  static int minimumNumber(int n, String password) {
    boolean[] booleans = new boolean[]{false, false, false, false};
    int count = 0;
    if (n <= 3) {
      return 6 - n;
    }
    for (int i = 0; i < n; i++) {
      if (Character.isUpperCase(password.charAt(i))) {
        booleans[0] = true;
      }
      if (Character.isLowerCase(password.charAt(i))) {
        booleans[1] = true;
      }
      if (specialCharacters.indexOf((password.charAt(i))) != -1) {
        booleans[2] = true;
      }
      if(Character.isDigit(password.charAt(i))){
        booleans[3] = true;
      }
    }

    for (int i = 0; i < booleans.length; i++) {
      System.out.println(booleans[i]);
    }

    for (int i = 0; i < booleans.length; i++) {
      if (!booleans[i]) {
        count += 1;
      }
    }

    if(count<=6-n){
      return 6-n;
    }
    return count;
  }

  // Return the minimum number of characters to make the password strong

}
