
import java.util.Scanner;

// Üslü Sayı Hesaplayan Program

public class Main {
    public static void main(String[] args) {
        int n, u, i, us = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Üslü Sayı Hesaplayan Program");

        System.out.print("Sayı giriniz: ");
        n = input.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        u = input.nextInt();

        //üs alma
        for(i = u; i >= 1; i--)
        {
            us *= n;
        }

        System.out.println("Sonuç : " + us);


    }
}
