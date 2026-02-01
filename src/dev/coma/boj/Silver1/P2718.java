package dev.coma.boj.Silver1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class P2718 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numN = scanner.nextInt();
      int numM = scanner.nextInt();
      scanner.nextLine();

      int[][] mazeArr = new int[numN][numM];
      boolean[][] visitArr = new boolean[numN][numM];
      for (int i = 0; i < numN; i++) {
        String[] input = scanner.nextLine().split("");

        for (int j = 0; j < numM; j++) {
          mazeArr[i][j] = Integer.parseInt(input[j]);
        }
      }

      Queue<Integer[]> queue = new ArrayDeque<>();
      queue.add(new Integer[]{0, 0});
      while (!queue.isEmpty()) {
        Integer[] point = queue.poll();
        int numX = point[0];
        int numY = point[1];

        if (visitArr[numX][numY]) continue;

        visitArr[numX][numY] = true;
        if (numN - 1 == numX && numM - 1 == numY) break;

        if (numX > 0 && mazeArr[numX - 1][numY] == 1 && !visitArr[numX - 1][numY]) {
          mazeArr[numX - 1][numY] = mazeArr[numX][numY] + 1;
          queue.offer(new Integer[]{numX - 1, numY});
        }

        if (numY > 0 && mazeArr[numX][numY - 1] == 1 && !visitArr[numX][numY - 1]) {
          mazeArr[numX][numY - 1] = mazeArr[numX][numY] + 1;
          queue.offer(new Integer[]{numX, numY - 1});
        }

        if (numX < numN - 1 && mazeArr[numX + 1][numY] == 1 && !visitArr[numX + 1][numY]) {
          mazeArr[numX + 1][numY] = mazeArr[numX][numY] + 1;
          queue.offer(new Integer[]{numX + 1, numY});
        }

        if (numY < numM - 1 && mazeArr[numX][numY + 1] == 1 && !visitArr[numX][numY + 1]) {
          mazeArr[numX][numY + 1] = mazeArr[numX][numY] + 1;
          queue.offer(new Integer[]{numX, numY + 1});
        }
      }

      System.out.println(mazeArr[numN - 1][numM - 1]);
    }
  }
}
