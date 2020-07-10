// My code passed all the test cases. But a more efficient code -

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Drawing_book {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfPages = scanner.nextInt();
        int pageNo = scanner.nextInt();
        int mid = (nOfPages + 1) / 2;
        if(pageNo < mid) {
            System.out.println(pageNo / 2);
        } else {
            System.out.println((nOfPages - pageNo) / 2);
        }
    }
}


// Still more efficient code -
//

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//public class Drawing_book {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int nOfPages = in.nextInt();
//        int pageNo = in.nextInt();
//        System.out.println(Math.min(pageNo / 2, nOfPages/2 - pageNo/2));
//    }
//}

////  My very inefficient but working code -
//
//import java.util.Scanner;
//
//public class Drawing_book {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int ans = 0;
//        int nOfPages = scanner.nextInt();
//        int pageno = scanner.nextInt();
//        if (nOfPages % 2 == 0) {
//            for (int i = 1; i < pageno + 1; i++) {
//                if (pageno % 2 == 0) {
//                    if (pageno <= (nOfPages / 2)) {
//                        ans = (pageno / 2);
//                    }
//                    if (pageno > (nOfPages / 2)) {
//                        ans = ((nOfPages / 2) - (pageno / 2));
//                    }
//                }
//                if (pageno % 2 != 0) {
//                    if (pageno <= (nOfPages / 2)) {
//                        ans = ((pageno - 1) / 2);
//                    }
//                    if (pageno > (nOfPages / 2)) {
//                        ans = ((nOfPages / 2) - (pageno - 1) / 2);
//                    }
//                }
//            }
//
//        }
//        if (nOfPages % 2 != 0) {
//            for (int i = 1; i < pageno + 1; i++) {
//                if (pageno % 2 == 0) {
//                    if (pageno == ((nOfPages+1) / 2)) {
//                        pageno = pageno + 1;
//                    }
//                    if (pageno <= ((nOfPages+1) / 2)) {
//                        ans = (pageno / 2);
//                    }
//                    if (pageno > ((nOfPages+1) / 2)) {
//                        ans = (((nOfPages-1) / 2) - (pageno / 2));
//                    }
//                }
//
//                if (pageno % 2 != 0) {
//                    if (pageno <= ((nOfPages+1) / 2)) {
//                        ans = ((pageno - 1) / 2);
//                    }
//                    if (pageno > ((nOfPages+1) / 2)) {
//                        ans = (((nOfPages-1) / 2) - ((pageno - 1) / 2));
//                    }
//                }
//            }
//        }
//        System.out.println(ans);
//    }
//}