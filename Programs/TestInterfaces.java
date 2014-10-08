class AImp implements Int1
{
    int x,y;
    AImp()
    {
        x = min;
        y = max;
    }
    public void m3()
    {
        System.out.println("M3 method was implemented");
    }
    
    public void m4()
    {
        System.out.println("M4 method was implemented");
    }
}

public class TestInterfaces
{
    public static void main(String args[])
    {
        Int1 i1,i2;
//        i1 = new Int1();      //Interface object cannot be instantiated.
        
        AImp a1,a2;
        a1 = new AImp();
        a1.m3();
        i1=a1;              //	Object of an interface can be assigned instance of all the classes that implement it and
                            //  provides its body.
        i1.m4();
    }
}
