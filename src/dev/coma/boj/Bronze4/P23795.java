package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P23795 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int sum = 0;

      while (true) {
        int input = scanner.nextInt();
        if (input == -1) break;

        sum += input;
      }

      System.out.println(sum);
    }
  }
}
