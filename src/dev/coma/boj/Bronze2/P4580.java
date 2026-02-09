package dev.coma.boj.Bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class P4580 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      while (true) {
        int[] inputLine = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        if (inputLine[0] == 0) break;

        int size = inputLine[0];
        inputLine[0] = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
          stringBuilder.append((i + " ").repeat(inputLine[i] - inputLine[i - 1]));
        }

        System.out.println(stringBuilder.toString().trim());
      }
    }
  }
}
