import java.util.Scanner;

public class plusminus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of numbers you want to enter");
        int nOfNumbers;
        float positive=0;
        float negative=0;
        float zeros=0;
        nOfNumbers = scanner.nextInt();
        String newOfNumbers[] = new String[nOfNumbers];
        for(int i=0; i<nOfNumbers; i++) {
            newOfNumbers[i] = scanner.next();
        }
        for(int i=0; i<newOfNumbers.length; i++) {
            float a;
            a = Integer.parseInt(newOfNumbers[i]);
            if(a<0.00) {
                negative += 1;
            }
            else if(a>0.00) {
                positive += 1;
            }

            else {zeros += 1;}
        }

        float p,n,o;
        p = positive/nOfNumbers;
        n = negative/nOfNumbers;
        o = zeros/nOfNumbers;

        System.out.println(p);
        System.out.println(n);
        System.out.println(o);
     }
}
