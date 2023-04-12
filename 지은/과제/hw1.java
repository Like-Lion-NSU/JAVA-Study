import java.util.Arrays;
import java.util.Scanner;

public class hw1 {
     public static void main(String[] args) {
          System.out.print("소문자 >> ");
          Scanner w = new Scanner(System.in);
          String W = w.nextLine();
          String[] a = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
          int b =  Arrays.binarySearch(a, W);
          while (b>=0){
               for(int i=0;i<=b;i++){
                    System.out.printf(a[i]);
               }
               System.out.println("");
               b-=1;
          }
     }
}