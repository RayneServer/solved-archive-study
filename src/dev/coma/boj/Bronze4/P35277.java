package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P35277 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int money = scanner.nextInt();
      int dubaiPrice = 900 + 60 + 600 + 170 + 160 + 110;

      System.out.println(money / dubaiPrice);
    }
  }
}
