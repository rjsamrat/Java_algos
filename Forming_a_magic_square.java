import java.util.Scanner;

public class Forming_a_magic_square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magic[][] = new int[3][4];
        magic = new int[][]{{1, 2, 3, 4},
                            {2,3,4,1},
                            {2,3,4,5}};


        System.out.println(magic[0][0]);
    }
}
