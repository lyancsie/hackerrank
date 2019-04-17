package Implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Implementation.AlmostSorted.isSwappable;

public class AlmostSortedTest {

  @Test
  public void isSwappable_sizeIsTwoOrLess_True() throws Exception {
    Assertions.assertTrue(isSwappable(new int[]{2, 1}));
    Assertions.assertTrue(isSwappable(new int[]{9999, 999}));
    Assertions.assertTrue(isSwappable(new int[]{1}));
    Assertions.assertTrue(isSwappable(new int[]{}));
  }

  @Test
  public void isSwappable_lastTwoCharacters_True() throws Exception {
    Assertions.assertTrue(isSwappable(new int[]{1, 2, 3, 4, 5, 6, 8, 7}));
    Assertions.assertTrue(isSwappable(new int[]{10, 20, 30, 40, 50, 70, 60}));
    Assertions.assertTrue(isSwappable(new int[]{100, 200, 300, 400, 500, 700, 600}));
  }

  @Test
  public void isSwappable_firstTwoCharacters_True() throws Exception {
    Assertions.assertTrue(isSwappable(new int[]{2, 1, 3, 4}));
    Assertions.assertTrue(isSwappable(new int[]{20, 10, 30, 40}));
    Assertions.assertTrue(isSwappable(new int[]{200, 100, 300, 400}));
  }

  @Test
  public void isSwappable_adjacentCharacters_True() throws Exception {
    //Assertions.assertTrue(isSwappable(new int[]{1, 2, 3, 5, 4, 6}));
    Assertions.assertTrue(isSwappable(new int[]{10, 20, 30, 50, 40, 60}));
  }

  @Test
  public void isSwappable_nonAdjacentCharacters_True() throws Exception {
    Assertions.assertTrue(isSwappable(new int[]{1, 5, 3, 4, 2, 6}));
    Assertions.assertTrue(isSwappable(new int[]{10, 50, 30, 40, 20, 60}));
    Assertions.assertFalse(isSwappable(new int[]{1, 4, 3, 2, 5}));

  }

  @Test
  public void isSwappable_swappingWithTheFirstOne_True() throws Exception {
    Assertions.assertFalse(isSwappable(new int[]{40, 20, 30, 5, 50}));
  }

  @Test
  public void isSwappable_failsAtLastCharacter_False() throws Exception {
    Assertions.assertFalse(isSwappable(new int[]{1, 2, 4, 3, 5, 2}));
  }

  @Test
  public void isSwappable_failsAtTheBeginning_False() throws Exception {
    Assertions.assertFalse(isSwappable(new int[]{3, 2, 1, 4, 5, 6}));
  }

  @Test
  public void isSwappable_failsEverywhere_False() throws Exception {
    Assertions.assertFalse(isSwappable(new int[]{5, 4, 3, 2, 1}));
  }

  /*
  @Test
  public void isSwappable_fails*/
}