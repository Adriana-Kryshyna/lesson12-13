package Lesson13_Ex1;

public class Lemur extends Animal{

    public  void WhatAnimal(){
        System.out.println((char)27+"[45m "+"LEMUR"+(char)27+"[0m" );
    }
    @Override
    void Legs() {
        System.out.println("Legs - "+ "2");
    }

    @Override
    void Furry() {
        System.out.println("Furry - "+"yes");
    }

    @Override
    void Species() {
        System.out.println("Species - "+" Katta");
    }

    @Override
    void Growth() {
        System.out.println("Growth - "+" 50 sm");
    }

    @Override
    void Color() {
        System.out.println("Color - "+" Grey with white ");
    }

    @Override
    void Wild() {
        System.out.println("Wild - "+" yes ");
    }
}
