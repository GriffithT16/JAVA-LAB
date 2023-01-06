package org.example;

public class Robot {

    //Instance variables (HAS A)
    public String name;
    public Weapon weapon;

    //Constructor
    public Robot(Weapon weapon) {
        this.name = "Robonaut";
        this.weapon = weapon;
    }

    //Methods (CAN DO)
    public void Attack(Dinosaur dinosaur_one){
        System.out.println(this.name + " attacks with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }

}


