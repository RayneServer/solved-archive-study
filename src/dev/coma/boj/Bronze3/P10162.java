package dev.coma.boj.Bronze3;

import java.util.Scanner;

public class P10162 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int timeInput = scanner.nextInt();

      if (timeInput % 10 != 0) {
        System.out.println(-1);
        return;
      }

      int fiveMinCount = timeInput / 300;
      timeInput %= 300;

      int minCount = timeInput / 60;
      timeInput %= 60;

      int tenSecCount = timeInput / 10;

      System.out.println(fiveMinCount + " " + minCount + " " + tenSecCount);
    }
  }
}
