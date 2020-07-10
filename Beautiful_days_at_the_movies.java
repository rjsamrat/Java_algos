import java.util.Scanner;

public class Beautiful_days_at_the_movies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
//        int k = scanner.nextInt();
        int rev=0; int rem;

        for (int l=i; l<=j; l++) {
            while (i != 0) {
                rem = i % 10;
                rev = rev * 10 + rem;
                i = i / 10;
            }
            rev = i;
    }
}}
