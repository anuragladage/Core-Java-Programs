abstract class TwoWheeler
{
    int nw;
    TwoWheeler()
    {
        System.out.print("Two Wheeler created");
    }
    public void park()
    {
        System.out.println("Car is parked");
    }
    public void turn()
    {
        System.out.println("Car is turning");
    }
    public abstract void start();
    public abstract void stop();
}

abstract class Yamaha extends TwoWheeler
{
    Yamaha()
    {
        System.out.print(" : Yamaha ");
    }
    public void fillPetrol(int p)
    {
        System.out.println(p + " litres of petrol was filled.");
    }
    
    public void start()
    {
        System.out.println("Yamaha is starting");
    }
    
}

class RX100 extends Yamaha
{
    RX100()
    {
        System.out.println("RX100");
    }
    public void stop()
    {
        System.out.println("Yamaha RX100 has stopped");
    }
    
}

class Pulsar extends TwoWheeler
{
    Pulsar()
    {
        System.out.println(" : Pulsar");
    }
    public void fillPetrol(int p)
    {
        System.out.println(p + " litres of petrol was filled.");
    }
    
    public void start()
    {
        System.out.println("Pulsar is starting");
    }
    
    public void stop()
    {
        System.out.println("Pulsar has stopped");
    }
}

public class TestAbstract
{
    public static void main(String args[])
    {
        TwoWheeler tw;
        Pulsar p;
        RX100 rx;
        Yamaha y;
        
//      tw = new TwoWheeler();              //Not allowed as instantiation of abstract class objects is not allowed.
        p = new Pulsar();
        tw = p;
        tw.start();
        tw.stop();
        p.fillPetrol(20);
        System.out.println(" ");
        rx = new RX100();
        tw = rx;
        tw.start();
        y = rx;
        y.stop();
        rx.fillPetrol(5);
        
    }
}