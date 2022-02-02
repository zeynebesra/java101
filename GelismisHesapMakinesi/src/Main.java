import java.util.Scanner;

// Gelişmiş Hesap Makinesi
public class Main
{
    // Toplama işlemi
    static void plus() {
        int result = 0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı toplayacaksınız: ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt();
            result += num;
        }
        System.out.println("Toplam: " + result);
    }

    // Çıkarma İşlemi
    static void minus() {
        int result = 0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt();
            if (i == 1) {
                result += num;
                continue;
            }
            result -= num;
        }
        System.out.println("Sonuç: " + result);
    }

    // Çarpma İşlemi
    static void multiply() {
        int result = 1, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt();
            if (num == 0) {
                result = 0;
                break;
            }
            result *= num;
        }
        System.out.println("Sonuç: " + result);
    }

    // Bölme işlemi
    static void divide() {

        double result = 0.0, num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter = scan.nextInt();
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". Sayı: ");
            num = scan.nextInt();
            if (i != 1 && num == 0) {
                System.out.println("Bölen için 0 değerini giremezsiniz: ");
                continue;
            }
            if (i == 1) {
                result = num;
                continue;
            }
            result /= num;
        }
        System.out.println("Sonuç: " + result);

    }

    // Üs Alma İşlemi
    static void power() {
        int base, power, result = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        base = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        power = scan.nextInt();
        for (int i = 1; i <= power; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }

    // Faktoriyel İşlemi
    static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Faktöriyel hesabı için sayı giriniz: ");
        int num = input.nextInt();
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    // Mod Alma İşlemi
    static void mod() {
        int result;
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayının modunu almak istiyorsunuz?: ");
        int num = input.nextInt();
        System.out.print("Hangi sayıya göre mod almak istiyorsunuz?: ");
        int modNum = input.nextInt();
        if (num == 0 && modNum == 0) {
            System.out.println("Lütfen geçerli değerler giriniz: ");
        } else {
            result = num % modNum;
            System.out.println("Sonuç: " + result);
        }
    }

    // Dikdörtgen alan ve çevre hesabı
    static void rectangle() {
        int uzunKenar, kısaKenar, cevre, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        uzunKenar = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        kısaKenar = input.nextInt();

        cevre = (uzunKenar * 2) + (kısaKenar * 2);
        alan = uzunKenar * kısaKenar;
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("-------------------------");
        String menu = "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n" +
                "4-Bölme İşlemi\n" +
                "5-Üslü Sayı Hesaplama\n" +
                "6-Faktoriyel Hesaplama\n" +
                "7-Mod Alma\n" +
                "8-Dikdörtgen Alan ve Çevre Hesabı\n" +
                "0- Çıkış Yap\n";


        do {
            System.out.println("--------------------------");
            System.out.print(menu);
            System.out.println("--------------------------");
            System.out.println("----- HESAP MAKİNESİ -----");
            System.out.println("--------------------------");
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    plus();
                    break;

                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer giriniz!");
            }

        } while (choice != 0);

    }
}
