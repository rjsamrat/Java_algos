import java.util.Scanner;

public class The_hurdles_race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfHurdles = scanner.nextInt();
        int dansHeight = scanner.nextInt();

        int hurdles[] = new int[nOfHurdles];
        int max = 0;
        for (int i=0; i<nOfHurdles; i++) {
            hurdles[i] = scanner.nextInt();
        }
        for (int i=0; i<nOfHurdles; i++) {
            if(hurdles[i] > max ) {
                max = hurdles[i];
            }
        }
        if (max <= dansHeight) System.out.println(0);
        if (max > dansHeight) System.out.println(max - dansHeight);
    }
}
