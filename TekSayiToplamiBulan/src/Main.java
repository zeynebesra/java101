import java.util.Scanner;

/*
Tek Sayıların Toplamını Bulan Program
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan
girişleri kabul eden ve girilen değerlerden çift ve
4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */

public class Main {
    public static void main(String[] args)
    {
        int toplam = 0, sayi;
        boolean tek;
        Scanner input = new Scanner(System.in);

        /*
        tek sayı girilene kadar,
        girilen sayılardan çift ve
         4ün katı olan sayıları bulup,
          toplayan program

         */

        do {
            System.out.print("Sayı giriniz: ");
            sayi=input.nextInt();

            if (sayi%2==0&&sayi%4==0)
                toplam=toplam+sayi;
            tek=sayi%2==1;
        }
        while (!tek);

        System.out.print("Toplam: "+toplam);

    }
}
