public class WordCount
{
    public static void main(String args[])
    {
        int count=0, i = 0;
        if(args.length != 1)
        {
            System.out.println("Invalid Argument List ");
            System.out.println("USAGE : java Palendrome \"Nitin is a good boy\"");
            System.exit(0);
        }
        
        while(i<args[0].length())
        {
            if(args[0].charAt(i) == ' ')
            {
                count += 1;
            }
            i++;
        }
        System.out.println("count = " + (count + 1));
    }
}