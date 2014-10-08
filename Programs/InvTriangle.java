public class InvTriangle
{
    public static void main(String args[])
    {
        int height,i,j,asterisk,n,k;
        if(args.length != 1)
        {
            System.out.println("Invalid Argument List ");
            System.out.println("USAGE : java Triangle 5");
            System.exit(0);
        }
        height = Integer.parseInt(args[0]);
        k=height;
        for(i=height;i>0;i--)
        {
            asterisk = 0;
            for(j=0;j<=height-k;++j)
            {
                System.out.print(" ");
            }
            k--;
            while(asterisk< 2*i - 1)
            {
                System.out.print("*");
                asterisk++;
            }
            System.out.print("\n");
        }
    }
}