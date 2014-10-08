import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class WinAppMisc extends JFrame
{
    Container c;
    JButton jbtnBall, jbtnOff,jbtnBin,jbtnHex;
    JTextField jtfOff, jtfNumber, jtfConvertedNumber;
    
    public WinAppMisc()
    {
        super("Number system Convertor");
        setSize(680,150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c = getContentPane();
        c.setLayout(null);
        
        jbtnBall = new JButton(".");
        jbtnBall.setBounds(20,50,25,25);
        c.add(jbtnBall);
        
        jbtnOff = new JButton("Off");
        jbtnOff.setBounds(50,50,25,25);
        c.add(jbtnOff);
        
        
        jtfOff = new JTextField("Press 2 Off");
        jtfOff.setBounds(80,50,90,25);
        c.add(jtfOff);
        
        jtfNumber = new JTextField();
        jtfNumber.setBounds(175,50,100,25);
        c.add(jtfNumber);
        
        jbtnBin = new JButton("Bin");
        jbtnBin.setBounds(280,50,50,25);
        c.add(jbtnBin);
        
        jbtnHex = new JButton("Hex");
        jbtnHex.setBounds(335,50,50,25);
        c.add(jbtnHex);
        
        jtfConvertedNumber = new JTextField();
        jtfConvertedNumber.setBounds(390,50,270,25);
        c.add(jtfConvertedNumber);
        
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        WinAppMisc app= new WinAppMisc();
    }
}