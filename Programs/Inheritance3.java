class Car
{
    public void wash()
    {
        System.out.println("Basic Car Models are being washed");
    }
}

class Santro extends Car
{
//    public void wash()
//    {
//        System.out.println("Santro is being washed");
//    }
}

class HCity extends Car
{
//    public void wash()
//    {
//        System.out.println("Honda City is being washed");
//    }
}

class MBenz extends Car
{
    public void wash()
    {
        super.wash();                                           //Can be used to call the function of the super class to avoid default overriding.
        System.out.println("Mercedes Benz is being washed");
    }
}

class Garage
{
    public void washing(Car c)
    {
        c.wash();
    }
}


public class Inheritance3
{
    public static void main(String args[])
    {
        Garage g;
        Santro s;
        HCity h;
        MBenz m;
        
        g = new Garage();
        s = new Santro();
        
        g.washing(s);
        h=new HCity();
        g.washing(h);
        
        
        m = new MBenz();
        g.washing(m);
        
    }
}

