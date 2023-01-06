package org.example;

public class Dinosaur {
    public static String name;
    public Weapon weapon;

    public Dinosaur(Weapon weapon) {
        this.name = "Stegosaurus";
        this.weapon = weapon;
    }
    public void Attack(Robot robot_one){
        System.out.println(this.name + " attacks " + (Robot.name) + " with their " + this.weapon.name + " for " + this.weapon.power + " damage!");


    }
}
