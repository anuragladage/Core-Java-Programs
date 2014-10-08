import java.awt.*;
import javax.swing.*;

public class PieChartDemo extends JFrame
{
    String str[];
    int num1[], num2[], num3[];
    int tot=0,sum = 0,y,ty;
    Color clr[] = {Color.blue,Color.green,Color.red,Color.black};
    
    public PieChartDemo(String str[])
    {
        super("Pie Chart Demo");
        setSize(1280,800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.str =str;
        num1 = new int[4];
        for(int i = 0;i<num1.length;i++)
        {
            num1[i]=Integer.parseInt(str[i]);
//            System.out.print(" " + num1[i]);
            tot = tot + num1[i];
        }
//        System.out.println("" + tot1);
        num2 = new int[4];
        num3 = new int[4];
        for(int i=0; i<num2.length;i++)
        {
            num2[i] = (num1[i]*100)/tot;
//            System.out.print(" " + num2[i]);
            num3[i] = (num2[i]*360)/100;
            sum = sum + num3[i];
//            System.out.println(" " + num3[i]);
        }
        num3[0] = num3[0] + (360-sum);
        
        setVisible(true);
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        int sa = 0;
        g.setColor(Color.black);
        g.drawOval(50,50,500,500);
        for(int i = 0;i<num3.length;i++)
        {
            g.setColor(clr[i]);
            g.fillArc(50,50,500,500,sa,num3[i]);
            sa = sa + num3[i];
        }
        //legends program to be typed.
        g.setColor(Color.black);
        g.drawString("Legends",50,500);
        g.drawLine(50,502,100,502);
        y = 510;
        ty=520;
        for( int i = 0;i<4;i++)
        {
            g.setColor(clr[i]);
            g.fillRect(50,y,20,20);
            g.drawString(str[i],75,ty);
            y=y+20+5;
            ty = ty + 10 + 10 + 5;
        }
        
    }

    public static void main(String args[])
    {
        if(args.length !=4)
        {
            System.out.println("Invalid Parameter List");
            System.out.println("USAGE : java PieChartDemo 80 20 60 90");
            System.exit(0);
        }
        PieChartDemo pcd = new PieChartDemo(args);
    }
}