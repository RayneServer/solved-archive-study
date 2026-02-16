package dev.coma.boj.Bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class P11257 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = Integer.parseInt(scanner.nextLine());

      for (int i = 0; i < testCase; i++) {
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = input[1] + input[2] + input[3];

        if ((sum >= 55) && checkPoint(input)) System.out.printf("%s %s %s\n", input[0], sum, "PASS");
        else System.out.printf("%s %s %s\n", input[0], sum, "FAIL");
      }
    }
  }

  private static boolean checkPoint(int[] input) {
    if (input[1] < (35 * 0.3)) return false;
    if (input[2] < (25 * 0.3)) return false;
    if (input[3] < (40 * 0.3)) return false;

    return true;
  }
}
