import java.util.Scanner;

/*
Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

 */

//Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

public class Main {
    public static void main(String[] args) {
        int sayi;
        int adet = 0,toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayılarının toplamını hesaplama");

        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        while(sayi != 0)
        {
            toplam = (sayi%10) + toplam;
            sayi /= 10;
            ++adet;
        }
        System.out.println("Basamakların Toplamı: " + toplam);

        /*

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            // 1*1*1*1 = 1^4
            basPow = 1;
            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }

         */


    }
}
