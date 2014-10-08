package assignments.threads;

import java.applet.Applet;
import java.awt.*;

public class ThreadDemo2 extends Applet implements Runnable
{
    TextField t1,t2;
    Thread th1;
    int i,j;
    A a;
    
    public void init()
    {
        add(t1 = new TextField(15));
        add(t2 = new TextField(15));
        th1 = new Thread(this);
        a = new A();
        th1.start();
        a.start();
    }
    
    public void run()
    {
        while(true)
        {
            t1.setText(String.valueOf(i));
            if(i==5000)
                i = 0;
            else
                i++;
        }
    }
    
    class A extends Thread
    {
        public void run()
        {
            while(true)
            {
                t2.setText(String.valueOf(j));
                if(j==5000)
                    j=0;
                else
                    j++;
            }
        }
    }
}





// <applet code ="assignments.threads.ThreadDemo2.class" width=500 height =500>
//</applet>