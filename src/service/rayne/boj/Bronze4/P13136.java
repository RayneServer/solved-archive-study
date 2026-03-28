package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P13136 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long col = scanner.nextLong();
    long row = scanner.nextLong();
    long camRange = scanner.nextLong();

    System.out.println(((col + (camRange - 1)) / camRange) * ((row + (camRange - 1)) / camRange));
  }
}
