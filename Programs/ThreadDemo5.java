package assignments.threads;

import java.applet.Applet;
import java.awt.*;

public class ThreadDemo5 extends Applet
{
    TextField t1,t2;
    Thread th1,th2;
    int i,j;
    
    public void init()
    {
        System.out.println(".......");
        add(t1 = new TextField(15));
        add(t2 = new TextField(15));
        th1 = new Thread(new Runnable()
                         {
            public void run()
            {
                while(true)
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
            }
        });
        
        
        th2 = new Thread(new Runnable()
                         {
            public void run()
            {
                while(true)
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
        });
        th1.start();
        th2.start();
    }
}




// <applet code ="assignments.threads.ThreadDemo5.class" width=500 height =500>
//</applet>