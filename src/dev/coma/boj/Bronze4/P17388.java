package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17388 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String[] univArr = {"Soongsil", "Korea", "Hanyang"};
      int[] progressArr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};

      if (progressArr[0] + progressArr[1] + progressArr[2] >= 100) {
        System.out.println("OK");
        return;
      }

      int minIndex = 0;
      int minProgress = progressArr[0];
      for (int i = 1; i < progressArr.length; i++) {
        if (progressArr[i] < minProgress) {
          minIndex = i;
          minProgress = progressArr[i];
        }
      }

      System.out.println(univArr[minIndex]);
    }
  }
}
