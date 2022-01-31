import java.util.Scanner;
/*

Dik Üçgende Hipotenüs Bulan Program
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan
ve hipotenüsü hesaplayan programı yazın.
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

 */

public class hipotenus {
    public static void main(String[] args) {
        Scanner inputEdge = new Scanner(System.in);
        System.out.println("--------------");
        System.out.println("Üçgenin Alanını Bulma");
        System.out.println("--------------");
        System.out.print("1.kenar uzunluğu: ");
        double k1 = inputEdge.nextDouble();
        System.out.println("-----------");
        System.out.print("2.kenar uzunluğu: ");
        double k2 = inputEdge.nextDouble();
        System.out.println("-----------");
        System.out.print("3.kenar uzunluğu:  ");
        double k3 = inputEdge.nextDouble();
        System.out.println("-----------");

        inputEdge.close();

        double c =  (k1 + k2 + k3)/2;
        double alan = Math.sqrt(c * (c - k1) * (c - k2) * (c - k3));
        System.out.print("Üçgenin Çevresi: ");
        System.out.println(2*c);
        System.out.format("Üçgenin Alanı: %.2f\n", alan);
    }
}
