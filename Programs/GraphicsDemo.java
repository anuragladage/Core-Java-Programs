import java.awt.*;
import javax.swing.*;


public class GraphicsDemo extends JFrame
{
    public GraphicsDemo()
    {
        super("Graphics Demo");
        setSize(1280,800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setVisible(true);
        //Donot add anything after this.
        
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        g.setColor(Color.blue);
        g.drawLine(100,700,100,100);
        g.setColor(Color.red);
        g.drawString("First Graphic Program",400,80);
        g.drawRect(1000,110,50,100);
        g.setColor(Color.orange);
        g.fillRect(1000,110,50,100);
        g.drawArc(400,400,200,200,0,90);
        g.setColor(Color.magenta);
        g.fillArc(400,400,200,200,0,90);
        g.setColor(Color.GREEN);
        g.fillOval(650,650,200,100);
        
    }
    
    public static void main(String args[])
    {
        GraphicsDemo gd = new GraphicsDemo();
    }
}