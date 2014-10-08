class A
{
    public A()
    {
        System.out.println("A is inside default constructor");
    }
    public A(int x)
    {
        System.out.println("A is inside parameterized constructor");
    }
    
    public void m1()
    {
        System.out.println("A is inside method 1");
    }
    public  void m2()
    {
        System.out.println("A is inside method 2");
    }
}

class B extends A
{
    public B()
    {
        System.out.println("B is inside default constructor");
    }
    public B(int x)
    {
        super(x);
        System.out.println("B is inside parameterized constructor");
    }
    
    public void m1()                                                    //Overriding of function from sub to super class.
    {
        System.out.println("This method was overriden");
    }
    public void m3()
    {
        
        System.out.println("B is inside method 1");
    }
    public void m4()
    {
        System.out.println("B is inside method 2");
    }
}

public class Inheritance
{
    public static void main (String args[])
    {
        A a1,a2;
        B b1,b2;
        
        a1=new A();
        a1.m1();
        a1.m2();
//        a1.m3();
        System.out.println("---------------------------------------------------");
        
        a2 = new A();
        a2.m1();                                            //Here due to function overriding m1 of class B(sub class) can be accessed by object of class A(Super Class)
        a2.m2();
        System.out.println("---------------------------------------------------");
        
        b1 = new B();
        b1.m1();
        b1.m2();
        b1.m3();
        b1.m4();
        System.out.println("---------------------------------------------------");
        
        b2 = new B(100);
        b2.m1();
        b2.m2();
        b2.m3();
        b2.m4();
        System.out.println("---------------------------------------------------");
    }


}