import java.awt.*;              //Container comes from here.
import java.awt.event.*;
import javax.swing.*;           // JFRame come from here.


public class WinApp extends JFrame
{
    Container c;
    JButton jbtnClick, jbtnClear;
    JTextField jtfMsg;
    
    public WinApp()
    {
        super("Swing Application");
        setSize(1280,800);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c = getContentPane();
        c.setLayout(null);      //Absolute Positioning.
        
        ClickHandler ch1;
        ClearHandler ch2;
        jbtnClick = new JButton("Click");
        jbtnClick.setBounds(50,50,80,25);
        c.add(jbtnClick);
        ch1 = new ClickHandler();
        jbtnClick.addActionListener(ch1);
        
        jtfMsg = new JTextField();
        jtfMsg.setBounds(135,50,200,25);
        c.add(jtfMsg);
        
        jbtnClear = new JButton("Clear");
        jbtnClear.setBounds(340,50,80,25);
        c.add(jbtnClear);
        ch2 = new ClearHandler();
        jbtnClear.addActionListener(ch2);
        
        setVisible(true);
        //DONOT ADD COMPONENTS HERE
        
    }
    
    public static void main(String args[])
    {
        WinApp app = new WinApp();
    }
    
    //Inner Classes
    class ClickHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            jtfMsg.setText("Hello World");
        }
    }
    
    class ClearHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            jtfMsg.setText("");
        }
    }
    //End of Inner Classes
}

