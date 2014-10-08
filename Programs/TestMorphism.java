class Elephant implements Tusk
{
    public void walk()
    {
        System.out.println("Elephant is walking");
    }
    public void eat()
    {
        System.out.println("Elephant is eating");
    }
    
    public void toFight()
    {
        System.out.println("Elephant is fighting");
    }
}

class Mamoth implements Tusk
{
    public void walk()
    {
        System.out.println("Mamoth is walking");
    }
    public void eat()
    {
        System.out.println("Mamoth is eating");
    }
    
    public void toFight()
    {
        System.out.println("Mamoth is fighting");
    }
}

public class TestMorphism
{
    public static void main(String args[])
    {
        Tusk t;
        Elephant e;
        Mamoth m;
        e = new Elephant();
        t=e;
        e.walk();
        e.eat();
        t.toFight();
        
        m = new Mamoth();
        t=m;
        m.walk();
        m.eat();
        t.toFight();//Runtime Polymorphism.
//        t.walk();
    }
}