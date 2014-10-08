

import java.applet.Applet;
import java.awt.*;

public class BouncingBall extends Applet implements Runnable
{
    int x,y;
    boolean flag;
    
    public void init()
    {
        x = 0;
        y = size().height/2;
    }
    
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(x,y,15,15);
    }
    
    public void run()
    {
        int ymax = y;
        int phase = 0;
        while(true)
        {
            if(x>= size().width)
            {
                x = 0;
            }
            else
            {
                x++;
            }
            if(y >= (size().height -15))
                flag = false;
            if(y <= (size().height/2))
                flag = true;
            
            if(flag)
            {
                y++;
            }
            else
            {
                y--;
            }
            repaint();
            try
            {
                Thread.sleep(50);
            }
            catch(Exception e)
            {}
        }
    }
}