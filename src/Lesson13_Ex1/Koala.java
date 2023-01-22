package Lesson13_Ex1;

public class Koala extends Animal{
public void WhatAnimal(){
    System.out.println((char)27+"[40m"+"KOALA"+(char)27+"[0m");
}
    @Override
    void Legs() {
        System.out.println("Legs - "+2);
    }

    @Override
    void Furry() {
        System.out.println("Furry - "+"Yes");
    }

    @Override
    void Species() {
        System.out.println("Species - "+ " Koala grey");
    }

    @Override
    void Growth() {
        System.out.println("Growth - "+" 80 sm");
    }

    @Override
    void Color() {
        System.out.println("Color - "+" Grey");
    }

    @Override
    void Wild() {
        System.out.println("Wild - "+"yes");
    }
}
