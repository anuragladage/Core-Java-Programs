public class Vowels
{
    public static void main(String[] args)
    {
        int acount = 0,ecount = 0,icount = 0,ocount = 0,ucount = 0;
        if(args.length !=1)
        {
            System.out.println("Invalid Argument Passed!!");
            System.out.println("USAGE : java Vowel \"India is our great country\" ");
            System.exit(0);
        }
        for(int i = 0;i<args[0].length();++i)
        {
            switch(args[0].charAt(i))
            {
                case 'A':
                    acount = acount + 1;
                    break;
                case 'a':
                    acount = acount + 1;
                    break;
                case 'E':
                    ecount = ecount + 1;
                    break;
                case 'e':
                    ecount = ecount + 1;
                    break;
                case 'I':
                    icount = icount + 1;
                    break;
                case 'i':
                    icount = icount + 1;
                    break;
                case 'O':
                    ocount = ocount + 1;
                    break;
                case 'o':
                    ocount = ocount + 1;
                    break;
                case 'U':
                    ucount = ucount + 1;
                    break;
                case 'u':
                    ucount = ucount + 1;
                    break;
            }
            
        }
        System.out.println("A = " + acount);
        System.out.println("E = " + ecount);
        System.out.println("I = " + icount);
        System.out.println("O = " + ocount);
        System.out.println("U = " + ucount);
    }
}