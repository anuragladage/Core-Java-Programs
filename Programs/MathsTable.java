public class MathsTable
{
    public static void main(String args[])
    {
        int n;
        int multipliedby[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        if(args.length !=1)
        {
            System.out.println("Invalid Argument List");
            System.out.println("USAGE : java MathsTable 5");
            System.exit(0);
        }
        try
        {
            n = Integer.parseInt(args[0]);
            for(int i = 0;i<12;i++)
            {
                System.out.println(n + " * " + multipliedby[i]+ " = " + (n*multipliedby[i]));
            }
        }
        catch(NumberFormatException e)
        {
            String s1;
            s1 = e.getMessage().substring(18);
            System.out.println(s1 + " is not a valid input. Integer value excepted");
        }
    }
    
}