package core_java;

import java.net.CacheRequest;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

public class Calendar {

  public static void main(String[] args) {
    System.out.println(findDay(3,12,2019));
  }

  /*
   * Complete the 'findDay' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts following parameters:
   *  1. INTEGER month
   *  2. INTEGER day
   *  3. INTEGER year
   */

  public static String findDay(int month, int day, int year) {
    LocalDate localDate = LocalDate.of(year, month, day);
    return localDate.getDayOfWeek().toString();
  }
}

