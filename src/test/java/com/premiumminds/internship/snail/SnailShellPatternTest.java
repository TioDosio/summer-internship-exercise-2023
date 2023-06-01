package com.premiumminds.internship.snail;

import static org.junit.Assert.assertArrayEquals;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by aamado on 05-05-2023.
 */
@RunWith(JUnit4.class)
public class SnailShellPatternTest {

  /**
   * The corresponding implementations to test.
   *
   * If you want, you can make others :)
   *
   */
  public SnailShellPatternTest() {
  };

  /*@Test
  public void ScreenLockinPatternTestFirst3Length2Test()
      throws InterruptedException, ExecutionException, TimeoutException {
    int[][] matrix = { { 1, 2, 3 }, { 8, 9, 4 }, { 7, 6, 5 } };
    Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
    int[] result = count.get(10, TimeUnit.SECONDS);
    int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    for (int j : result) {
      System.out.print(j);
    }
    assertArrayEquals(result, expected);
  }*/
@Test
public void MyTest()
        throws InterruptedException, ExecutionException, TimeoutException {
        int[][] matrix = {{ 1,  2,  3,  4,  5,  6},
                          {20, 21, 22, 23, 24,  7},
                          {19, 32, 33, 34, 25,  8},
                          {18, 31, 36, 35, 26,  9},
                          {17, 30, 29, 28, 27, 10},
                          {16, 15, 14, 13, 12, 11}};
        Future<int[]> count = new SnailShellPattern().getSnailShell(matrix);
        int[] result = count.get(10, TimeUnit.SECONDS);
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
        assertArrayEquals(result, expected);
        }
}