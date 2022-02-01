

// Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
public class Main {
    public static void main(String[] args)
    {
        //Scanner input = new Scanner(System.in);
        System.out.println(" -------------------------------------------- ");
        System.out.println(" 1-100 Arasındaki Asal Sayıları Bulan Program ");
        System.out.println(" -------------------------------------------- ");
        for (int i = 2; i <= 100; i++)
        {
            int adet = 0;

            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                    adet++;
            }
            if (adet <=2)

                System.out.print(i + " ");
        }

    }
}
