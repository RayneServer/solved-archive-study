package service.rayne.boj.Bronze4;

import java.util.Arrays;
import java.util.Scanner;

public class P20499 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer[] inputArr = Arrays.stream(scanner.nextLine().split("/")).map(Integer::valueOf).toArray(Integer[]::new);

    if (inputArr[0] + inputArr[2] < inputArr[1] || inputArr[1] == 0) System.out.println("hasu");
    else System.out.println("gosu");
  }
}
