import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JRoundButton extends JComponent implements MouseListener
{
    ActionListener al;
    ActionEvent ae;
    String text;
    int rad,cx,cy;
    boolean down,entered;
    public JRoundButton()
    {
        text="";
        init();
    }
    
    public JRoundButton(String text)
    {
        this.text = text;
        init();
    }
    
    public void init()
    {
        setSize(56,56);
        addMouseListener(this);
        cx = cy = 28;
        rad = 26;
        down=false;
        ae = new ActionEvent(this,0,"");
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        if(!down)
        {
            g.setColor(Color.white);
            g.fillOval(3,3,50,50);
            g.setColor(Color.gray);
            g.fillOval(5,5,50,50);
            g.setColor(getBackground());
            g.fillOval(4,4,50,50);
            g.setColor(Color.black);
            g.drawString(text,26,30);
        }
        else
        {
            g.setColor(Color.gray);
            g.fillOval(3,3,50,50);
            g.setColor(Color.white);
            g.fillOval(5,5,50,50);
            g.setColor(getBackground());
            g.fillOval(4,4,50,50);
            g.setColor(Color.black);
            g.drawString(text,27,30);
        }
        
        if(!entered)
        {
            g.setColor(Color.white);
            g.fillOval(3,3,50,50);
            g.setColor(Color.gray);
            g.fillOval(5,5,50,50);
            g.setColor(getBackground());
            g.fillOval(4,4,50,50);
            g.setColor(Color.black);
            g.drawString(text,26,30);
        }
        else
        {
            g.setColor(Color.white);
            g.fillOval(3,3,50,50);
            g.setColor(Color.gray);
            g.fillOval(5,5,50,50);
            g.setColor(getBackground());
            g.fillOval(4,4,50,50);
            g.setColor(Color.blue);
            g.drawString(text,26,30);
        }
    }
    
    public void mousePressed(MouseEvent e)
    {
        int x,y,dx,dy,dist;
        x = e.getX();
        y = e.getY();
        dx = cx-x;
        dy=cy-y;
        dist = (int) (Math.sqrt(dx*dx + dy*dy));
        if(dist<=rad)
        {
        down = true;
        repaint();
        }
    }
    
    public void mouseReleased(MouseEvent e)
    {
        down = false;
        repaint();
        if(al!=null)
        {
            al.actionPerformed(ae);
        }
    }
    
    public void mouseClicked(MouseEvent e)
    {
        
    }
    
    public void mouseEntered(MouseEvent e)
    {
        int x,y,dx,dy,dist;
        x = e.getX();
        y = e.getY();
        dx = cx-x;
        dy=cy-y;
        dist = (int) (Math.sqrt(dx*dx + dy*dy));
        if(dist<=rad)
        {
            entered = true;
            repaint();
        }
    }
    
    public void mouseExited(MouseEvent e)
    {
        int x,y,dx,dy,dist;
        x = e.getX();
        y = e.getY();
        dx = cx-x;
        dy=cy-y;
        dist = (int) (Math.sqrt(dx*dx + dy*dy));
        if(dist>=rad)
        {
            entered = false;
            repaint();
        }
    }
    
    public void addActionListener(ActionListener al)
    {
        this.al = al;
    }
}