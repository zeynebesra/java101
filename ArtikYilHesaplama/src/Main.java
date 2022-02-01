import java.util.Scanner;
/*
Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
Artık Yıl Nedir?
Artık yıl, Miladî takvimde 365 yerine 366 günü olan yıl.
Bu fazladan gün (artık gün), normalde 28 gün olan şubat ayına 29 Şubat’ın eklenmesi ile elde edilir.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;

        System.out.print("Yıl Giriniz: ");
        year = input.nextInt();
        System.out.print("-----------------------\n");

        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    System.out.println(year + "\nBir artık yıldır.");
                }
                else
                {
                    System.out.println(year + "\nBir artık yıl değildir.");
                }
            }
            else
            {
                System.out.println(year+ "\nBir artık yıldır.");
            }
        }
        else
        {
            System.out.println(year + "\nBir artık yıl değildir.");
        }

    }
}
