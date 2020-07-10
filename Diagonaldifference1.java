import java.util.Scanner;

public class Diagonaldifference1 {

        public static void main(String[] args) {
            int nOfRowsAndColums;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the no. of rows and columns for the matrix");
            nOfRowsAndColums = Integer.parseInt(scanner.nextLine());

            int diag1 = 0; int diag2 = 0;
            for(int i=0; i<nOfRowsAndColums; i++) {
                String str[] = scanner.nextLine().split(" ");
                diag1 += Integer.parseInt(str[i]);
                diag2 += Integer.parseInt(str[nOfRowsAndColums - 1 - i]);
            }
            int diagDiff = Math.abs(diag1-diag2);
            System.out.println(diagDiff);
        }}

//    Scanner in = new Scanner(System.in);
//    int n ;
//    int diag1 = 0 ; int diag2 = 0;
//		n = Integer.parseInt(in.nextLine());
//                for(int i =0 ; i < n; i++){
//        String str[] = in.nextLine().split(" ");
//        diag1 = diag1 + Integer.parseInt(str[i]);
//        diag2 = diag2 + Integer.parseInt(str[n-1-i]);
//        }
//
//        int diagDiff = Math.abs(diag1 -  diag2);
//        System.out.println(diagDiff);
//        }
//
