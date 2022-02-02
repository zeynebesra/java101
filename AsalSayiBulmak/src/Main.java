
/* Asal Sayı Bulan Program

Java dilinde "Recursive" metot kullanarak,
kullanıcıdan alınan sayının "Asal" sayı
olup olmadığını bulan programı yazın.

 */

import java.util.Scanner;

public class Main
{
    //metot
    static int asal(int num, int i) {

        if (num == i)
        {
            return 1;
        } else
        {
            if (num % i == 0)
            {
                return 0;
            } else return asal(num, i + 1);
        }

    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.print("Sayı giriniz:");
        int num = input.nextInt();
        int i = 2;
        System.out.println("---------------------");
        if (asal(num, i) == 1)
        {
            System.out.print(num + " Sayısı asaldır !");
        }
        else
        {
            System.out.println(num + " Sayısı asal değildir !");
        }

    }
}
