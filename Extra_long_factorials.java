import java.math.BigInteger;
import java.util.Scanner;

public class Extra_long_factorials {
    private static BigInteger factorial(int n) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i=n; i>0; i--) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        return bigInteger;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));

}}
