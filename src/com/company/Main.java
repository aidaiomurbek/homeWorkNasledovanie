package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon("gun","jason");

    Boss boss = new Boss(500,50,weapon);
        System.out.println(boss.toString());


    }
}
