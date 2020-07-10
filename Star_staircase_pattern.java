import java.util.Scanner;

public class Star_staircase_pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("Enter the no. of rows and columns you want to print...");
        int nOfRowsAndColumns = scanner.nextInt();

        for (int i=0; i<nOfRowsAndColumns; i++) {
            for(int j=nOfRowsAndColumns; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=0; k<=i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }
}
