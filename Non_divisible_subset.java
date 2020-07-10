//couldnt do this one. Below solution from HR.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Non_divisible_subset {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfElements = scanner.nextInt();
        int noToBeDividedBy = scanner.nextInt();
        int elementsArray[] = new int[nOfElements];
        int possibleRemaindersCount[] = new int[noToBeDividedBy]; // Ex if noToBeDividedBy == 3 then possible remainders
        for(int i=0; i < nOfElements; i++){                       // are 0, 1 and 2
            elementsArray[i] = scanner.nextInt();
            possibleRemaindersCount[elementsArray[i] % noToBeDividedBy]++;
        }
        int count = 0;
        for (int i=1; i <= noToBeDividedBy/2; i++) {
            if (2*i != noToBeDividedBy) {
                count += Math.max(possibleRemaindersCount[i], possibleRemaindersCount[noToBeDividedBy - i]);
            }
        }
        if (noToBeDividedBy % 2 == 0) {
            if (possibleRemaindersCount[noToBeDividedBy/2]>0) {
                count ++;
            }
        }
        if (possibleRemaindersCount[0]>0) {
            count ++;
        }
        System.out.println(count);
    }
}



















