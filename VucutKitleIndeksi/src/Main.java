
import java.util.Scanner;
/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
         double boy = 0, kilo =0, index = 0;

        System.out.print("Lütfen boyunuzu (m) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu (kg) giriniz : ");
        kilo = input.nextDouble();
        input.close();
        // Formül
        // Vücut Kitle İndeks: Kilo (kg) / Boy(m) * Boy(m)
        index = kilo / (boy * boy);

        System.out.format("Vücut Kitle İndeksi: %.2f\n",index);

    }
}
