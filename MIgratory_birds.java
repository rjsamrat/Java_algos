// A very Important program. Teaches a very key concept in line in line 17
// code from hackerrank, my code didnt work

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MIgratory_birds {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfBirds = scanner.nextInt();
        int[] birds = new int[5];
        for (int i = 0; i < nOfBirds; i++) {
            birds[scanner.nextInt()-1]++;  // Did'nt know this before. A very key concept of an array
        }
        int max = 0;
        int id = 0;
        for (int i = 0; i < 5; i++) {
            if (birds[i] > max) {
                max = birds[i];
                id = i+1;
            }
        }
        System.out.println(birds[1]);
    }
}



