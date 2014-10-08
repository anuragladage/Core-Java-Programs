import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MacCalc extends JFrame
{
    Container c;
    JButton jbtnAdd, jbtnSubtract, jbtnMultiply,jbtnDivision, jbtnEquals;
    JTextField jtfFirstNumber, jtfSecondNumber,jtfResult;
    char ch;
    String s1,s2;
    int n1,n2,n3;
    
    public MacCalc()
    {
        super("Mac Calculator");
        setSize(220,250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c = getContentPane();
        c.setLayout(null);
    
        AddHandler ah1;
        SubHandler sh1;
        MulHandler mh1;
        DivHandler dh1;
        EqualsHandler eh1;
        
        
        jtfFirstNumber = new JTextField("Enter First Number here");
        jtfFirstNumber.setBounds(20,30,175,25);
        c.add(jtfFirstNumber);
        
        jbtnAdd = new JButton("+");
        jbtnAdd.setBounds(20,60,40,25);
        c.add(jbtnAdd);
        ah1 = new AddHandler();
        jbtnAdd.addActionListener(ah1);
        
        jbtnSubtract = new JButton("-");
        jbtnSubtract.setBounds(65,60,40,25);
        c.add(jbtnSubtract);
        sh1 = new SubHandler();
        jbtnSubtract.addActionListener(sh1);
        
        jbtnMultiply = new JButton("*");
        jbtnMultiply.setBounds(110,60,40,25);
        c.add(jbtnMultiply);
        mh1 = new MulHandler();
        jbtnMultiply.addActionListener(mh1);
        
        jbtnDivision = new JButton("/");
        jbtnDivision.setBounds(155,60,40,25);
        c.add(jbtnDivision);
        dh1 = new DivHandler();
        jbtnDivision.addActionListener(dh1);
        
        jtfSecondNumber = new JTextField("Enter Second Number");
        jtfSecondNumber.setBounds(20,90,175,25);
        c.add(jtfSecondNumber);
        
        jbtnEquals = new JButton("=");
        jbtnEquals.setBounds(85,120,40,25);
        c.add(jbtnEquals);
        eh1 = new EqualsHandler();
        jbtnEquals.addActionListener(eh1);
        
        jtfResult = new JTextField();
        jtfResult.setBounds(20,150,175,25);
        c.add(jtfResult);
        
        setVisible(true);
    }
    
    public static void main(String args[])
    {
        MacCalc calcApp = new MacCalc();
    }
    
    //Inner Classes
    class AddHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ch = '+';
        }
    }
    
    class SubHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ch = '-';
        }
    }
    
    class MulHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ch = '*';
        }
    }
    
    class DivHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ch = '/';
        }
    }
    
    class EqualsHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            s1 = jtfFirstNumber.getText();
            s2 = jtfSecondNumber.getText();
            if(s1.equals("") || s2.equals(""))
            {
                jtfResult.setText("Missing Operator");
                return;
            }
            
            n1 = Integer.parseInt(s1);
            n2 = Integer.parseInt(s2);
            
            switch(ch)
            {
                case '+':
                    n3 = n1 + n2;
                    jtfResult.setText("" + n3);
                    break;
                
                case '-':
                    n3 = n1 - n2;
                    jtfResult.setText("" + n3);
                    break;
                
                case '*':
                    n3 = n1*n2;
                    jtfResult.setText("" + n3);
                    break;
                
                case '/':
                    n3 = n1/n2;
                    jtfResult.setText("" + n3);
                    break;
            }
        }
    }
}
