import java.util.Scanner;

public class Bon_Appetit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nOfItems = scanner.nextInt();
        int foodItemArray[] = new int[nOfItems];
        int indexAnnaDidntEat = scanner.nextInt();

        for(int i=0; i<nOfItems; i++) {
            foodItemArray[i] = scanner.nextInt();
        }
        int briansCalculation = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<nOfItems; i++) {
            sum += foodItemArray[i];
        }
        int AnnaShouldPay = (sum - foodItemArray[indexAnnaDidntEat])/2;
        if(briansCalculation == AnnaShouldPay) {
            System.out.println("Bon Appetit");
        }
        if(briansCalculation > AnnaShouldPay) {
            System.out.println(briansCalculation-AnnaShouldPay);
        }
    }
}
