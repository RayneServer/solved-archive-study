package dev.coma.boj.Bronze4;

import java.util.Scanner;

public class P10203 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      String vowels = "aeiou";
      int testCase = Integer.parseInt(scanner.nextLine());

      for (int i = 0; i < testCase; i++) {
        String[] inputArr = scanner.nextLine().split("");
        int counter = 0;

        for (String str : inputArr) {
          if (vowels.contains(str)) counter++;
        }

        System.out.printf("The number of vowels in %s is %s.\n", String.join("", inputArr), counter);
      }
    }
  }
}
