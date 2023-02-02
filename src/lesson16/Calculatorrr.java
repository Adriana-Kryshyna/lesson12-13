package lesson16;

public class Calculatorrr<T> {

    public T Operations(T first, T second){

        if (first.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) first + (Integer) second);
        }

        if (first.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) first + (Double) second);
        }

        return (T) (Object) 0;
    }


    }




class Main{
    public static void main(String[] args) {
        Calculatorrr <Integer>calculatorrr= new Calculatorrr();
        int sum = calculatorrr.Operations(3,4);
        System.out.println(sum);
        Calculatorrr<Double> calculatorrr1= new Calculatorrr<>();
        double sum1= calculatorrr1.Operations(4.6,7.9);
        System.out.println(sum1);
    }
}


