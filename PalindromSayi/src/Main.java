import java.util.Scanner;

/*
Palindrom Sayı
Palindromik sayı, iki taraftan okunduğu zaman
okunuş yönüyle aynı olan sayılardır.

 */

public class Main
{
    //metot
    static boolean isPalindrom(int number) // True or False
    {
        //numberın basamak sayı kullanarak tersini elde etmek
        int temp = number, reversedNumber = 0, lastNumber;

        while (temp != 0)
        {
            //son rakam
            lastNumber = temp % 10;
            reversedNumber = (reversedNumber * 10) + lastNumber; //ilk rakam yaptık
            temp /= 10;
        }
        if (number == reversedNumber)
        {
            System.out.println("Palindrom Sayıdır.");
        }
        else
        {
            System.out.println("Palindorm sayı değil.");
        }
        return true;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        System.out.println("-------------------");
        isPalindrom(num);

    }

}
