// Hackerrank sol that did work

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Birthday_Chocolate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfSquares = scanner.nextInt();
        int[] chocolateBar = new int[nOfSquares];
        for(int i=0; i < nOfSquares; i++){
            chocolateBar[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum=0;
        int bCount = 0;
        for(int i=0; i<nOfSquares-b+1; i++) { // step to be noted-- In my code I didnt wrote i<nOfSquares-b;

            for(int j=i; j<i+b; j++) {
                sum+=chocolateBar[j];
            }
            if(sum==a) {
                bCount++;
            }
            sum = 0;
        }
        System.out.println(bCount);
    }
}

// My code that got 8 out of 14 test cases right

//import java.util.Scanner;
//
//public class Birthday_Chocolate {
//    public static void main(String[] args) {
//        System.out.println("Enter the no. of squares or length of chocolate bar...");
//        Scanner scanner = new Scanner(System.in);
//        int nOfSquares = scanner.nextInt();
//        int[] chocolateBar = new int[nOfSquares];
//        for(int k=0; k<nOfSquares; k++) {
//            chocolateBar[k] = scanner.nextInt();
//        }
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int sum = 0;
//        int bCount = 0;
//        for (int i = 0; i <nOfSquares-b+1; i++) {
//            if(chocolateBar.length == 1) {
//                if(a==chocolateBar[0]) {
//                    bCount++;
//                }
//            }
//            if(chocolateBar.length > 1) {
//                for(int j=i; j<b+i; j++) {
//                    sum += chocolateBar[j];
//
//                    if(sum==a) {
//                        bCount++;
//                    }
//                    sum = 0;
//                }}
//
//        System.out.println(bCount);
//    }
//}}
//
