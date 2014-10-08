package assignments.arrays;
import java.awt.*;
import java.awt.event.*;

public class ArrayDemo2 extends Frame implements ActionListener
{
    Button b[][];
    public ArrayDemo2()
    {
        setLayout(new GridLayout(3,3));
        b = new Button[3][3];
        for(int i = 0; i <b.length; i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                if(Math.random() <0.5)
                {
                    add(b[i][j] = new Button("X"));
                }
                else
                {
                    add(b[i][j] = new Button("O"));
                }
                b[i][j].addActionListener(this);
            }
        }
        setSize(1280,800);
        setResizable(false);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        Object o = e.getSource();
        if(o instanceof Button)
        {
            String s = ((Button)o).getLabel();
            if(s.equals("X"))
            {
                ((Button)o).setLabel("O");
            }
            else
            {
                ((Button)o).setLabel("X");
            }
        }
    }
    
    public static void main(String args[])
    {
        ArrayDemo2 app = new ArrayDemo2();
    }
}