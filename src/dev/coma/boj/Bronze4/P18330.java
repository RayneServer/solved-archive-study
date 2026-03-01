package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P18330 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int oilNextMonth = scanner.nextInt();
      int myPoint = scanner.nextInt() + 60;

      if (oilNextMonth <= myPoint) {
        System.out.println(oilNextMonth * 1500);
      } else {
        System.out.println((myPoint * 1500) + ((oilNextMonth - myPoint) * 3000));
      }
    }
  }
}
