public class Dec2Binary
{
    public static void main(String args[])
    {
        int n,q = 0,r = 0;
        int bin[] ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        if(args.length !=1)
        {
            System.out.println("Invalid Argument List");
            System.out.println("USAGE : java Dec2Binary 65");
            System.exit(0);
        }
        n = Integer.parseInt(args[0]);
        for(int i = 14; n>0; i--)
        {
            q = n/2;
            r = n%2;
            bin[i] = r;
            n = q;
        }
        for(int i = 0; i<15;i++)
        {
            System.out.print(bin[i]);
        }
        System.out.println(" ");
    }
}