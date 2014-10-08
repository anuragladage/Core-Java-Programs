public class SplitString
{
    public static void main(String args[])
    {
        String s1[];
        int spaceindex =0,stringstart = 0,i=0,wordcount = 0;
        if(args.length !=1)
        {
            System.out.println("Invalid Arugment List");
            System.out.println("USAGE : java SplitString \"Tom is a good boy\"");
            System.exit(0);
        }
        while(i<args[0].length())
        {
            if(args[0].charAt(i) == ' ')
            {
                wordcount += 1;
            }
            i++;
        }
        s1 = new String[wordcount+1];
        i = 0;
        while(spaceindex != -1)
        {
            
            spaceindex = args[0].indexOf(" ",spaceindex + 1);
            if(spaceindex != -1)
            {
                s1[i] = args[0].substring(stringstart,spaceindex);
            }
            if(spaceindex<0)
            {
                s1[i] = args[0].substring(stringstart);
            }
            i++;
            stringstart = spaceindex+1;
        }
        for(i=0;i<=wordcount;i++)
        {
            System.out.println(s1[i]);
        }
    }
}