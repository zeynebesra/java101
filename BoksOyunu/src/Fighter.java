public class Fighter
{
    String name;
    int damage;
    int healt;
    int weight;
    int dodge;
    int firstHit;

    //Constructor
    Fighter(String name, int damage, int healt, int weight, int dodge,int firstHit) {
        this.name = name;
        this.damage = damage;
        this.healt = healt;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) { this.dodge = dodge; }
        else { this.dodge = 0; }
        if (firstHit >= 0 && firstHit <= 100) { this.firstHit = firstHit; }
        else { this.firstHit = 0; }
    }

    //Metotlar

    int hit(Fighter foe)
    {
        System.out.println(this.name + "=>" + foe.name + " " + this.damage + " hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println("------------------");
            System.out.println(foe.name + " gelen hasarı blokladı");
            return foe.healt;
        }

        if (foe.healt - this.damage < 0) {
            return 0;
        }

        return foe.healt - this.damage;
    }

    boolean isDodge()
    {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }


    boolean isFirstHit()
    {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.firstHit;
    }



}
