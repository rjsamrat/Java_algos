// Efficient solution from Hackerrank that did work

import java.util.Scanner;

public class Apple_and_orange{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int apples[] = new int[m];
        int app = 0;
        for(int i=0; i<m; i++) {
           apples[i] = scanner.nextInt();
           if(a+apples[i] >= 5 && a+apples[i] <= t) {
               app++;
           }
        }
        int oranges[] = new int[n];
        int oran = 0;
        for(int i=0; i<n; i++) {
            oranges[i] = scanner.nextInt();
            if(b+oranges[i] >= 5 && b+oranges[i] <=t) {
                oran++;
            }
        }
        System.out.println(app);
        System.out.println(oran);
    }
}






























// My solution that did'nt work -

//import java.util.Scanner;
//
//public class Apple_and_orange {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the values of s and t");
//        int sAndt[]=new int[2],aAndb[]=new int[2],mAndn[]=new int[2];
//        int appleCoordinatesFromA[]=new int[3], orangeCoordinatesFromB[]=new int[3];
//
//        for(int i=0; i<2; i++) {
//            sAndt[i] = scanner.nextInt();
//            aAndb[i] = scanner.nextInt();
//            mAndn[i] = scanner.nextInt();
//        }
//
//        for(int i=0; i<3; i++) {
//        appleCoordinatesFromA[i] = scanner.nextInt();
//        orangeCoordinatesFromB[i] = scanner.nextInt();
//        }
//
//        int a = aAndb[0] + appleCoordinatesFromA[0];
//        int b = aAndb[0] + appleCoordinatesFromA[1];
//        int c = aAndb[0] + appleCoordinatesFromA[2];
//
//        int d = aAndb[1] + orangeCoordinatesFromB[0];
//        int e = aAndb[1] + orangeCoordinatesFromB[1];
//        int f = aAndb[1] + orangeCoordinatesFromB[2];
//
//        int apples = 0;
//        int oranges = 0;
//        if(a>=sAndt[0] && a<=sAndt[1]) {
//            apples++;
//        }
//        else if(b>=sAndt[0] && b<=sAndt[1]) {
//            apples++;
//        }
//        else if(c>=sAndt[0] && c<=sAndt[1]) {
//            apples++;
//        }
//        else if(d>=sAndt[0] && d<=sAndt[1]) {
//            oranges++;
//        }
//        else if(e>=sAndt[0] && e<=sAndt[1]) {
//            oranges++;
//        }
//        else if(f>=sAndt[0] && f<=sAndt[1]) {
//            oranges++;
//        }
//
//        System.out.println("Apples: " + apples + "\n Oranges:" + oranges );
//
//    }
//}
