package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P30156 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = Integer.parseInt(scanner.nextLine());

      for (int i = 0; i < testCase; i++) {
        String input = scanner.nextLine();

        int countA = 0;
        int countB = 0;
        for (char c : input.toCharArray()) {
          if (c == 'a') countA++;
          else countB++;
        }

        System.out.println(Math.min(countA, countB));
      }
    }
  }
}
