
import java.io.*;
import java.util.*;

public class birthdayCandles {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the age of your niece");

       int age = scanner.nextInt();
       int maxCount=0;
       int max=0;
       int candles;

       for(int i=0; i<age; i++) {
           candles = scanner.nextInt();
           if(candles > max) {
               maxCount = 1;
               max = candles;
           }
           else if(candles == max) {
               maxCount++;
           }
       }
        System.out.println(maxCount);
    }
}
























//        int max=0;
//        int min=1000000000;
//        int sum=0;
//        int count=0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the age of your niece first and height of candles second...");
//        int age = scanner.nextInt();
//        int[] heights = new int[age];
//
//        for(int i=0; i<age; i++) {
//            heights[i] = scanner.nextInt();
//        }
//
//        for(int j=0; j<age; j++) {
//            if(max<heights[j]) {
//                max=heights[j];
//            }
//        }
//        int storedMax = max;
//        int maxCount=0;
//
//
//            for(int k=0; k<age; k++) {
//                while(heights[k]==storedMax) {
//                    maxCount = maxCount + 1;
//                    System.out.println(maxCount);
//                }
//            }
//


//        System.out.println(max);



//        System.out.println("Enter the numbers");
//        while(scanner.hasNext()) {
//            int numbersEntered = scanner.nextInt();
//
//            if(min>numbersEntered) {
//                min = numbersEntered;
//            }
//            if(max<numbersEntered) {
//                max = numbersEntered;
//            }
//            System.out.println((max) + " " + (min));
//        }
//        scanner.close();

