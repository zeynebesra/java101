import java.util.Scanner;

//Faktöriyel Hesaplayan Program
public class Main {
    public static void main(String[] args) {

        int n, r, num, i, j, k;
        int facN = 1, facR = 1, facK = 1, total = 1;
        System.out.println("------------------------------");
        System.out.println("FAKTÖRİYEL HESAPLAMA");
        System.out.println("------------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        num = input.nextInt();

        for (i = num; i >= 1; i--) {
            total *= i;
        }
        System.out.println("Faktöriyel: " + total);
        System.out.println("------------------------------");
        System.out.println("KOMBİNASYON HESAPLAMA");
        System.out.println("------------------------------");
        System.out.print("n değerini giriniz: ");
        n = input.nextInt();
        System.out.print("r değerini giriniz: ");
        r = input.nextInt();

        for (i = n; i >= 1; i--) {
            facN *= i;
        }
        for (j = r; j >= 1; j--) {
            facR *= j;
        }
        for (k = (n - r); k >= 1; k--) {
            facK *= k;
        }

        total = facN / (facR * facK);
        System.out.println("Kombinasyon: " + total);

    }
}
