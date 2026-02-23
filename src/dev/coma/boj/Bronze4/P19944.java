package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P19944 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int numN = scanner.nextInt();
      int numM = scanner.nextInt();

      System.out.println(numM <= 2 ? "NEWBIE!" : numM <= numN ? "OLDBIE!" : "TLE!");
    }
  }
}
