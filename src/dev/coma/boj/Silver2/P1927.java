package dev.coma.boj.Silver2;

import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class P1927 {
  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out))) {
      Queue<Integer> queue = new PriorityQueue<>(Integer::compare);
      int commandCount = Integer.parseInt(bufferedReader.readLine());

      for (int i = 0; i < commandCount; i++) {
        int command = Integer.parseInt(bufferedReader.readLine());

        if (command == 0) {
          bufferedWriter.write(queue.isEmpty() ? "0\n" : queue.poll() + "\n");
        } else {
          queue.offer(command);
        }
      }

      bufferedWriter.flush();
    }
  }
}
