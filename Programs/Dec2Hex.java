public class Dec2Hex
{
    public static void main(String args[])
    {
        int n,q,r;
        String hex[],hexdigits[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

        if(args.length != 1)
        {
            System.out.println("Invalid Argument List");
            System.out.println("USAGE : java Dec2Hex 65");
            System.exit(0);
        }
        
        hex = new String[15];
        for(int i = 0;i<15;i++)
        {
            hex[i] = "";
        }
        n = Integer.parseInt(args[0]);
        for(int i=14; n>0;i--)
        {
            q = n/16;
            r = n%16;
            hex[i] = hexdigits[r];
            n=q;
        }
        for(int i = 0; i<15; i++)
        {
            System.out.print(hex[i]);
        }
        System.out.println(" ");
    }
}