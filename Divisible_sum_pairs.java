// Solution from Hackerrank -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Divisible_sum_pairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int array[] = new int[n];
        for(int i=0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int pairCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int q = array[i] + array[j];
                if ((q % k) == 0) {
                    pairCount++;
                }
            }
        }
        System.out.println(pairCount);
    }
}


// My Solution that got 12 out of 20 test cases correct -
// Also I misinterpreted the question
//import java.util.Scanner;
//
//public class Divisible_sum_pairs {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int k = scanner.nextInt();
//        int pairCount = 0;
//        int array[] = new int[n];
//        for(int i=0; i<n; i++) {
//            array[i] = scanner.nextInt();
//        }
//        for(int i=0; i<n; i++) {
//            for(int j = 1; j < n; j++) {
//                if (array[0] < array[j] && (array[0] + array[j]) % k == 0) {
//                    pairCount++;
//                }
//            }
//            for(int l=1; l<n; l++) {
//            int c;
//            c = array[0];
//            array[0] = array[l];
//            array[l] = c;
//        }}
//
//        System.out.println(pairCount);
//
//    }}



//        System.out.println("Enter a: " + "and " +  "b: ");
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();
//        int c;
//        c=a;
//        a=b;
//        b=c;
//        System.out.println("Now a: "+ a + " and b: " + b);

