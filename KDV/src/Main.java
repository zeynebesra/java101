import java.util.Scanner;
/*
KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını
ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
 */

public class Main {

    public static void main(String[] args) {

        Scanner inputPrice = new Scanner(System.in);
        System.out.print("Tutar giriniz: ");

        double tutar= inputPrice.nextDouble();

        /*
        girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı
         */

        double kdv= (tutar < 1000) ? 0.18 : 0.08;
        double kdvDeger = kdv * tutar;
        double toplamTutar =tutar + kdvDeger;
        inputPrice.close();

        System.out.println("Tutar: " + tutar);
        System.out.println("KDV oranı: " + kdv);
        System.out.println("KDV değeri: " + kdvDeger);
        System.out.println("Toplam tutar: " + toplamTutar);

    }
}
