package com.premiumminds.internship.snail;

import java.util.concurrent.Future;

/**
 * Created by aamado on 05-05-2023.
 */
class SnailShellPattern implements ISnailShellPattern {

  /**
   * Method to get snailshell pattern
   * 
   * @param matrix matrix of numbers to go through
   * @return order array of values thar represent a snail shell pattern
   */
  public Future<int[]> getSnailShell(int[][] matrix) {
    //throw new RuntimeException("Not Implemented Yet");
    int n = matrix.length;
    int[] result = new int[n * n];
    for(int i=0; i<n; i++) {
      for(int j=0; j<n; j++) {

      }
    }


    return null;
  };
}
