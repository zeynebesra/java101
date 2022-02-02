public class Main {
    /*
    static void number(int x, int z) {
        int y = 2;
        x = x * y;
        System.out.println(x);
    }
    public static void main(String[] args) {
        int y = 3;
        int z = 2;
        if (y != z) {
            int x = 20;
        }
        int x = 50;
        number(x, z);
    }
    */ //çıktı 100

    /*
    public static void main(String args[]) {
        String x = "Patika.dev";
        kodluyoruz(x);
        System.out.println(x);
    }
    static void kodluyoruz(String y)
    {
        String x = "Java101";
        y = "Kodluyoruz";
    }
    // çıktı : Patika.dev
     */

     //---------------------------------------
    //Recursion :bir metodun kendisini çağırma tekniğidir.
    /*
    static int basamaklarToplami(int sayi){
        if (sayi == 0){
            return 0;
        }else
            return sayi % 10 + basamaklarToplami(sayi / 10);
    }
    public static void main(String[] args){
        System.out.println("Basamak toplami: "+basamaklarToplami(45612));
    }

     */
    /*
    static int as(int i) {
        if (i < 2) return 1;
        else return (i * as(i - 1));
    }

    public static void main(String[] args) {
        System.out.println(as(3));
    }

     */

     public static void main(String[] args) {
         recursiveMethod(4);
     }

    static void recursiveMethod(int num) {
        num--;
        if (num == 0)
            return;
        System.out.print(num + ",");
        recursiveMethod(num);
    } // çıktı : 3,2,1,


}
