
// A more efficient and smart solution -


//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        for(int i = 0; i < n; i++){
//            int grade = in.nextInt();
//            if (grade >= 38) {
//                if (grade % 5 >= 3) {
//                    grade += 5 - (grade % 5);
//                }
//            }
//            System.out.println(grade);
//        }
//    }
//}

// My Solution -

import java.util.Scanner;

public class Student_grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of students whose marks youre gonna enter");
        int nOfStudents = scanner.nextInt();
        int n;
        System.out.println("Enter the marks...");
        int[] marks = new int[nOfStudents];

        for(int i=0; i<nOfStudents; i++) {
            marks[i] = scanner.nextInt();
        }

        for(int j=0; j<nOfStudents; j++) {
            while(marks[j] > 37) {
                if(marks[j]%5 == 3) {
                    marks[j] += 2;
                }
                else if(marks[j]%5 == 4) {
                    marks[j] += 1;
                }
                else{break;}
            }
        }

        for(int j=0; j<nOfStudents; j++) {
            System.out.println(marks[j]);
        }
    }
}























