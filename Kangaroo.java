import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int v1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int v2 = scanner.nextInt();

        if(v1>v2 &&(x2-x1)%(v1-v2)==0) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }}








        //        int v1counti = 0;
//        int v2counti = 0;
//        int a;
//        boolean hasmet = false;
//        while (!hasmet) {
//            for (int i = 1; i < 100; i++) {
//               x1=x1+v1*i;
//               v1counti++;
//               x2=x2+x2*i;
//               v2counti++;
//
//               if(x1==x2 && v1counti==v2counti) {
//                   System.out.println("YES");
//                   hasmet = true;
//               }
//            }
//
//    }
//        if(hasmet) {
//            System.out.println("NO");
//        }
//    }}


//        boolean hasmet = false;
//        for(int i=0; i<1000; i++) {
//            while (!hasmet) {
//                for (int j = 0; j <= i; j++) {
//                    x1 = x1 + v1;
//
//                }
//                for(int k=0; k<=i; k++) {
//                    x2 = x2 + v2;
//                }
//                if(x1==x2 && j==k)
//            }
//        }
//



