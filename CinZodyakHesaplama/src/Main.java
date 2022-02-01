import java.util.Scanner;
/*
Çin Zodyağı Hesaplama?
Çin zodyağı hesaplanırken kişinin doğum yılının
12 ile bölümünde kalana göre bulunur.
 */

public class Main {
    public static void main(String[] args)
    {
        System.out.println("----------------------------");
        System.out.println("<-- Çin Zodyağı Hesaplama -->");
        System.out.println("----------------------------");
        int date;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz: ");
        date = input.nextInt();
        System.out.println("----------------------------");

        /*
        Doğum Tarihi %12 = 0 ➜ Maymun
        Doğum Tarihi %12 = 1 ➜ Horoz
        Doğum Tarihi %12 = 2 ➜ Köpek
        Doğum Tarihi %12 = 3 ➜ Domuz
        Doğum Tarihi %12 = 4 ➜ Fare
        Doğum Tarihi %12 = 5 ➜ Öküz
        Doğum Tarihi %12 = 6 ➜ Kaplan
        Doğum Tarihi %12 = 7 ➜ Tavşan
        Doğum Tarihi %12 = 8 ➜ Ejderha
        Doğum Tarihi %12 = 9 ➜ Yılan
        Doğum Tarihi %12 = 10 ➜ At
        Doğum Tarihi %12 = 11 ➜ Koyun
         */

        switch (date % 12)
        {
            case 0:
                System.out.print("Zodyak Burcunuz:Maymun");
                break;
            case 1:
                System.out.print("Zodyak Burcunuz:Horoz");
                break;
            case 2:
                System.out.print("Zodyak Burcunuz:Köpek");
                break;
            case 3:
                System.out.print("Zodyak Burcunuz:Domuz");
                break;
            case 4:
                System.out.print("Zodyak Burcunuz:Fare");
                break;
            case 5:
                System.out.print("Zodyak Burcunuz:Öküz");
                break;
            case 6:
                System.out.print("Zodyak Burcunuz:Kaplan");
                break;
            case 7:
                System.out.print("Zodyak Burcunuz:Tavşan");
                break;
            case 8:
                System.out.print("Zodyak Burcunuz:Ejderha");
                break;
            case 9:
                System.out.print("Zodyak Burcunuz:Yılan");
                break;
            case 10:
                System.out.print("Zodyak Burcunuz:At");
                break;
            case 11:
                System.out.print("Zodyak Burcunuz:Koyun");
                break;
            default:
                System.out.print("Hatalı girdiniz.");
                break;
        }

    }
}
