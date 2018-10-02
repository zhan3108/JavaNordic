import javax.swing.*;

public class Granate extends Weapon{

    public Granate(double pow, int cap) {
        this.title="F1";
        this.pow=90;
        this.cap=2;
        //super (k);
    }
    public Granate() {
        this.title="F1";
        this.pow=90;
        this.cap=2;


    }
    public  double powWeap(double dist, double health) {
        double k=1;
        if (cap-->0){
            if (dist>=20 && dist<=40) k=1;

            else k=0.1;
        }
        else {k=0;
            JOptionPane.showMessageDialog(null, "У вас не осталось возможности применить это оружие -осечка!", "Cтатистика", JOptionPane.ERROR_MESSAGE); }


        health=health-(pow*k);
        return (double) (health);

    }
}