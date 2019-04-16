package warmup;

public class TimeConversion {

  public static void main(String[] args) {
    System.out.println(timeConversion("12:45:54PM"));
    System.out.println(timeConversion("11:45:33AM"));
    System.out.println(timeConversion("01:45:33AM"));
  }

  static String timeConversion(String s) {
    String hoursInString = "12";
    int hours = Integer.parseInt(s.substring(0, 2));
    if (s.substring(s.length() - 2).equals("PM") || s.substring(s.length() - 2).equals("pm")) {
      if (hours < 12) {
        hours += 12;
        hoursInString = String.valueOf(hours);
      }
    }
    if (s.substring(s.length() - 2).equals("AM") || s.substring(s.length() - 2).equals("am")) {
      if (hours == 12) {
        hoursInString = "00";
      } else {
        hoursInString = s.substring(0, 2);
      }
    }
    return hoursInString + s.substring(2, s.length() - 2);
  }
}