public class Palendrome
{
    public static void main(String args[])
    {
        int i,j;
        if(args.length != 1)
        {
            System.out.println("Invalid Argument List ");
            System.out.println("USAGE : java Palendrome nitin");
            System.exit(0);
        }
        for(i = 0,j=(args[0].length() - 1); i<args[0].length()/2;i++,j--)
        {
            if(args[0].charAt(i) !=args[0].charAt(j))
            {
                break;
            }
        }
        if(i==j)
        {
            System.out.println(args[0] + " is a Palendrome.");
        }
        else
        {
            System.out.println(args[0] + " is not a Palendrome");
        }
    }
}