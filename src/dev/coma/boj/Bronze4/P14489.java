package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P14489 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int money = scanner.nextInt() + scanner.nextInt();
      int chickenPrice = scanner.nextInt() * 2;

      System.out.println((money - chickenPrice >= 0) ? money - chickenPrice : money);
    }
  }
}
