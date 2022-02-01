import java.util.Scanner;

// Harmonik Sayıları Bulan Program

public class Main {
    public static void main(String[] args) {
        double result =0.0;
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print(" N değeri giriniz: ");

        //Harmonik Sayı Serisi: 1 + 1/2 + 1/3 + 1/4 + .... + 1/n

        n = input.nextInt();

        for(double i=1; i<=n; i++)
        {
            result += (1/i);
        }

        System.out.print("Sonuç : " + result);

    }
}
