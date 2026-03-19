package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P31668 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int cowPerOne = scanner.nextInt();
      int totalCow = scanner.nextInt();
      int eggplantPerOne = scanner.nextInt();

      System.out.println(eggplantPerOne * (totalCow / cowPerOne));
    }
  }
}
