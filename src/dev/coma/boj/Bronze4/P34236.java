package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P34236 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      int firstYear = scanner.nextInt();
      int lastYear = scanner.nextInt();
      int gap = lastYear - firstYear;
      for (int i = 2; i < testCase; i++) {
        lastYear = scanner.nextInt();
      }

      System.out.println(lastYear + gap);
    }
  }
}
