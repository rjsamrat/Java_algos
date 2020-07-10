// Couldnt do this one. Below is solution from Youtube

import java.util.Scanner;

public class Magic_square {
    static int possibleMagicSquares(int[][] s) {
        int[][] squares = new int[][] {
                {8,3,4,1,5,9,6,7,2},
                {4,3,8,9,5,1,2,7,6},
                {8,1,6,3,5,7,4,9,2},
                {6,1,8,7,5,3,2,9,4},
                {2,9,4,7,5,3,6,1,8},
                {4,9,2,3,5,7,8,1,6},
                {2,7,6,9,5,1,4,3,8},
                {6,7,2,1,5,9,8,3,4}
        };
        int min = Integer.MAX_VALUE;
        for(int i=0; i<squares.length; i++) {
            int total = 0;
            for(int j=0; j<squares[i].length; j++) {
                total += Math.abs(s[j/3][j%3] - squares[i][j]);
            }
            if(total<min) min = total;
        }
        return  min;
    }

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println(possibleMagicSquares(matrix));

    }}