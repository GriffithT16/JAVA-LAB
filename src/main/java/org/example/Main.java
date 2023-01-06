package org.example;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class Main {
    public static void main(String[] args) {

        Lightsaber lightsaber = new Lightsaber();
        Sword sword = new Sword();
        Bow bow = new Bow();

        Robot robot_one = new Robot(lightsaber);
        Robot robot_two = new Robot(sword);
        Robot robot_three = new Robot(bow);
        Dinosaur dinosaur_one = new Dinosaur(bow);
        robot_one.Attack(dinosaur_one);

        dinosaur_one.Attack(robot_one);

    }
}