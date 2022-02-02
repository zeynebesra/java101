import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "TRH");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Kül Yutmaz", "90550000002", "BIO");

        // dersler
        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        biyoloji.addTeacher(t3);

        //öğrenciler
        Student s1=new Student("İnek Şaban","140144015","4",tarih,fizik,biyoloji);
        s1.addBulkExamNote(100,50,40,90,90,90);

        s1.isPass();

        Student s2=new Student("Güdük Necmi","2211133","4",tarih,fizik,biyoloji);
        s2.addBulkExamNote(50,20,40,50,100,100);

        s2.isPass();


    }
}
