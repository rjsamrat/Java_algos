// Counldnt do the first time

import java.util.Scanner;

public class Climbing_the_leaderboar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfPlayerScores = scanner.nextInt();
        int count = 1;
        int[] playerScores = new int[nOfPlayerScores];
        int[] rank = new int[nOfPlayerScores];
        rank[0] = 1;
        playerScores[0] = scanner.nextInt();
        for (int i=1; i<nOfPlayerScores; i++) {
            if(playerScores[i-1] != playerScores[i]) {
                count++;
            }
            rank[i] = count;
        }

        int nOfAliceScores = scanner.nextInt();
        int aliceScore = 0;
        int aliceRank = count + 1;
        int index = nOfPlayerScores - 1;

        for (int i=0; i<nOfAliceScores; i++) {
            aliceScore = scanner.nextInt();
            while (index >= 0 && aliceScore >= playerScores[index]) {
                aliceRank = rank[index];
                index--;
            }
            if (index < 0) aliceRank = 1;
            System.out.println(aliceRank);
        }
    }
}
