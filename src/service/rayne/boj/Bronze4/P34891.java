package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P34891 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int objectCount = scanner.nextInt();
      int boxSize = scanner.nextInt();

      System.out.println((objectCount + (boxSize - 1)) / boxSize);
    }
  }
}
