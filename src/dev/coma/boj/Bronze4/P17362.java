package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P17362 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputNum = scanner.nextInt() % 8;

      if (inputNum == 1) System.out.println(1);
      else if (inputNum == 5) System.out.println(5);
      else if (inputNum == 0 || inputNum == 2) System.out.println(2);
      else if (inputNum == 3 || inputNum == 7) System.out.println(3);
      else System.out.println(4);
    }
  }
}
