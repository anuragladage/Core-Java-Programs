package assignments.threads;

import java.applet.Applet;
import java.awt.*;

public class ThreadDemo1 extends Applet implements Runnable
{
    TextField t1,t2;
    Thread th1,th2;
    int i,j;
    
    public void init()
    {
        System.out.println(".......");
        add(t1 = new TextField(15));
        add(t2 = new TextField(15));
        th1 = new Thread(this);
        th2 = new Thread(this);
        th1.start();
        th2.start();
    }
    
    public void run()
    {
        while(true)
        {
            if((Thread.currentThread()).equals(th1))
            {
                t1.setText(String.valueOf(i));
                if(i==5000)
                {
                    i = 0;
                }
                else
                {
                    i++;
                }
            }
            if((Thread.currentThread()).equals(th2))
            {
                t2.setText(String.valueOf(j));
                if(j==5000)
                {
                    j = 0;
                }
                else
                {
                    j++;
                }
            }
        }
    }
}




// <applet code ="assignments.threads.ThreadDemo1.class" width=500 height =500>
//</applet>