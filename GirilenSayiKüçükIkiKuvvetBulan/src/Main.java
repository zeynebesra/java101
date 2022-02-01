
// Girilen Sayıdan Küçük 2’nin Kuvvetlerini Bulan Program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.println("---------------------------");
        System.out.println("Girilen Sayıdan Küçük İkinin \nKuvvetlerini Bulan Program");
        System.out.println("---------------------------");

        System.out.print("Sayı giriniz: ");
        sayi=input.nextInt();
        System.out.println("---------------------------");

        System.out.println("Girilen sayının 2'ün kuvvetleri");

        for(int i=1; i<=sayi;i*=2)
        {
            System.out.println(i);
        }
        System.out.println("---------------------------");

        //Girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran

        System.out.println("Girilen sayının 4'ün kuvvetleri");
        for (int i=1;i<=sayi;i*=4)
            System.out.println(i);
        System.out.println("---------------------------");

        System.out.println("Girilen sayının 5'in kuvvetleri");
        for (int i=1;i<=sayi;i*=5)
            System.out.println(i);



    }
}
