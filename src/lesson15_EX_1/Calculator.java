package lesson15_EX_1;

import java.util.Scanner;

public class Calculator implements NumberCalculator{

   int first; int  second;int k;
    Scanner scanner= new Scanner(System.in);


    @Override
    public void number() {






   operation();
        k= scanner.nextInt();

        switch (k) {

            case 1:
                System.out.println(" MULTIPLY");
                num();
                System.out.println("RESULT "+first * second);



            case 2:
                System.out.println("DIV");
                num();
                 try {
                boolean b= second==0;

                 } catch (Exception e) {
                    System.out.println(e.getMessage());

                 }finally {
                     System.out.println("RESULT " + first / second);
                 }

              //  if (second == 0) {
               //     throw new ArithmeticException("Wrong");

              //  } else {
               //     System.out.println("");
              //  }
                //System.out.println("RESULT " + first / second);


            case 3:
                        System.out.println("ADD");
                        num();
                        System.out.println("RESULT "+first + second);

             case 4: {
                        System.out.println("SUBTRACT");
                        num();
                        System.out.println(first - second);

                    }


                }}
public void operation(){
        System.out.println("OPERATION??\n 1. First number * second number\n 2.First number / second number\n " +
        "3.First number + second number\n" + "4.First number - second number\n");
   // k= scanner.nextInt();
}
        public void num () {

            System.out.println("Enter numbers ");

            first = scanner.nextInt();
            second = scanner.nextInt();


        }
        public static void main (String[]args){
            Calculator calculator = new Calculator();
            calculator.number();


        }



    }



