public class swap
{
    public static void main(String[] args)
    {
        int n1,n2;
        if( args.length != 2)
        {
            System.out.println("Invalid Argument list");
            System.out.println("USAGE : java swap 10 5");
            System.exit(0);
        }
        n1 = Integer.parseInt(args[0]);
        n2 = Integer.parseInt(args[1]);
        System.out.println("Before swap n1 = " + n1 + " and n2 = " + n2);
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("After swap n1 =  " + n1 + " and n2 = " + n2);
    }
}