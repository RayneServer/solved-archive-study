package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P18408 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int input = scanner.nextInt() + scanner.nextInt() + scanner.nextInt();
      System.out.println(input >= 5 ? 2 : 1);
    }
  }
}
