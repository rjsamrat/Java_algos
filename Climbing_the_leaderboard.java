// My solution didnt work. Below is code from Hackerrank that works

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Climbing_the_leaderboard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfPlayers = scanner.nextInt();
        int[] playersScore = new int[nOfPlayers];
        int[] rank = new int[nOfPlayers];
        rank[0] = 1;
        playersScore[0] = scanner.nextInt();
        int count = 1;

        for (int i=1; i<nOfPlayers; i++) {
            if(playersScore[i-1] != playersScore[i]) {
                count++;
            }
            rank[i] = count;
        }
        int nOfAliceScores = scanner.nextInt();
        int aliceScore = 0;
        int aliceRank = count + 1;
        int index = nOfPlayers - 1;

        for (int i=0; i<nOfAliceScores; i++) {
            aliceScore = scanner.nextInt();
            while (index >= 0 && aliceScore >= playersScore[index]) {
                aliceRank = rank[index];
                index--;
            }
            if (index < 0) aliceRank = 1;
            System.out.println(aliceRank);
        }


    }}