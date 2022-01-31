import java.util.Scanner;
/*
Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin
kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.
Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

 */

public class Main {
    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("--- Manav Kasa Programı---");

        //Meyveler KG ve Fiyatları

        final double PEAR_PRICE = 2.14;
        final double APPLE_PRICE = 3.67;
        final double TOMATOES_PRICE = 1.11;
        final double BANANA_PRICE = 0.95;
        final double EGGPLANT_PRICE = 5.0;

        double toplamTutar = 0;
        double armutKg = 0, armutFiyat = 0, elmaKg = 0, elmaFiyat = 0;
        double domatesKg = 0, domatesFiyat = 0, muzKg = 0, muzFiyat= 0;
        double patlicanKg = 0, patlicanFiyat = 0;

        //input

        System.out.println("Armut Kaç Kilo ? :");
        armutKg = input.nextDouble();
        System.out.println("Elma Kaç Kilo ? :");
        elmaKg = input.nextDouble();
        System.out.println("Domates Kaç Kilo ? :");
        domatesKg = input.nextDouble();
        System.out.println("Muz Kaç Kilo ? :");
        muzKg = input.nextDouble();
        System.out.println("Patlıcan Kaç Kilo ? :");
        patlicanKg = input.nextDouble();
        input.close();

        armutFiyat = armutKg * PEAR_PRICE;
        elmaFiyat = elmaKg * APPLE_PRICE;
        domatesFiyat = domatesKg * TOMATOES_PRICE;
        muzFiyat = muzKg * BANANA_PRICE;
        patlicanFiyat = patlicanKg * EGGPLANT_PRICE;


        toplamTutar= armutFiyat + elmaFiyat + domatesFiyat + muzFiyat + patlicanFiyat;
        System.out.format("Toplam Tutar: %.2f\n", toplamTutar);



    }
}
