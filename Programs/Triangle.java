public class Triangle
{
    public static void main(String args[])
    {
        int height,i,j,asterisk,k=0;
        if(args.length != 1)
        {
            System.out.println("Invalid Argument List ");
            System.out.println("USAGE : java Triangle 5");
            System.exit(0);
        }
        height = Integer.parseInt(args[0]);
        for(i = 0;i<height;i++)
        {
            asterisk = 0;
            k++;
            for(j=height - k;j>=0;--j)
            {
                System.out.print(" ");
            }
            while(asterisk<(2*i + 1))
            {
                System.out.print("*");
                asterisk++;
            }
            System.out.print("\n");
            
        }
    }
}