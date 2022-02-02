import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Fighter marc = new Fighter("Marc",15,100,90,30,50);
        Fighter alex = new Fighter("Alex",10,90,100,30,50);

        Match r = new Match(marc,alex , 90 , 100);
        r.run();

    }
}
