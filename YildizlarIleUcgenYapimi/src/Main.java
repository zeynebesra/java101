import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
              *
             ***
            *****
           *******
          *********
         ***********

         */
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();
        System.out.println("   Elmas");
        System.out.println("----------------------------");
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k < (n - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }

        for (int i = n; i > 0; i--) {

            for (int k = (n - i); k >= 0; k--) {
                System.out.print(" ");
            }

            for (int j = (2 * i - 2); j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------------");

        /*
        Çıktı:

               *
              ***
             *****
            *******
             *****
              ***
               *
         */
    }
}
