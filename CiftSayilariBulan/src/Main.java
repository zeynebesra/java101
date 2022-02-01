import java.util.Scanner;
/*
Java döngüler ile kullanıcının girdiği sayıya kadar
çift olan sayıları bulan programı yazıyoruz.
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 */

public class Main {
    public static void main(String[] args) {

        int number, i, j = 0, toplam = 0, ort = 0;
        Scanner input = new Scanner(System.in);

        //Girilen sayıya kadar olan çift sayılar
        System.out.println("Sayı giriniz: ");
        number = input.nextInt();
        System.out.println("Çift sayılar: ");
        for (i=1; i<number; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println(i);
            }
        }

        System.out.print("------------------------\n");
        //3 ve 4 ile bölünen sayıların ortalamasını yazdıran program
        System.out.println("Sayı giriniz: ");
        number = input.nextInt();
        System.out.println("3 ve 4 ile bölünen sayılar: ");
        for (i = 0; i <= number; i++)
        {
            if ((i % 3 == 0) & (i % 4 == 0))
            {
                System.out.println(i);
                j++;
                toplam+= i;
            }
        }

        ort = toplam / j;
        System.out.println("Sayıların ortalaması: " + ort);


    }
}
