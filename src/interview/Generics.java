package interview;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Method;
import java.util.Iterator;

public class Generics {

  class Printer<T> {

    private T t;

    <T> void printArray(T[] array) {
      for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
      }
    }
  }
  //Write your code here

}



