package org.example;

public class Robot {

    //Instance variables (HAS A)
    public static String name;
    public Weapon weapon;


    //Constructor
    public Robot(Weapon weapon) {
        name = "Robonaut";
        this.weapon = weapon;
    }

    //Methods (CAN DO)
    public void Attack(Dinosaur dinosaur_one){
        System.out.println(name + " attacks " + (Dinosaur.name) + " with their " + this.weapon.name + " for " + this.weapon.power + " damage!");
    }

}


