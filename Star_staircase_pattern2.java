import java.util.Scanner;

public class Star_staircase_pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter the no. of rows and columns...");
        Scanner scanner = new Scanner(System.in);
        int nOfRowsAndColumns = scanner.nextInt();

        for(int i=0; i<nOfRowsAndColumns; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
