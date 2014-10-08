public class Armstrong
{
    public static void main(String[] args)
    {
        int sum;
        if(args.length != 0)
        {
            System.out.println("No argument Required!!");
            System.out.println("USAGE : java Armstrong");
            System.exit(0);
        }
        for(int i = 100;i<1000;++i)
        {
            sum = (int)(Math.pow((i/100),3) + Math.pow(((i%100)/10),3) + Math.pow(((i%100)%10),3));
            if(sum == i)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
}