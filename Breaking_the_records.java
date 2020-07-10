import java.util.Scanner;

public class Breaking_the_records {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of games played...");
        int gamesPlayed = scanner.nextInt();
        int[] scores = new int[gamesPlayed];

        for (int i=0; i<gamesPlayed; i++) {
            scores[i] = scanner.nextInt();
        }
        int best = scores[0]; int worst = 0;
        int bestCount = 0; int worstCount =0;

        for(int i=0; i<gamesPlayed-1; i++) {
            if(scores[i+1] < scores[0]) {
                worst = scores[i+1];
                worstCount++;
                break;
            }
          }
        for(int i=0; i<gamesPlayed-1; i++) {
            if(scores[i+1] < worst) {
                worst = scores[i+1];
                worstCount++;
            }
            if(scores[i+1] > best) {
                best = scores[i+1];
                bestCount++;
            }
        }
        System.out.println("Best: " + bestCount + " Worst: "+ worstCount );
    }
}
