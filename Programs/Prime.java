public class Prime
{
    public static void main(String[] args)
    {
        int primelimit,i,j;
        if(args.length != 1)
        {
            System.out.println("Invalid Argument List");
            System.out.println("USAGE : java Prime 50");
            System.exit(0);
        }
        primelimit = Integer.parseInt(args[0]);
//        System.out.println(primelimit);
        for(i=2; i<=primelimit; ++i)
        {
            for(j=2;j<i;++j)
            {
                if(i%j==0)
                {
                    break;
                }
            }
            if(i==j)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
}