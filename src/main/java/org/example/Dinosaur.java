package org.example;

public class Dinosaur {
    //(HAS A) or Instance Variables
    public static String name;
    public Weapon weapon;

    //Constructor
    public Dinosaur(Weapon weapon) {
        name = "Stegosaurus";
        this.weapon = weapon;
    }

    //Methods or (CAN DO)
    public void Attack(Robot robot_one){
        System.out.println(name + " attacks " + (Robot.name) + " with their " + this.weapon.name + " for " + this.weapon.power + " damage!");


    }
}
