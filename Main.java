import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        //создание игроков
        User user1 = new User(JOptionPane.showInputDialog("введите имя первого игрока"));
        User user2 = new User(JOptionPane.showInputDialog("введите имя вторго игрока"));
       // созадание объектов оружия
        Ak47 k1 = new Ak47();
        Ak47 k2 = new Ak47();
        TT t1 = new TT();
        TT t2 = new TT();
        Granate G1 = new Granate();
        Granate G2 = new Granate();
        Knife Kn1 = new Knife();
        Knife Kn2 = new Knife();

        // создание массивов оружия игроков
        Weapon[] s1 = {k1, t1, G1, Kn1};
        Weapon[] s2 = {k2, t2, G2, Kn2};

        // Цикл сражения
        for (int i = 0; i < 5; i++) {
            double dist = (double) (1 + Math.random() * 100); // определение дистанции
            //статус игроков
            JOptionPane.showMessageDialog(null, user1.name + ":  " + "Здоровье: " + user1.health + "\n" + user2.name + ":  " + "Здоровье: " + user2.health + "\n" , "Cтатистика", JOptionPane.INFORMATION_MESSAGE);
            // выбор игроками оружия и статус имеющегося оружия
            String vyb1 = JOptionPane.showInputDialog(user1.name + "! выберите оружие " + "\n" + "1. " + s1[0].title + " осталось" + s1[0].cap + "\n" + "2. " + s1[1].title + "осталось " + s1[1].cap + "\n" + "3. " + s1[2].title + " осталось " + s1[2].cap + "\n" + "4. " + s1[3].title + " осталось " + s1[3].cap+"\n" + "Дистанция:  " + dist + " метров");
            String vyb2 = JOptionPane.showInputDialog(user2.name + "! выберите оружие " + "\n" + "1. " + s2[0].title + " осталось" + s2[0].cap + "\n" + "2. " + s2[1].title + "осталось " + s2[1].cap + "\n" + "3. " + s2[2].title + " осталось " + s2[2].cap + "\n" + "4. " + s2[3].title + " осталось " + s2[3].cap+"\n" + "Дистанция:  " + dist + " метров");
            // огонь выбранным оружием
            user2.health=s1[Integer.parseInt(vyb1)-1].powWeap(dist, user2.health);
            user1.health=s2[Integer.parseInt(vyb2)-1].powWeap(dist, user1.health);
        // Проверка условий досрочного выхода из цикла сражиния: плохое здоровье
        if (user1.health > 0 && user2.health <= 0) {
            i = i + 4;
            JOptionPane.showMessageDialog(null, user1.name + " WIN!!" + "\n" + user2.name + " KAPUT", "Upsss", JOptionPane.INFORMATION_MESSAGE);
        }
        if (user2.health > 0 && user1.health <= 0) {
            i = i + 4;
            JOptionPane.showMessageDialog(null, user2.name + " WIN!!" + "\n" + user1.name + " KAPUT", "Upsss", JOptionPane.INFORMATION_MESSAGE);
        }
        if (user2.health <= 0 && user1.health <= 0) {
            i = i + 4;
            JOptionPane.showMessageDialog(null, "вобщем все умерли", "Upsss", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    }
}
