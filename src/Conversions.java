package mylib.utils;


public class Conversions   
{
	public static String dec2Bin(String str) 
	{
		String res = "";
		int n,q = 0,r = 0;
        int bin[] ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//        if(args.length !=1)
//        {
//            System.out.println("Invalid Argument List");
//            System.out.println("USAGE : java Dec2Binary 65");
//            System.exit(0);
//        }
        n = Integer.parseInt(str);
        for(int i = 14; n>0; i--)
        {
            q = n/2;
            r = n%2;
            bin[i] = r;
            n = q;
        }
//        for(int i = 0; i<15;i++)
//        {
//            System.out.print(bin[i]);
//        }
//        System.out.println(" ");
		for(int i = 0;i<=14;i++)
		{
			res=res + bin[i];
		}
		return res;
	}

	public static String dec2Hex(String str)
	{
		int n,q,r;
        String res = "",hex[],hexdigits[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

//        if(args.length != 1)
//        {
//            System.out.println("Invalid Argument List");
//            System.out.println("USAGE : java Dec2Hex 65");
//            System.exit(0);
//        }
        
        hex = new String[15];
        for(int i = 0;i<15;i++)
        {
            hex[i] = "";
        }
        n = Integer.parseInt(str);
        for(int i=14; n>0;i--)
        {
            q = n/16;
            r = n%16;
            hex[i] = hexdigits[r];
            n=q;
        }
//        for(int i = 0; i<15; i++)
//        {
//            System.out.print(hex[i]);
//        }
//        System.out.println(" ");
		for(int i = 0;i<=14;i++)
		{
			res=res + hex[i];
		}
		return res;
	}

}
