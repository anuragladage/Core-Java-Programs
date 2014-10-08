public class ComputeArea
{
    public static void main(String[] args)
    {
        int radius;
        float area;
        if(args.length != 1)
        {
            System.out.println("Insufficient Arguments!!");
            System.out.println("USAGE : Java ComputeArea 10");
            System.exit(0);
        }
        radius=Integer.parseInt(args[0]);
        area = (float)(Math.PI * radius *radius);
        System.out.println("The area of circle with Radius " + radius + " is " + area);
    }
}