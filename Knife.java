import javax.swing.*;

public class Knife extends Weapon{

    public Knife(double pow, int cap) {
        this.title="Нож";
        this.pow=40;
        this.cap=3;
        //super (k);
    }
    public Knife() {
        this.title="Нож";
        this.pow=100;
        this.cap=10;


    }
    public  double powWeap(double dist, double health) {
        double k=1;
        if (cap-->0){
            if (dist<=2) k=1;

            else k=0;
        }
        else {k=0;
            JOptionPane.showMessageDialog(null, "У вас не осталось возможности применить это оружие -осечка!", "Cтатистика", JOptionPane.ERROR_MESSAGE); }


        health=health-(pow*k);
        return (double) (health);

    }
}