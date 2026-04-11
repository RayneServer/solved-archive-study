package service.rayne.boj.Bronze4;

import java.util.Scanner;

public class P20233 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int monthA = scanner.nextInt();
    int minuteA = scanner.nextInt();
    int monthB = scanner.nextInt();
    int minuteB = scanner.nextInt();
    int time = scanner.nextInt();

    int totalA = monthA + (Math.max(0, time - 30) * minuteA * 21);
    int totalB = monthB + (Math.max(0, time - 45) * minuteB * 21);

    System.out.println(totalA + " " + totalB);
    scanner.close();
  }
}
