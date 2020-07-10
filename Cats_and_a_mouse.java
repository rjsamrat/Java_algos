import java.util.Scanner;
import  java.lang.Math;

public class Cats_and_a_mouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int query = scanner.nextInt();
        String ans[] = new String[query];

        for(int i=0; i<query; i++) {
            int array[] = new int[3];
            for(int j=0; j<3; j++) {
                array[j] = scanner.nextInt();
            }
                int a = array[0];
                int b = array[1];
                int c = array[2];
                int e = Math.abs(c-a);
                int f = Math.abs(c-b);

                if(e==f) {
                ans[i] = "Mouse C";
                }
                else if (e < f) {
                ans[i] = "Cat A";
                }
                else {
                ans[i] = "Cat B";}
        }

        for(int i=0; i<query; i++) {
            System.out.println(ans[i]);
        }
    }
}
