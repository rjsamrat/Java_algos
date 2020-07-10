import java.util.Scanner;

public class Programmer_day {
    public static void main(String[] args) {
        System.out.println("Enter the Year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int x;
        if(year==1918) {
            x=26;
        }
        else if(year<1918 && year%4==0) {
            x=12;
        }
        else if(year>1918 && year % 400 == 0 || year % 4==0 && year % 100 != 0 ) {
            x=12;
        }
        else
            x=13;
        System.out.println(x + ".09." + year);
    }
}
