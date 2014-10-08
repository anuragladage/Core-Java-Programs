public class Num2Words
{
    public static void main(String args[])
    {
        int n;
        if(args.length !=1)
        {
            System.out.println("Invalid Argument List");
            System.out.println("USAGE : java Num2Words 25");
            System.exit(0);
        }
        if(Integer.parseInt(args[0])<0 || Integer.parseInt(args[0])>99)
        {
            System.out.println("Input a number between 0-99");
            System.exit(0);
        }
        String words1[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        String words2[] = {"Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
        
        
        n = Integer.parseInt(args[0]);
        if(n>=0 && n<=19)
        {
            System.out.println(words1[n]);
        }
        else if(n%10 == 0)
        {
            int m = n/10 - 2;
            System.out.println(words2[m]);
        }
        else
        {
            int tens,units;
            tens = n/10 - 2;
            units = n%10;
            System.out.println(words2[tens] + words1[units]);
        }
    }
}