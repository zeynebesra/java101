import java.util.Scanner;
/*
- Kullanıcı Girişi
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz.
" sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName;
        int password, password2;

        System.out.print("Kullanıcı Adı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextInt();
        System.out.println("Şifrenizi Doğrulamak İçin Tekrar Giriniz: ");
        password2 = input.nextInt();

        if (password == password2)
        {
            System.out.println("Şifreniz Başarılı Bir Şekilde Oluşturuldu.");
        }
        else
        {
            System.out.println("Şifrenizi Mi Unuttunuz ? Yeni Şifre Oluşturmak İçin 1'e Çıkmak İçin 2'ye Basınız. ");
            int decide = input.nextInt();

            switch (decide) {
                case 1:
                    System.out.println("Yeni Şifre Oluşturunuz: ");
                    int newpassword = input.nextInt();

                    if (newpassword == password) {
                        System.out.println("Şifre Oluşturulamadı Lütfen Başka Bir Şifre Deneyiniz.");
                    }
                    else {
                        System.out.println("Şifre Başarılı Bir Şekilde Oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Çıkış Yaptınız. ");
                    break;
                default:

            }

        }

    }
}
