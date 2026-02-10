package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P16486 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numD = scanner.nextInt();
      int numR = scanner.nextInt();
      double pi = 3.141592;

      System.out.println((2 * numD) + (2 * numR * pi));
    }
  }
}
