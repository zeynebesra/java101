import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan alacağımız sıcaklık bilgisi
        int heat;
        //Sıcaklık aralıklarını kontrol boolean değerlerimiz
        boolean flag1, flag2, flag3;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        // Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        flag1 = heat <= 5;
        // Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        flag2 = heat > 5 && heat <= 15;
        // Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        flag3 = heat > 15 && heat <= 25;

        if (flag1) {
            System.out.println("Kayak yapmaya gidebilirsiniz.");
        } else if (flag2) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (flag3) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
