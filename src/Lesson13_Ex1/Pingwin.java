package Lesson13_Ex1;

public class Pingwin extends Animal {
public void WhatAnimal(){
    System.out.println((char)27+"[46m"+" Pingwin"+(char)27+"[0m");
}
    @Override
    void Legs() {
        System.out.println("Legs - "+ " 2");
    }

    @Override
    void Furry() {
        System.out.println("Furry - "+" No");
    }

    @Override
    void Species() {
        System.out.println("Species - "+" Bird");

    }

    @Override
    void Growth() {
        System.out.println("Growth - "+" 80sm");

    }

    @Override
    void Color() {
        System.out.println("Color - "+" Black with white");

    }

    @Override
    void Wild() {
        System.out.println(" Wild - "+" Yes");

    }
}
