package dev.coma.boj.Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P2343 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      String[] inputSet = bufferedReader.readLine().split(" ");
      int lectureCount = Integer.parseInt(inputSet[0]);
      int blueCount = Integer.parseInt(inputSet[1]);

      List<Integer> lectureTimeList = Arrays.stream(bufferedReader.readLine().split(" "))
              .map(Integer::parseInt)
              .collect(Collectors.toList())
              ;

      System.out.println(findBestSize(lectureTimeList, blueCount));
    }
  }

  private static int findBestSize(List<Integer> lectureTimeList, int blueCount) {
    int startPoint = Collections.max(lectureTimeList);
    int endPoint = lectureTimeList.stream().mapToInt(Integer::intValue).sum();

    while (startPoint <= endPoint) {
      int size = (startPoint + endPoint) / 2;

      if (isBest(lectureTimeList, blueCount, size)) endPoint = size - 1;
      else startPoint = size + 1;
    }

    return startPoint;
  }

  private static boolean isBest(List<Integer> lectureTimeList, int blueCount, int blueSize) {
    int sum = 0;
    int counter = 1;

    for (Integer time : lectureTimeList) {
      if (sum + time > blueSize) {
        sum = 0;
        counter++;
      }

      sum += time;
    }

    return counter <= blueCount;
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 이진 탐색 실습 문제로 활용되었습니다.