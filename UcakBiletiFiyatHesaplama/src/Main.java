import java.util.Scanner;
/*
Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.

 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, yas, tip;
        double tutar, topTutar, indTutar, indYas, indGidisDonus;

        System.out.println("----------------------------");
        System.out.println("Uçak Bileti Fiyatı Hesaplama");
        System.out.println("----------------------------");
        System.out.print("Mesafe km olarak giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipi seç\n(1-Tek Yön, 2-Gidiş Dönüş): ");
        tip = input.nextInt();
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        System.out.println("Uçak Bileti Fiyatı : ");

        if (km > 0 && yas > 0 && (tip == 1 || tip == 2))
        {
            tutar = km * 0.10;

            //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.

            if (yas < 12)
            {
                indYas = tutar * 0.50;
                indTutar = tutar - indYas;
                indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.print("Toplam tutar: " + topTutar);
            }

            //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.

            else if (yas < 24)
            {
                indYas = tutar * 0.10;
                indTutar = tutar - indYas;
                indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.print("Toplam tutar: " + topTutar);
            }

            //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.

            else if (yas < 65)
            {
                indGidisDonus = tip == 2 ? tutar * 0.20 : 0;
                topTutar = (tutar - indGidisDonus) * tip;
                System.out.print("Toplam tutar: " + topTutar);
            }
            else
            {
                indYas = tutar * 0.30;
                indTutar = tutar - indYas;
                indGidisDonus = tip == 2 ? indTutar * 0.20 : 0;
                topTutar = (indTutar - indGidisDonus) * tip;
                System.out.print("Toplam tutar: " + topTutar);
            }
        }

        else System.out.print("Hatalı veri girildi");

    }
}
