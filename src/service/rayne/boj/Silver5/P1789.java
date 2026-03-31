package service.rayne.boj.Silver5;

import java.util.Scanner;

public class P1789 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long input = scanner.nextLong();
    int result = 1;

    while (input >= 0) input -= result++;

    System.out.println(result - 2);
  }
}
