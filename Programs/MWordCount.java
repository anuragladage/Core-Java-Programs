public class MWordCount
{
    public static void main(String args[])
    {
        int count=0, i = 1;
        if(args.length != 1)
        {
            System.out.println("Invalid Argument List ");
            System.out.println("USAGE : java Palendrome \"Nitin    is   a   good   boy\"");
            System.exit(0);
        }
        
        while(i<args[0].length())
        {
            if(args[0].charAt(i) == ' ' && args[0].charAt(i-1)!=' ')
            {
                count += 1;
            }
            i++;
        }
        System.out.println("count = " + (count + 1));
    }
}