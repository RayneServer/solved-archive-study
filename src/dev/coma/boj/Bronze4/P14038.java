package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P14038 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int counter = 0;

      for (int i = 0; i < 6; i++) {
        if ("W".equals(scanner.nextLine())) counter++;
      }

      if (counter >= 5) System.out.println(1);
      else if (counter >= 3) System.out.println(2);
      else if (counter >= 1) System.out.println(3);
      else System.out.println(-1);
    }
  }
}
