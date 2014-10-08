public class Stats
{
    public static void main(String args[])
    {
        int n[],i,min,max,sum=0,avg=0;
        n = new int[100];
        for(i = 0;i<args.length;i++)
        {
            n[i] = Integer.parseInt(args[i]);
        }
        min=n[0];                                           //Minimum number
        for(i=0;i<args.length;i++)
        {
            if(min>n[i])
            {
                min = n[i];
            }

        }
        
        max=n[0];                                           //Maximum Number
        for(i=0;i<args.length;i++)
        {
            if(max<n[i])
            {
                max=n[i];
            }
        }
        
        for(i=0;i<args.length;i++)
        {
            sum = sum + n[i];
        }
        
        System.out.println("Sum of the Numbers = " + sum);
        System.out.println("Maximum Number = " + max);
        System.out.println("Minimum Number = " + min);
        System.out.println("Average of the Numbers = " + sum/args.length);
        
    }
}