package com.premiumminds.internship.snail;

import java.util.concurrent.CompletableFuture;
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
    CompletableFuture<int[]> result = new CompletableFuture<>();
    if(matrix.length == 0) {
      result.complete(new int[0]);
      return result;
    }
      int rows = matrix.length;
      int cols = matrix.length;
      int[] snailShell = new int[rows*cols];
      int index = 0;
      int rowInit = 0;
      int rowFin = rows - 1;
      int colInit = 0;
      int colFin = cols - 1;
      int i=0;

      while (rowInit <= rowFin && colInit <= colFin) {
          // Traverse the top row
          for (i = colInit; i <= colFin; i++) {
              snailShell[index++] = matrix[rowInit][i];
          }
          rowInit++;
          // Traverse the right column
          for (i = rowInit; i <= rowFin; i++) {
              snailShell[index++] = matrix[i][colFin];
          }
          colFin--;
          // Traverse the bottom row
          if (rowInit <= rowFin) {
              for (i = colFin; i >= colInit; i--) {
                  snailShell[index++] = matrix[rowFin][i];
              }
              rowFin--;
          }

          // Traverse the left column
          if (colInit <= colFin) {
              for (i = rowFin; i >= rowInit; i--) {
                  snailShell[index++] = matrix[i][colInit];
              }
              colInit++;
          }
      }
      result.complete(snailShell);
      return result;


  };
}
