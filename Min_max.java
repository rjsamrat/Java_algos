import java.util.Scanner;

public class Min_max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        int max=0;
        int min=1000000000;

        while(scanner.hasNext()) {
            int enteredNumber = scanner.nextInt();
            sum = sum + enteredNumber;
            if(min>enteredNumber) {
                min = enteredNumber;
            }
            if(max<enteredNumber) {
                max = enteredNumber;
            }
            System.out.println(sum);
            System.out.println((sum-max) +" " + (sum-min));
        }
        scanner.close();

           }
        }

//        import java.util.*;
//import java.util.Scanner;
//
//public class Min_max {
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        long sum = 0;
//        long min = 1000000000;
//        long max = 0;
//        while(scan.hasNext()) {
//            long n = scan.nextLong();
//            sum = sum + n;
//            if (min > n) {
//                min = n;
//            }
//            if (max < n) {
//                max = n;
//            }
//            System.out.println((sum - max) + " " + (sum - min));
//        }
//        scan.close();
//
//
//    }
//}