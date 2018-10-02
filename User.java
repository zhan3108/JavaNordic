import java.util.WeakHashMap;

public class User {
    String name;
    double health;
    // Weapon[] w=new Weapon[3];

    public User(String name, double health) {
        this.name = name;
        this.health = 100;
        //this.w=b;
    }

    public User(String name) {
        this.name = name;
        this.health = 100;


    }
}
