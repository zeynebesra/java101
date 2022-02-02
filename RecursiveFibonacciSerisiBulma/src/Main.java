import java.util.Scanner;

//Recursive ile Fibonacci Serisi Bulan Program
public class Main
{
    static int fib(int n)
    {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi elaman sayısı: ");
        int num = input.nextInt();
        System.out.print(fib(num));

    }
}
