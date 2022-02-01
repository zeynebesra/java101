import java.util.Scanner;

//Java ile iki sayının EBOB ve
// EKOK değerlerini "While Döngüsü" kullanarak yazınız.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------");

        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1, ekok = 1;
        int x = 1, z = 1;

        System.out.println("-------------------");

        if(n2 > n1)
        {
            while (x <= n1)
            {
                if (n1 % x == 0 && n2 % x == 0)
                {
                    ebob = x;
                }
                x++;
            }
            System.out.println("EBOB: "+ebob);
        }
        else
        {
            while (z <= n2)
            {
                if (n1 % z == 0 && n2 % z == 0)
                {
                    ebob = z;
                }
                z++;
            }
            System.out.println("EBOB: "+ebob);
        }

        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK: "+ekok);
    }
}
