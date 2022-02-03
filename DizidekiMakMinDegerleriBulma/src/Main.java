import java.util.Arrays;
import java.util.Scanner;

//Dizideki Maksimum ve Minimum Değerleri Bulan
public class Main
{
    public static void main(String[] args) {

        //girilen numaraya yakın dizideki en küçük ve en büyük eleman
        int[] list2 = {15, 12, 788, 1, -1, -778, 2, 0};
        System.out.println(Arrays.toString(list2));
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        num = input.nextInt();

        int min1 = list2[0];
        int max2 = list2[0];

        for (int j : list2)
        {
            if (j < min1)
            {
                min1 = j; //dizinin min değeri bulundu
            }
            if (j > max2)
            {
                max2 = j; //dizinin max değeri bulunda
            }
        }
        for (int j : list2)
        {
            if (j > num)
            { //dizinin elemanları girilen elemandan büyük mü
                if (j <= max2)
                { //dizinin eleman değerleri max ile kıyaslandı
                    max2 = j;
                }
            }

            if (j < num)
            { //dizinin elemanları girilen elemandan küçük mü
                if (j >= min1)
                {
                    min1 = j; //dizinin eleman değerleri min ile kıyaslandı
                }
            }
        }

        System.out.println("Girilen sayıdıan küçük en yakın değer: " + min1);
        System.out.println("Girilen sayıdan büyük en yakın değer: " + max2);

    }

}
