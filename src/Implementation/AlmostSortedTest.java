package Implementation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static Implementation.AlmostSorted.isReversible;
import static Implementation.AlmostSorted.isSwappable;

public class AlmostSortedTest {

  @Test
  public void isSwappable_sizeIsTwoOrLess_True() throws Exception {
    Assertions.assertEquals("swap 0 1", isSwappable(new int[]{2, 1}));
    Assertions.assertEquals("swap 0 1", isSwappable(new int[]{9999, 999}));
    Assertions.assertEquals("swap 0 1", isSwappable(new int[]{1}));
    Assertions.assertEquals("swap 0 1", isSwappable(new int[]{}));
  }

  @Test
  public void isSwappable_lastTwoCharacters_True() throws Exception {
    Assertions.assertEquals("swap 6 7", isSwappable(new int[]{1, 2, 3, 4, 5, 6, 8, 7}));
  }

  @Test
  public void isSwappable_firstTwoCharacters_True() throws Exception {
    Assertions.assertEquals("swap 0 1", isSwappable(new int[]{2, 1, 3, 4}));
    Assertions.assertEquals("swap 0 1", isSwappable(new int[]{20, 10, 30, 40}));
    Assertions.assertEquals("swap 0 1", isSwappable(new int[]{200, 100, 300, 400}));
  }

  @Test
  public void isSwappable_adjacentCharacters_True() throws Exception {
    //Assertions.assertTrue(isSwappable(new int[]{1, 2, 3, 5, 4, 6}));
    Assertions.assertEquals("swap 3 4", isSwappable(new int[]{10, 20, 30, 50, 40, 60}));
  }

  @Test
  public void isSwappable_nonAdjacentCharacters_True() throws Exception {
    Assertions.assertEquals("swap 1 4", isSwappable(new int[]{1, 5, 3, 4, 2, 6}));
    Assertions.assertEquals("swap 1 4", isSwappable(new int[]{10, 50, 30, 40, 20, 60}));
    Assertions.assertEquals("swap 1 3", isSwappable(new int[]{1, 4, 3, 2, 5}));

  }

  @Test
  public void isSwappable_swappingWithTheFirstOne_True() throws Exception {
    Assertions.assertEquals("swap 0 3", isSwappable(new int[]{40, 20, 30, 5, 50}));
  }

  @Test
  public void isSwappable_failsAtLastCharacter_No() throws Exception {
    Assertions.assertEquals("no", isSwappable(new int[]{1, 2, 4, 3, 5, 2}));
  }

  @Test
  public void isSwappable_failsAtTheBeginning_No() throws Exception {
    Assertions.assertEquals("no", isSwappable(new int[]{3, 2, 5, 4, 5, 6}));
  }

  @Test
  public void isSwappable_failsEverywhere_No() throws Exception {
    Assertions.assertEquals("no", isSwappable(new int[]{5, 4, 3, 2, 1}));
  }

  @Test
  public void isSwappable_312_No() {
    Assertions.assertEquals("no", isSwappable(new int[]{3, 1, 2}));
  }

  @Test
  public void isReversible_total_reverse() {
    Assertions.assertEquals("reverse 0 5", isReversible(new int[]{5, 4, 3, 2, 1, 0}));
  }

  @Test
  public void isReversible_312_no() {
    Assertions.assertEquals("no", isReversible(new int[]{3, 1, 2}));
  }

  @Test
  public void isReversible_subArray_reverse() {
    Assertions.assertEquals("reverse 1 3", isReversible(new int[]{1, 4, 3, 2, 5, 6}));
  }

  @Test
  public void isReversible_subArrayFromTheBeginning_reverse() {
    Assertions.assertEquals("reverse 0 3", isReversible(new int[]{5, 4, 3, 2, 6, 7}));
  }

  @Test
  public void isReversible_subArrayTillTheEnd_reverse() {
    Assertions.assertEquals("reverse 3 5", isReversible(new int[]{0, 1, 2, 10, 9, 8}));
  }

  @Test
  public void isSwappable_hackerrank_swap_11_94(){
    Assertions.assertEquals("swap 11 94", isSwappable(new int[]{4104,8529,49984,54956,63034,82534,84473,86411,92941,95929,108831,894947,125082,137123,137276,142534,149840,154703,174744,180537,207563,221088,223069,231982,249517,252211,255192,260283,261543,262406,270616,274600,274709,283838,289532,295589,310856,314991,322201,339198,343271,383392,385869,389367,403468,441925,444543,454300,455366,469896,478627,479055,484516,499114,512738,543943,552836,560153,578730,579688,591631,594436,606033,613146,621500,627475,631582,643754,658309,666435,667186,671190,674741,685292,702340,705383,722375,722776,726812,748441,790023,795574,797416,813164,813248,827778,839998,843708,851728,857147,860454,861956,864994,868755,116375,911042,912634,914500,920825,979477}));
  }
}