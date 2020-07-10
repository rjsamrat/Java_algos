import java.util.Scanner;

public class Electronic_shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = scanner.nextInt();
        int max = budget; int insideMax = 0;
        int ans = 0;
        int nOfKeymodels = scanner.nextInt();
        int nOfDrivemodels = scanner.nextInt();
        int[] keys = new int[nOfKeymodels];
        int[] drives = new int[nOfDrivemodels];

        for(int i=0; i<nOfKeymodels; i++) {
            keys[i] = scanner.nextInt();
        }
        for(int j=0; j<nOfDrivemodels; j++) {
            drives[j] = scanner.nextInt();
        }
        for(int i=0; i<nOfKeymodels; i++) {
            for(int j=0; j<nOfDrivemodels; j++) {
                int n = keys[i] + drives[j];
                if(n <= budget) {
                    if(n > insideMax) {
                        insideMax = n;
                        ans = insideMax;
                    }
                }
                if(n > budget && insideMax == 0) {
                    ans = -1;
                }
            }
        }
        System.out.println(ans);
    }
}
