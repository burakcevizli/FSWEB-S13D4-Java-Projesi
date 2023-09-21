package com.workintech.HomeworkSecond;

public class Player {
    private String name;
    private int healthPercantage;
    private Weapon weapon;

    public Player(String name, int healtPercantage , Weapon weapon){
        if(healtPercantage > 100) healtPercantage = 100;
        if(healtPercantage <0) healtPercantage = 0;
        this.name = name;
        this.healthPercantage = healtPercantage;
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return this.healthPercantage;
    }
    public void loseHealth(int damage){
        int result = healthPercantage - damage;
        if(result <= 0) {
            System.out.println(name + " has been knocked out of game");
           this.healthPercantage = 0;
        }else{
            this.healthPercantage = result;
        }
    }

    public int restoreHealth(int healthPotion){
        int result = healthPercantage + healthPotion;
        if(result > 100) {
            healthPercantage= 100;

        }else this.healthPercantage = result;
        return healthPercantage;
    }
}
