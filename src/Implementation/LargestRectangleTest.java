package Implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LargestRectangleTest {

  @Test
  public void largestRectangle_12345_9() {
    Assertions.assertEquals(9, LargestRectangle.largestRectangle(new int[]{1, 2, 3, 4, 5}));
  }

  @Test
  public void largestRectangle_5555555555_50() {
    Assertions.assertEquals(50, LargestRectangle.largestRectangle(new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5, 5}));
  }

  @Test
  void largestRectangle_oneBigValueInTeMiddle_100() {
    Assertions.assertEquals(100, LargestRectangle.largestRectangle(new int[]{1, 2, 3, 100, 4, 5}));
  }

  @Test
  void largestRectangle_oneBigValueOnTheEdge() {
    Assertions.assertEquals(100, LargestRectangle.largestRectangle(new int[]{100, 2, 3, 1, 4, 5}));
  }

  @Test
  void largestRectangle_oneBigValueAtTheEnd() {
    Assertions.assertEquals(100, LargestRectangle.largestRectangle(new int[]{1, 2, 3, 4, 5, 100}));
  }

  @Test
  void largestRectangle_inTheMiddle() {
    Assertions.assertEquals(20, LargestRectangle.largestRectangle(new int[]{1, 2, 3, 4, 5, 5, 5, 5, 1, 1, 1, 1}));
  }

  @Test
  void reverseSorted() {
    Assertions.assertEquals(90, LargestRectangle.largestRectangle(new int[]{45, 40, 30, 20, 10, 0}));
  }

  @Test
  void totallyRandom() {
    Assertions.assertEquals(12, LargestRectangle.largestRectangle(new int[]{5, 2, 4, 6, 0, 4, 5, 6, 0, 3, 10}));
  }
}
