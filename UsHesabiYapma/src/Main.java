
import java.util.Scanner;

/*
Üs Hesabı Yapan
Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
"Recursive" metot kullanarak yapan programı yazınız.
 */

public class Main
{
    // METOT
    static int power(int base, int power)
    {
        if (power != 0)
        {
            return base * power(base, power - 1);
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        int base, power;
        System.out.println("---------------------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayısı giriniz: ");
        base = input.nextInt();

        System.out.print("Üs sayısı giriniz: ");
        power = input.nextInt();
        System.out.println("---------------------------");

        System.out.println("Sonuç: " + power(base, power));

    }
}
