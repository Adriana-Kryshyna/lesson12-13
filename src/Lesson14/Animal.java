package Lesson14;

public enum Animal {
    KOALA(13);
int age;
    Animal(int age)
    {
        this.age= age;

    }

    public String toString()
    {
        return super.toString()+" "+"Age : "+getAge();
    }

    public int getAge()
    {
       return age;
    }
}
