import java.util.Scanner;
/*
Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Taksimetre Tutarını Hesaplama");
        System.out.println("--------------");
        double toplamTutar = 0, mesafe = 0, km = 2.2, ilkTutar = 10;
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe = input.nextDouble();
        input.close();
        toplamTutar = ilkTutar + mesafe * km;
        toplamTutar= (toplamTutar < 20) ? 20 : toplamTutar;
        System.out.println("--------------");
        System.out.format("Toplam Tutar: %.2f TL\n", toplamTutar);
    }
}
