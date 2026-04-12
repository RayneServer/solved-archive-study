package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P18398 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCase = scanner.nextInt();

    for (int i = 0; i < testCase; i++) {
      int problemCount = scanner.nextInt();

      for (int j = 0; j < problemCount; j++) {
        int numX = scanner.nextInt();
        int numY = scanner.nextInt();

        System.out.println((numX + numY) + " " + (numX * numY));
      }
    }

    scanner.close();
  }
}
