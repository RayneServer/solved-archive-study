package dev.coma.boj.Bronze4;

import java.util.List;
import java.util.Scanner;

public class P20232 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputYear = scanner.nextInt();
      Integer[] spArr = {1996, 1997, 2000, 2007, 2008, 2013, 2018};
      List<Integer> spList = List.of(spArr);

      if (inputYear == 2006) System.out.println("PetrSU, ITMO");
      else if (spList.contains(inputYear)) System.out.println("SPbSU");
      else System.out.println("ITMO");
    }
  }
}
