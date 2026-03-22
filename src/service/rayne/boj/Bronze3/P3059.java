package service.rayne.boj.Bronze3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3059 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int testCase = Integer.parseInt(scanner.nextLine());

      int maxValue = 0;
      for (int i = 'A'; i <= 'Z'; i++) {
        maxValue += i;
      }

      for (int i = 0; i < testCase; i++) {
        String[] input = scanner.nextLine().split("");
        Set<String> inputSet = new HashSet<>(Arrays.asList(input));
        char[] inputArr = String.join("", inputSet).toCharArray();

        int result = maxValue;
        for (char c : inputArr) {
          result -= c;
        }

        System.out.println(result);
      }
    }
  }
}
