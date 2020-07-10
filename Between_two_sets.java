// Do it again. Did'nt do it the first time.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Between_two_sets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i < n; i++){
            a[i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int i=0; i < m; i++){
            b[i] = in.nextInt();
        }
        int c=0;
        for(int i=1;i<=100;i++)
        {
            int x=checka(a,i);
            int y=checkb(b,i);
            if(x==1&&y==1)
                c++;
        }
        System.out.println(c);
    }
    public static int checka(int[] a,int x)
    {
        for(int i=0;i<a.length;i++)
            if(x%a[i]!=0)
                return 0;
        return 1;
    }
    public static int checkb(int[] b,int x)
    {
        for(int i=0;i<b.length;i++)
            if(b[i]%x!=0)
                return 0;

        return 1;
    }
}


//import java.util.Scanner;
//
//public class Between_two_sets {
//
//    public static void main(String[] args) {
//        System.out.println("Enter the size of two arrays...");
//        Scanner scanner = new Scanner(System.in);
//        int sizeA = scanner.nextInt();
//        int sizeB = scanner.nextInt();
//
//        int[] a = new int[sizeA];
//        int[] b = new int[sizeB];
//        boolean condition1Satisfied = false;
//
//        for(int i=0; i<sizeA; i++) {
//            a[i] = scanner.nextInt();
//        }
//        for(int i=0; i<sizeB; i++) {
//            b[i] = scanner.nextInt();
//        }
//        for(int i=0; i<a.length; i++) {
//            if(a[a.length-1]%a[i]==0) {
//               condition1Satisfied = true;
//            }
//        }
//        int d;
//        if(condition1Satisfied) {
//            if(b[0]%a[a.length-1]==0) {
//            d = b[0]/a[a.length-1];
//                for(int i=2; i<=d; i++) {
//                    for(int j=0; j<d; j++) {
//                        int[] e= new int[d];
//                        e[j] = a[a.length-1]*i;
//                        System.out.print(e[0]);
//                    }
//
//                }
//            }
//
//
//
//
//        }
//    }
//}
