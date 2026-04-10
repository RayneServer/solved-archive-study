package service.rayne.boj.Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P32141 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] inputSet = bufferedReader.readLine().split(" ");
    int cardCount = Integer.parseInt(inputSet[0]);
    int enemyHp = Integer.parseInt(inputSet[1]);

    Integer[] inputCardArr = Arrays.stream(bufferedReader.readLine().split(" "))
      .map(Integer::parseInt).toArray(Integer[]::new);

    int cardIndex = 0;
    int totalDamage = 0;
    while (cardIndex < cardCount && totalDamage < enemyHp) {
      totalDamage += inputCardArr[cardIndex++];
    }

    System.out.println(totalDamage < enemyHp ? -1 : cardIndex);
    bufferedReader.close();
  }
}
