import javax.swing.*;

public class Ak47 extends Weapon{

    public Ak47(double pow, int cap) {
        title="Калашников";
        pow=40;
        cap=3;
        //super (k);
    }
    public Ak47() {
        title="Калашников";
        pow=40;
        cap=3;


            }
    public  double powWeap(double dist, double health) {
        double k=1;
        if (cap-->0){
        if (dist>70 || dist<10) k=0.4;
        if (dist>30 && dist<70) k=1;
        else k=0.3;
        }
        else {k=0;
            JOptionPane.showMessageDialog(null, "У вас не осталось возможности применить это оружие -осечка!", "Cтатистика", JOptionPane.ERROR_MESSAGE); }


        health=health-(pow*k);
        return (double) (health);

    }
}