import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      long[] array1 = new long[3];
      long[] array2 = new long[3];

      for(int i=0; i<3;i++) {
          array1[i] = scanner.nextInt();
      }
       System.out.println();

      for(int j=0; j<3;j++) {
           array2[j] = scanner.nextInt();
      }
       System.out.println();

      int array1points = 0;
      int array2pounts = 0;

       for(int k=0; k<3; k++){
           if(array1[k] > array2[k]) {
               array1points++;
           }
           if(array2[k] > array1[k]) {
               array2pounts++;
           }
       }
       System.out.printf("%d %d" ,array1points,  array2pounts);

}}