//import java.util.Date;
import mylib.geoshapes.Circle;
import mylib.geoshapes.NegativeRadiusNotAcceptedException;
import mylib.utils.Conversions;
import mylib.utils.DateUtilities;


public class TestPackages
{
    public static void main(String args[])
    {
		String res;
        java.util.Date dt;                                      //Qualification.
        Circle c1,c2;
        c1 = new Circle();
        c2 = new Circle(10);
        System.out.println("Circle #1 - Radius : " + c1.getRadius());
        System.out.println("Area #1 - Area : " + c1.getArea());
        System.out.println("Circle #2 - Radius : " + c2.getRadius());
        System.out.println("Area #2 - Area : " + c2.getArea());
        try
        {
        c1.setRadius(Integer.parseInt(args[0]));
        System.out.println("Circle #1 - Radius : " + c1.getRadius());
        System.out.println("Area #1 - Area : " + c1.getArea());
        }
        catch(NegativeRadiusNotAcceptedException e)
        {
            System.out.println("Exception : " + e.getMessage() + " is a negative radius");
        }
        
        
//        res = Conversions.dec2Bin(args[0]);
//		System.out.println(res);
//        
//		res = Conversions.dec2Hex(args[1]);
//		System.out.println(res);
//
//		if(DateUtilities.verifyDate(args[2]))
//		{
//			System.out.println("Valid Date");
//		}
//		else
//		{
//			System.out.println("Invalid Date");
//		}
//		
//		
//		
//		System.out.println("Testing Packages");
//        dt = new java.util.Date();
//        System.out.println("Current Date : " + dt);
    }
}