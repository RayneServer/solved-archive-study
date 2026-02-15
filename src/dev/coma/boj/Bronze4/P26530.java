package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P26530 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = scanner.nextInt();

      for (int i = 0; i < testCase; i++) {
        int menuCount = scanner.nextInt();
        scanner.nextLine();

        double sum = 0;
        for (int j = 0; j < menuCount; j++) {
          String[] input = scanner.nextLine().split(" ");
          sum += Integer.parseInt(input[1]) * Double.parseDouble(input[2]);
        }

        sum = (double) Math.round(sum * 100) / 100;
        System.out.printf("$%.2f\n", sum);
      }
    }
  }
}
