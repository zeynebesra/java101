public class Match
{
    Fighter f1;
    Fighter f2;
    int minWeith;
    int maxWeith;

    //Constructor
    Match(Fighter f1, Fighter f2, int minWeith, int maxWeith) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeith = minWeith;
        this.maxWeith = maxWeith;

    }

    void run() {
        if (isCheck()) {
            while (this.f1.healt > 0 && this.f2.healt > 0) {
                System.out.println("====YENİ ROUND====");
                if (this.f1.isFirstHit()) {
                    this.f2.healt = this.f1.hit(f2);
                    if (isWin())
                        break;
                }
                if (this.f2.isFirstHit()) {
                    this.f1.healt = this.f2.hit(f1);
                    if (isWin())
                        break;
                }
                System.out.println(this.f1.name + " Sağlık: " + this.f1.healt);
                System.out.println(this.f2.name + " Sağlık: " + this.f2.healt);
            }
        } else {
            System.out.println("Siklet uyumsuzluğu.");
        }
    }

    boolean isCheck()
    {
        return (this.f1.weight >= minWeith && this.f1.weight <= maxWeith) && (this.f2.weight >= minWeith && this.f2.weight <= maxWeith);
    }

    boolean isWin()
    {
        if (this.f1.healt == 0) {
            System.out.println(this.f2.name + " kazandı");
            return true;
        }
        if (this.f2.healt == 0) {
            System.out.println(this.f1.name + " kazandı.");
            return true;
        }

        return false;
    }

}
