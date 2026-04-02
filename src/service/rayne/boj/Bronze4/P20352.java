package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P20352 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double input = scanner.nextDouble() / Math.PI;

    System.out.println(2 * Math.sqrt(input) * Math.PI);
  }
}
