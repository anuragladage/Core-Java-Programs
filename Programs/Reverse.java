public class Reverse
{
    public static void main(String[] args)
    {
        if(args.length != 1)
        {
            System.out.println("Invalid Argument List");
            System.out.println("USAGE : java Reverse Mikado");
            System.exit(0);
        }
        for(int i = args[0].length() - 1; i>=0;--i)
        {
            System.out.print(args[0].charAt(i));
        }
        System.out.println(" ");
    }
}