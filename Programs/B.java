public class B extends A
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
    public void m3()
    {
        System.out.println("B is inside method 1");
    }
    public void m4()
    {
        System.out.println("B is inside method 2");
    }
}