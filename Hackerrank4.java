import java.util.Scanner;

public class Hackerrank4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns");
        int nofrandc = scanner.nextInt();
        long[] arr1 = new long[nofrandc];
        long[] arr2 = new long[nofrandc];
        long[] arr3 = new long[nofrandc];

        for(int i=0; i<nofrandc; i++) {
            arr1[i] = scanner.nextInt();
        }

        for(int i=0; i<nofrandc; i++) {
            arr2[i] = scanner.nextInt();
        }

        for(int i=0; i<nofrandc; i++) {
            arr3[i] = scanner.nextInt();
        }

        long diagonalSum1 = arr1[0] + arr2[1] + arr3[2];
        long diagonalSum2 = arr1[2] + arr2[1] + arr3[0];

        long difference = diagonalSum1 - diagonalSum2;

        if(difference < 0) {
            difference = difference*-1;
            System.out.println(difference);
        } else {
            System.out.println(difference);
        }



}}
