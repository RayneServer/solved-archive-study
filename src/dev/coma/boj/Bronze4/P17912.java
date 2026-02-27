package dev.coma.boj.Bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class P17912 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int dayCount = Integer.parseInt(scanner.nextLine());
      int[] garbageArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

      int minIndex = 0;
      int minGarbage = garbageArr[0];
      for (int i = 1; i < garbageArr.length; i++) {
        if (garbageArr[i] < minGarbage) {
          minGarbage = garbageArr[i];
          minIndex = i;
        }
      }

      System.out.println(minIndex);
    }
  }
}
