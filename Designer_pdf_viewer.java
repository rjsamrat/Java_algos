// could'nt do it. Both the Below solutions are from Hackerrank

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Designer_pdf_viewer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 26;
        int numberedAlphabets[] = new int[n];
        for(int i=0; i < n; i++){
            numberedAlphabets[i] = scanner.nextInt();
        }
        String word = scanner.next();
        int maxHeightLetter = -1;
        for(int i = 0; i < word.length(); i++)
            maxHeightLetter = Math.max(maxHeightLetter, numberedAlphabets[(int)word.charAt(i) - (int)'a']);
        System.out.println(word.length()*maxHeightLetter);
    }
}



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
//        int n = 26;
//        int h[] = new int[n];
//        for(int h_i=0; h_i < n; h_i++){
//            h[h_i] = in.nextInt();
//        }
//        String word = in.next();
//
//        int maxHeight = 0;
//        for(char ch = 'a'; ch < 'z'; ch++) {                     A very important concept of Strings
//            if(word.contains(ch + "") && h[ch - 'a'] > maxHeight)
//                maxHeight = h[ch - 'a'];
//        }
//
//        System.out.println(maxHeight * word.length());
//    }
//}