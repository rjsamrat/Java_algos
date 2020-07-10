import java.util.Scanner;
import java.lang.Math;

public class Picking_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfElements = scanner.nextInt();
        int array[] = new int[200];

        for (int i=0; i<nOfElements; i++) {
            array[scanner.nextInt()]++;
        }
         int c = 0; int a = 0; int b = 0;
        int max = 0; int aCount = 0; int bCount = 0;

        for (int i=0; i<nOfElements; i++) {
            if(array[i] > max) {
                max = array[i];
                a = i - 1;
                b = i + 1;
            }}
            aCount = array[a];
            bCount = array[b];
            c = Math.max(aCount, bCount);

        System.out.println(max + c);
    }}

//        for (int i=0; i<nOfElements; i++) {
//            if(array[i] == max) {
//                continue;
//            }
//            if (array[i] > maxTwo) {
//                maxTwo = array[i];
//            }
//        }
//        System.out.println(maxTwo + max);



//        int maxTwo = 0; int p=0;
//        if (k==0) {
//            for (int i=1; i<array.length; i++) {
//                if (array[i] > maxTwo) {
//                    maxTwo = array[i];
//                    p = i;
//                }
//            }
//        }
//        if (k == array.length-1) {
//            for (int i=0; i<k; i++) {
//                if (array[i] > maxTwo) {
//                    maxTwo = array[i];
//                    p = i;
//                }
//            }
//        }
//        if(k>0 && k<array.length-1) {
//        for (int i=k+1; i < array.length; i++) {
//            if (array[i] > maxTwo) {
//                maxTwo = array[i];
//                p = i;
//            }
//        }}
//        System.out.println(k+p);
