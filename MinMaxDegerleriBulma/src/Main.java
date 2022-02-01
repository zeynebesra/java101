import java.util.Scanner;

/*
Ödev 6- Girilen Sayılardan Min ve Max Değerleri Bulma
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0, sayi, a;

        System.out.print("Kaç sayı girececeksiniz?: ");
        a = input.nextInt();
        System.out.println("---------------------");

        for (int i = 1; i <= a; i++)
        {
            System.out.print(i + ". Sayıyı giriniz: ");
            sayi= input.nextInt();
            if (i == 1)
            {
                max = sayi;
                min = sayi;
            }
            if (sayi > max)
            {
                max = sayi;
            }
            if (sayi < min)
            {
                min = sayi;
            }
        }
        System.out.println("---------------------");
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçün sayı: " + min);

    }
}
