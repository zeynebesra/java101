import java.util.Scanner;
/*
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını
ve çevresini hesaplayan programı yazın.
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360

 */
public class Main {
    public static void main(String[] args) {

        final double PI = 3.14;
        double acı = 0,r = 0 ;
        double alan = 0,cevre =0 ;

        Scanner input  = new Scanner(System.in);

        System.out.print("Üçgenin yarıçapı (cm cinsinden): ");
        r = input.nextDouble();
        System.out.print("Üçgenin merkez açısının ölçüsü : ");
        acı = input.nextDouble();
        input.close();

        alan = PI * r * r * acı / 360;
        cevre =  PI * 2 * r;

        System.out.format("Çevresi: %.2f cm\n", cevre);
        System.out.format("Alanı: %.2f cm2\n", alan);
    }
}
