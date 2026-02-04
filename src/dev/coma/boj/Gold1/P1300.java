package dev.coma.boj.Gold1;

import java.util.Scanner;

public class P1300 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int arrSize = scanner.nextInt();
      int target = scanner.nextInt();

      // NxN의 각 행은 첫 값을 배수한 값들로 채워짐 -> 각 행의 마지막 값(최대값)이 항상 k와 일치
      // -> k번째 수는 k를 넘지 않음
      int startValue = 1;
      int endValue = target;
      int maxResult = -1;
      while (startValue <= endValue) {
        int midValue = (startValue + endValue) / 2;

        // 실제로 존재하지 않는 값을 포함해서 돌려도 되는 이유
        // 존재하지 않는 값이 후보가 되었을 경우 -> 해당 값보다 큰 다음 실존하는 수도 반드시 조건을 만족하기 때문
        if (calcSmallValuesCount(arrSize, midValue) >= target) endValue = midValue - 1;
        else {
          if (midValue > maxResult) maxResult = midValue;
          startValue = midValue + 1;
        }
      }

      System.out.println(maxResult);
    }
  }

  private static int calcSmallValuesCount(int arrSize, int value) {
    int counter = 0;

    // 각 행에서 나보다 작은 값의 수 -> 나를 각 행의 첫 값으로 나눈 몫 (최대 arrSize)
    for (int i = 1; i <= arrSize; i++) {
      int minCount = (value % i == 0) ? (value / i) - 1 : (value / i);

      counter += Math.min(minCount, arrSize);
    }

    return counter;
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 이진 탐색 실습 문제로 활용되었습니다.