package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P32642 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int dayCount = scanner.nextInt();

      int furyPoint = 0;
      long sum = 0;
      for (int i = 0; i < dayCount; i++) {
        boolean isRain = scanner.nextInt() == 1;

        if (isRain) furyPoint++;
        else furyPoint--;

        sum += furyPoint;
      }

      System.out.println(sum);
    }
  }
}
