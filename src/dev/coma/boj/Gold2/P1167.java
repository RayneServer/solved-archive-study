package dev.coma.boj.Gold2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.IntStream;

public class P1167 {
  private static class Link {
    private int startNode;
    private int destNode;
    private int length;

    public Link(int startNode, int destNode, int length) {
      this.startNode = startNode;
      this.destNode = destNode;
      this.length = length;
    }
  }

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      int nodeCount = Integer.parseInt(bufferedReader.readLine());
      ArrayList<Link>[] linkListArr = new ArrayList[nodeCount + 1];
      for (int i = 1; i < linkListArr.length; i++) {
        linkListArr[i] = new ArrayList<>();
      }

      for (int i = 1; i <= nodeCount; i++) {
        Integer[] input = Arrays.stream(bufferedReader.readLine().split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        int nodeNum = input[0];

        for (int j = 1; j < input.length; j += 2) {
          if (input[j] == -1) break;

          linkListArr[nodeNum].add(new Link(nodeNum, input[j], input[j + 1]));
        }
      }

      // BFS를 root에서 한 번, 해당 결과로 나온 제일 긴 거리의 노드에서 한 번 돌리면 지름을 구할 수 있음
      int[] maxLengthFromRoot = calcMaxLength(linkListArr, 1);
      System.out.println(calcMaxLength(linkListArr, maxLengthFromRoot[0])[1]);
    }
  }

  private static int[] calcMaxLength(ArrayList<Link>[] linkListArr, int startIdx) {
    int[] lengthArr = new int[linkListArr.length];
    boolean[] visitArr = new boolean[lengthArr.length];

    Queue<Link> queue = new ArrayDeque<>();
    queue.offer(new Link(0, startIdx, 0));

    int maxIndex = 0;
    int maxValue = 0;
    while (!queue.isEmpty()) {
      Link link = queue.poll();

      visitArr[link.destNode] = true;
      lengthArr[link.destNode] = lengthArr[link.startNode] + link.length;
      if (lengthArr[link.destNode] > maxValue) {
        maxValue = lengthArr[link.destNode];
        maxIndex = link.destNode;
      }

      for (Link nextLink : linkListArr[link.destNode]) {
        if (!visitArr[nextLink.destNode]) queue.offer(nextLink);
      }
    }

    return new int[]{maxIndex, maxValue};
  }
}

// 이 문제는 Do It! 알고리즘 코딩테스트 교재의 BFS 실습 문제로 활용되었습니다.