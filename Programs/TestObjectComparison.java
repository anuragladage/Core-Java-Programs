import mylib.geoshapes.Circle;

public class TestObjectComparison
{
    public static void main(String args[])
    {
        
        Circle c1,c2;
        c1= new Circle(24);
        c2 = new Circle(24);
        
        if(c1.equals(c2))
        {
            System.out.println("Same");
        }
        else
        {
            System.out.println("Not Same");
        }
        
        if(c1.hashCode() == c2.hashCode())
        {
            System.out.println("HashCode is Same and Equals " + c1.hashCode());
        }
        else
        {
            System.out.println("HashCode is not Same");
        }
        
        System.out.println(c1);
        System.out.println(c2);
    }
}