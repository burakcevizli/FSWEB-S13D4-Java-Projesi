package com.workintech.HomeworkSecond;

public class MainHomeWorkSecond {
    public static void main(String[] args) {

        Player player = new Player("Burak",100,Weapon.SILAH);

        System.out.println(player.healthRemaining());
        player.loseHealth(35);
        System.out.println(player.healthRemaining());
        player.loseHealth(90);
        System.out.println(player.restoreHealth(30));
        System.out.println(player.restoreHealth(80));

    }
}
