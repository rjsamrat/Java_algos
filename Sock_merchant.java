// Couldnt do this one. Below is code from hackerrank -

import java.io.*;
import java.util.*;

public class Sock_merchant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfElements=scanner.nextInt();
        int[] sockArray = new int[300];
        for(int i=0; i<nOfElements; i++){
            sockArray[scanner.nextInt()]++;
        }
        long ans=0;
        for(int s: sockArray){
            ans= ans + s/2;
        }
        System.out.println(ans);
    }
}




// My code -
//import java.util.Scanner;
//
//public class Sock_merchant {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int nOfElements = scanner.nextInt();
//        int[] sockArray = new int[nOfElements];
//        for(int i=0; i<nOfElements; i++) {
//            sockArray[i] = scanner.nextInt();
//        }
//        int Acount = 0;
//        int Bcount = 0;
//        int Ccount = 0;
//        int Dcount = 0;
//        int Ecount = 0;
//
//        for(int i=0; i<nOfElements-1; i++) {
//            for(int j=i+1; j<nOfElements; j++) {
//
//                if(sockArray[i]==sockArray[j]){
//
//                }
//            }
//        }
//
//
//
//
//    }
//    }
//
//
//
//




//        for(int i=0; i<nOfElements-1; i++) {
//            for(int j=i+1; j<nOfElements; j++) {
//                if(sockArray[i]!=sockArray[j]) {
//                  distinct++;
//                }
//            }
//        }

