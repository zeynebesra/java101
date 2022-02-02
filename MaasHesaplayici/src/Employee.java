/*
Sınıfın Nitelikleri :
name : Çalışanın adı ve soyadı
salary : Çalışanın maaşı
workHours : Haftalık çalışma saati
hireYear : İşe başlangıç yılı

 */
public class Employee
{
    String name;
    double salary;
    int workHours;
    int hireYear;

    double bonus;
    double tax;
    double raiseSalary;

    //Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    /*
    Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı
    her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
     */
    void bonus() {
        if (this.workHours>40)
        {
            this.bonus = (this.workHours - 40) * 30;
        }
        else
        {
            this.bonus=0;
        }
    }

    /*
    Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
     */
    void tax()
    {
        if (this.salary > 0 && this.salary < 1000)
        {
            this.tax = this.salary * 0;
        }
        else
        {
            this.tax = this.salary * 0.03;
        }
    }

    /*
    Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
     */
    void raiseSalary()
    {
        if (2021-this.hireYear<10)
        {
            this.raiseSalary=this.salary*0.05;
        }
        else if(2021-this.hireYear<20)
        {
            this.raiseSalary=this.salary*0.10;
        }
        else
            this.raiseSalary=this.salary*0.15;
    }


    // toString() : Çalışana ait bilgileri ekrana bastıracaktır.
    void string() {
        System.out.println("--------------------------------");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Maaş Artışı: " + this.raiseSalary);
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :" + (this.salary+this.bonus-this.tax));
        System.out.println("Toplam Maaş: " + (this.salary+this.bonus+this.raiseSalary-this.tax));
    }






}
