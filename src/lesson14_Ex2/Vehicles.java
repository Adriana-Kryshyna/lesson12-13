package lesson14_Ex2;

public enum Vehicles {
   CAR(200000) ;
int price;
    Vehicles(int price)
    {
       this.price= price;
    }


    public String getColor()
    {
        return"RED" ;
    }

public String toString()
{

    return super.toString()+" "+" "+price+" "+getColor();
}


}



