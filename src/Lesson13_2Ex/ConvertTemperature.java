package Lesson13_2Ex;

import java.util.Scanner;

public class ConvertTemperature implements Convert{
    Scanner scanner= new Scanner(System.in);
    @Override
    public void Farangdey() {
        //(°C)*1,8 + 32

        System.out.println((char)27+"[95m"+"Конвертації з градусів за Цельсієм в фарангеї "+(char)27+"[0m"
                +"\n Яку цифру вам потрібно конвертувати?");

        int C = scanner.nextInt();

        double Convert= C*1.8+32;
        System.out.println("RESULT :"+Convert);
    }

    @Override
    public void Kalvin() {
        //[K] = [°C] + 273.15
        System.out.println((char)27+"[95m"+"Конвертації з градусів за Цельсієм в Кельвіни"+(char)27+"[0m"+
                "\n Яку цифру вам потрібно конвертувати?");
        int c= scanner.nextInt();
        double convert = c+273.15;
        System.out.println("RESULT :"+convert);


    }
}
