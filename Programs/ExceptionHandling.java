public class ExceptionHandling
{
    public static void main(String args[])
    {
        int n,x,y,z,num[] = {5,2,0,100,20,30,40,10,800,11};
        try
        {
            n = Integer.parseInt(args[0]);
            x = Integer.parseInt(args[1]);
            y = num[n];
            z=x/y;
            System.out.println("z = " + z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Division by zero no allowed");
        }
        catch(NumberFormatException e)
        {
            String s1;
            s1 = e.getMessage().substring(18);
            System.out.println(s1 + " is not a valid input ");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Value of n should be in the range 0 to 9");
        }
    }
}