import java.util.Scanner;
/*
Recursive Desene Göre Metot Oluşturma

Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */

public class Main
{
    // Metot Design
    // control ile girilen sayı kontrol edilir.
    // num >0 olacağı için değeri true'dur.
    //int n, boolean dNoktasi, int sayac
    static int design(int n, boolean control, int flag)
    {
        if (control)
        {
            if (n > 0)
            {
                System.out.print(n + " ");
                flag++;
                return design(n - 5, true, flag);
            }
            else
            {
                return design(n, false, flag);
            }
        }
        else
        {
            System.out.print(n + " ");
            if (flag > 0)
            {
                flag--;

                return design(n + 5, false, flag);
            }
            else
            {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        //flag sayac değişkeni, 0'dan başlamalı
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("Recursive Desene Göre Metot Oluşturma");
        System.out.println("--------------------------------------");
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        System.out.println("---------------------------------------");
        System.out.println(design(n, true, 0));
        System.out.println("---------------------------------------");
    }

}
