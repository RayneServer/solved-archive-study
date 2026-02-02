package dev.coma.boj.Silver1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class P1697 {
  private static int[] findArr = new int[100001];
  private static boolean[] visitArr = new boolean[100001];

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int pointN = scanner.nextInt();
      int pointK = scanner.nextInt();

      moveToK(pointN, pointK);

      System.out.println(findArr[pointK]);
    }
  }

  private static void moveToK(int pointN, int pointK) {
    Queue<Integer[]> timeQueue = new ArrayDeque<>();
    timeQueue.offer(new Integer[]{pointN, 0});

    while (!timeQueue.isEmpty()) {
      Integer[] point = timeQueue.poll();

      findArr[point[0]] = point[1];
      visitArr[point[0]] = true;

      if (point[0] == pointK) break;

      if (point[0] != 0 && (2 * point[0]) <= 100000 && !visitArr[2 * point[0]]) timeQueue.offer(new Integer[]{2 * point[0], point[1] + 1});
      if (point[0] < pointK && !visitArr[point[0] + 1]) timeQueue.offer(new Integer[]{point[0] + 1, point[1] + 1});
      if (point[0] > 0 && !visitArr[point[0] - 1]) timeQueue.offer(new Integer[]{point[0] - 1, point[1] + 1});
    }
  }
}
