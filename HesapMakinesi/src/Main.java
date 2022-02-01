import java.util.Scanner;

// ------ Hesap Makinesi
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0, num2 = 0, select = 0;

        System.out.print("Birinci sayıyı giriniz: ");
        num1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();

        System.out.print("İşlemler\n");
        System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\n");
        System.out.print("\nİşlem seçimi: ");
        select = input.nextInt();
        input.close();

        //işlemler

        switch (select) {
            case 1:
                System.out.println("Sonuç: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç: " + (num1 * num2));
                break;
            case 4:
                System.out.println("Sonuç: " + ((num2 != 0) ? (num1 / num2) : "sonsuz"));
                break;
            default:
                System.out.println("Geçersiz seçim yaptınız.");
                break;
        }
    }
}
