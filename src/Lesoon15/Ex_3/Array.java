package Lesoon15.Ex_3;

import java.util.ArrayList;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> arry =new ArrayList<>();
        ArrayList<Integer>arry1=new ArrayList<>();
        arry.add(90);
        arry.add(80);
        arry.add(70);
        arry.add(60);
        arry.add(50);
        arry.add(40);
        arry.add(30);
        System.out.println((char)27+"[96m"+"ПОЧАТКИЙ МАСИВ \n"+(char)27+"[0m"+arry);
        System.out.println((char)27+"[96m"+"ПЕРЕМНОЖЕНИЙ МАСИВ "+(char)27+"[0m");

        for (Integer i:arry) {
            System.out.print(" "+i*12);
arry1.add(i*12);
        }
        System.out.println((char)27+"[96m"+"\nНОВИЙ МАСИВ\n "+(char)27+"[0m"+arry1);

        Collections.sort(arry);
        System.out.println((char)27+"[96m"+"ВІДСОРТАВАНИЙ МАСИВ\n"+(char)27+"[0m"+arry);

    }}
