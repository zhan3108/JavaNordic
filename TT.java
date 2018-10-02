import javax.swing.*;

public class TT extends Weapon {

    public TT(double pow, int cap) {
        this.title="TT";
        this.pow = 40;
        this.cap = 3;
        //super (k);
    }

    public TT() {
        this.title="TT";
        this.pow = 30;
        this.cap = 7;


    }

    public  double powWeap(double dist, double health) {
        double k=1;
        if (cap-->0){
            if (dist>=2 && dist<=20) k=1;
            if (dist>20 && dist<=50) k=0.6;
            else k=0.2;
        }
        else {k=0;
            JOptionPane.showMessageDialog(null, "У вас не осталось возможности применить это оружие -осечка!", "Cтатистика", JOptionPane.ERROR_MESSAGE); }


        health=health-(pow*k);
        return (double) (health);

    }
}